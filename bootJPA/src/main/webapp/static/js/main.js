'use strict';
var App = angular.module('App', []);
App.factory('TaskFactory', function ($http) {
	var taskFactory = {};
	var tasks = [];
	taskFactory.getTasks = function () {
		console.log("factory getTasks Enter");
		// $http.get('http://localhost:9090/all-tasksR').success(function(response) {
		// 	console.log("factory getTasks then " + response);
		// 	tasks = response;
		// });
		$http({
			method: 'GET',
			url: 'http://localhost:9090/all-tasksR',
			dataType: 'jsonp'
		}).
			then(function mySucces(response) {
				console.log("factory getTasks then "+ response);
				tasks = response.data;
			},
			function myError(response) {
				var errorMsg = "Connection Problem";
			}) ;
		return tasks;
	};
	taskFactory.deleteTask = function (id) {
		$http({
			method: 'DELETE',
			url: 'http://localhost:9090/delete-taskR/' + id

		}).
		then(function mySucces(response) {
				console.log("factory deleteTask then " + response);
				console.log(response);
			},
			function myError(response) {
				console.log(response);
			});

	};
	taskFactory.saveTask = function (task) {
		$http({
			method: 'POST',
			url: 'http://localhost:9090/save-taskR/',
			data: task
		}).
		then(function mySucces(response) {
				console.log("factory saveTask then " + response);
				console.log(response);
			},
			function myError(response) {
				console.log(response);
			});
	};
	return taskFactory;
});
App.controller('TaskController', function ($scope, TaskFactory) {
	$scope.tasks = [];
	init();

	function init() {
		console.log("init()");
	}

	$scope.getTasks = function () {
		console.log("Controller getTasks enter");
		$scope.tasks = TaskFactory.getTasks();
		console.log("Controller getTasks exit");
	};
	$scope.deleteTask = function (id) {
		console.log("Controller deleteTask Enter" + id);
		TaskFactory.deleteTask(id);
		$scope.tasks = TaskFactory.getTasks();
		console.log("Controller deleteTask Exit");
	};
	$scope.saveTask = function () {
		console.log("SaveTask Controller Enter");
		var task = {
			name: $scope.name,
			description: $scope.description
		};
		TaskFactory.saveTask(task);
		$scope.tasks = TaskFactory.getTasks();
		console.log("SaveTask Controller Exit");
	};
});

// var App = angular.module('App', [ /*$route, $http*/ ]);
// /*App.config(function ($routeProvider) {
// $routeProvider
// .when('/',{
// controller:'SimpleController',
// templateUrl:'partials/view1.html'
// })
// .when('/view2',{
// controller:'SimpleController',
// templateUrl:'partials/view2.html'
// })
// .otherwise({redirectTo: '/'});
// });*/
