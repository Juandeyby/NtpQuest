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
	<nav class="grey darken-4 lighten-1 center" role="navigation">
		<div class="nav-wrapper container">
			<a id="logo-container" href="#" class="brand-logo">NtpQuest</a>
		</div>
	</nav>


	<!-- Page Layout here -->
	<div class="row">
		<div class="col s3">

			<ul class="collapsible" data-collapsible="accordion">
				<li>
					<div class="collapsible-header orange darken-4">
						<i class="material-icons">filter_drama</i>Proceso Principal
					</div>
					<div class="collapsible-body">
						<div class="row">
							<div class="col s12 m12">
								<ul class="collapsible" data-collapsible="accordion">
									<li>
										<div class="collapsible-header orange darken-3">
											<i class="material-icons">filter_drama</i>Aquisicion
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header orange darken-2">
																<i class="material-icons">filter_drama</i>Adquisicion de un sistema
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a>
																	<a href="#!" class="collection-item">Diagrama de flujo</a>
																	<a href="#!" class="collection-item">Documento</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</li>
			</ul>

		</div>

		<div class="col s9">
			<div class="container">
				<div class="section">
					<div class="row">
						<form class="col s6">
							<div class="row">
								<h5 class="header col s12 light">Modificar</h5>
								<div class="input-field col s12">
									<input id="first_name" type="text" class="validate"> <label
										for="first_name">Nombre de empresa</label>
								</div>
								<div class="input-field col s12">
									<input id="first_name" type="text" class="validate"> <label
										for="first_name">Nivel de madurez</label>
								</div>
								<div class="input-field col s12">
									<button class="btn waves-effect waves-light" type="submit"
										name="action">Modificar</button>
								</div>
							</div>
						</form>
						<div class="row">
							<form class="col s6" action="#">
								<div class="file-field input-field">
									<div class="btn">
										<span>Logo</span> <input type="file">
									</div>
									<div class="file-path-wrapper">
										<input class="file-path validate" type="text">
									</div>
								</div>
								<img class="materialboxed" width="250" src="img/sample-1.jpg">
							</form>
						</div>
					</div>
				</div>
				<br> <br>
			</div>
		</div>

	</div>

	<!--  Scripts-->
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/materialize.js"></script>
	<script src="js/init.js"></script>

</body>
</html>
