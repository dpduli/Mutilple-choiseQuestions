<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>The Materialize Form Example</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/css/materialize.min.css">
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/angular_material/0.11.2/angular-material.min.css" />
<script type="text/javascript"
	src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="libs/js/angular.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-animate.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-aria.min.js"></script>
<script src="test.js"></script>
<style type="text/css">
.text-center {
	text-align: center;
}

.space-bot {
	margin-bottom: 25px;
}

.space-top {
	margin-top: 25px;
}

h1 {
	color: Black;
	font-family: 'Roboto';
	text-transform: uppercase;
	font-weight: 2000;
	font-size: 25px;
	text-align: center;
}

.container {
	max-width: 400px;
	max-height: 50px;
	margin-top: 10px;
}

.alert-danger {
	text-align: center;
}
/*
      .signup-screen {
          padding: 20px;
          padding-bottom: 40px;
          border-radius: 5px;
          background-color: #2c3940;
          box-shadow: 0 1px 6px rgba(0,0,0,.3);
          color: white;
      }
      */
.btn {
	border-radius: 2px;
}

.cancel {
	background-color: #df405a;
}

.done {
	background-color: #5CAB7D;
}

.done:hover {
	background-color: #6dc793;
}

.done:focus {
	background-color: #6dc793;
}

.cancel:hover {
	background-color: #f0435f;
}

.cancel:focus {
	background-color: #f0435f;
}

.alert {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 2px;
	border-color: #e85a71;
	background-color: #e85a71;
	color: white;
}

.help-block {
	font-size: 12px;
	color: white
}
</style>
</head>
<body>
	<div class="container" ng-app="UserApp"
		ng-controller="UserRegisterController">
		<div style="text-align: center;" class="space-bot text-center">
			<h1>Login Form</h1>
			<div class="divider"></div>
		</div>
		<div class="signup-screen">
			<form class="col s12 form-register" action="loginProcess" method="POST">

				<div class="input-field col s12">
					<i class="material-icons prefix">perm_identity</i> <input
						id="last_name" type="text" class="validate"
						ng-model="registerForm.userName" required> <label
						for="last_name">User Name</label>
				</div>


				<div class="input-field col s12">
					<i class="material-icons prefix">vpn_key</i> <input id="password"
						type="password" class="validate" ng-model="registerForm.password"
						required> <label for="password">Password</label>
				</div>
				<br/>

				<div class="form-group form-md-line-input">
					<div class="col-md-offset-2 col-md-4">
						<div class="md-checkbox-list">
							<div class="md-checkbox">
								<input type="checkbox" id="checkbox11111" class="md-check">
								<label for="checkbox11111"> <span></span> <span
									class="check"></span> <span class="box"></span> Remember me
								</label>
								
							</div>
							
						</div>
					</div>
				</div>
				<br />

				<div class="row">
					<div style="text-align: center;">
						<button ng-disabled="form-register.$invalid" type="submit"
							class="waves-effect waves-light btn done">
							<i class="material-icons left">done</i> Done
						</button>
						<button type="button" class="waves-effect waves-light btn cancel"
							ng-click="cancel()">
							<i class="material-icons left">clear</i>Cancel
						</button>
					</div>
				</div>
				<br/>
				<div class="row">
					<div style="text-align: center;">
						<a href="register" class="btn btn-primary btn-xl page-scroll">Register new account?</a>
					</div>
				</div>
				
				

			</form>
		</div>
	</div>
	<div>
</body>
</html>