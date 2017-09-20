'use strict';
App.factory('TaskFactory', function($http){
	var taskFactory={};
	var tasks = [/*{id: 1, name: "Rakesh", description: "Test", dateCreated:"2017/JAN/02", finished: false
},{ id: 2, name: "Gelhi", description: "Test", dateCreated:"4/May/2017", finished: true }*/];
	taskFactory.getTasks = function(){
		$http({
			method: 'GET',
			url: 'http://localhost:9090/all-tasksR'
		}).
			then(function mySucces(response) {
				tasks = response.data;
			},
			function myError(response) {
				errorMsg = "Connection Problem";
			}) ;
		return tasks;
	};
	return taskFactory;
});
