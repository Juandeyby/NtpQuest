<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta http-equiv="content-type"
	content="application/xhtml+xml; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0" />
<title>Starter Template - Materialize</title>

<!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="css/materialize.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<link href="css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
</head>
<body>
	<nav class="grey lighten-1  center" role="navigation">
		<div class="nav-wrapper container">
			<a id="logo-container" href="#" class="brand-logo">NtpQuest</a>
		</div>
	</nav>
	<div class="container">
		<div class="section">
			<div class="row">
				<form class="col s6">
					<div class="row">
						<h5 class="header col s12 light">Registro</h5>
						<div class="input-field col s12">
							<input id="first_name" type="text" class="validate"> <label
								for="first_name">Nombre de empresa</label>
						</div>
						<div class="input-field col s12">
							<input id="first_name" type="text" class="validate"> <label
								for="first_name">Nivel de madurez</label>
						</div>
						<div class="input-field col s12">
							<input id="first_name" type="text" class="validate"> <label
								for="first_name">Usuario</label>
						</div>
						<div class="input-field col s12">
							<input id="password" type="password" class="validate"> <label
								for="password">Contraseña</label>
						</div>
						<div class="input-field col s12">
							<input id="password" type="password" class="validate"> <label
								for="password">Otra vez contraseña</label>
						</div>
						<div class="input-field col s12">
							<button class="btn waves-effect waves-light grey darken-1"
								type="submit" name="action">Registrar</button>
						</div>
					</div>
				</form>
				<div class="row">
					<form class="col s2" action="guardarImagen"
						enctype="multipart/form-data" id="fileUploadForm" method="post">
						<input type="file" name="uploadFile" /> <br />
						<br /> <input type="submit"  id="btnSubmit" value="Subir Logo" />
						<br /><br />
						<div id="result">
							
						</div>
					</form>
				</div>
			</div>
		</div>
		<br> <br>
	</div>


	<!--  Scripts-->
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/materialize.js"></script>
	<script src="js/init.js"></script>

</body>
</html>
