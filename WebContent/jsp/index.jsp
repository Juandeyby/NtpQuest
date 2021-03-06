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
	<nav class="grey lighten-1 center" role="navigation">
		<div class="nav-wrapper container">
			<a id="logo-container" href="#" class="brand-logo">NtpQuest</a>
		</div>
	</nav>
	<div class="section no-pad-bot" id="index-banner">
		<div class="container">
			<br> <br>
			<h1 class="header center orange-text">NtpQuest</h1>
			<div class="row center">
				<h5 class="header col s12 light">Sistema de organizacion de
					documentos para la acreditacion NTP/ISO 12207</h5>
			</div>
		</div>
	</div>


	<div class="container">
		<div class="section">

			<div class="row">
				<form class="col s12" action="verificar" method="post">
					<div class="row">
						<div class="input-field col s4 offset-s4">
							<input id="first_name" type="text" name="name" class="validate"> <label
								for="first_name">Usuario</label>
						</div>
						<div class="input-field col s4 offset-s4">
							<input id="password" type="password" name="password" class="validate"> <label
								for="password">Contraseņa</label>
						</div>
						<div class="input-field col s4 offset-s4">
							<a href="registro">Registrarse</a>
						</div>
						<div class="input-field col s4 offset-s4">
							<button class="btn waves-effect waves-light grey darken-1" type="submit"
								name="action">Ingresar</button>
						</div>
					</div>
				</form>
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
