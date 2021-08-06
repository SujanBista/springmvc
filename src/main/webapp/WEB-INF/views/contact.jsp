<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		></script>

<title>Hello, world!</title>
</head>

<body>


	<div class="container mt-5 ">

		<h3 class="text-center">Registration Form</h3>

		<form action = "processform" method = "post">
			<div class="form-group">
				<label for="User Name">User Name</label> <input type="text"
					class="form-control" 
					id="User Name" 
					aria-describedby="emailHelp"
					placeholder="Enter here"
					name = user_name>					
			</div>

			<div class="form-group">
				<label for="pass word">User Password</label> <input type="password"
					class="form-control" id="User password"
					aria-describedby="emailHelp" placeholder="Enter here"
					 name = "user_password">
			</div>

			<div class="container text-center">
				<button type="submit" class="btn-success">Sign up</button>
			</div>

		</form>

	</div>

	
</body>
</html>

