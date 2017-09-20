<!DOCTYPE HTML>

<html ng-app="App">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat,01 Dec 2001 00:00:00 GMT">
<title>Task manager | Home</title>
<link href="static/css/bootstrap.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">

</head>

<body ng-controller="TaskController">
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">BootSample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-task">New Task</a></li>
					<li><a href="all-tasks">All Task</a></li>
				</ul>
			</div>
		</div>
	</div>

	<!--<div class="container" id="homeDiv">
					<div class="jumbotron text-center">
						<h1>Welcome To Task Manager</h1>
					</div>
				</div>-->

	<div class="container text-center" id="tasksDiv">
		<h3>My Tasks</h3>
		<hr />
		{{errorMsg}}
		<button ng-click="getTasks()">Get Task</button>
		<button ng-click="deleteTask(8)">Delete Task</button>
		<div class="table-responsive">
			<table class="table table-striped table-bordered text-left">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Description</th>
						<th>Date Created</th>
						<th>Finished</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="task in tasks">
						<td>{{task.id }}</td>
						<td>{{task.name }}</td>
						<td>{{task.description }}</td>
						<td><fmt:formatDate value="{{task.dateCreated }}"
								pattern="YYYY-MMM-DD" /></td>
						<td>{{task.finished }}</td>
						<td><a><span class="glyphicon glyphicon-pencil"></span>
						</a></td>
						<td><a ng-href="deleteTask( {{task.id}} )"><span
								class="glyphicon glyphicon-trash"></span> </a></td>
					</tr>
				</tbody>
			</table>

		</div>
	</div>
	<div class="container text-center">
		<h3>Manage Task</h3>
		<hr>
		<form class="form-horizontal" method="post" ng-submit="saveTask()">
			<input type="hidden" name="id" ng-model="id">
			<div class="form-group">
				<label class="control-label col-md-3">Name</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="name" ng-model="name">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Description</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="description"
						ng-model="description">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Finished</label>
				<div class="col-md-7">
					<input type="radio" class="col-sm-1" name="finished" value="true">
					<div class="col-sm-1">Yes</div>
					<input type="radio" class="col-sm-1" name="finished" value="false"
						checked="checked">
					<div class="col-sm-1">No</div>
				</div>
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-primary" value="Save">
			</div>
		</form>
	</div>

	<!--<script src="../../static/js/angular-route.min.js"></script>-->
	<script src="static/js/angular1.4.min.js"></script>
	<!-- <script src="../../static/js/factory.js"></script> -->
	<script src="static/js/main.js"></script>
	<script src="static/js/bootstrap.js"></script>
	<script src="static/js/jquery.min.js"></script>
</body>

</html>
