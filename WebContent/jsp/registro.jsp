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
<script type="text/javascript">
    $(document).ready(function(){
        $('input[type="file"]').change(function(e){
            var fileName = e.target.files[0].name;
            alert('The file "' + fileName +  '" has been selected.');
        });
    });
</script>
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
				<form class="col s6" action="/NtpQuest/dataRegister" method="post">
					<div class="row">
						<h5 class="header col s12 light">Modificar</h5>
						<div class="input-field col s12">
							<input id="enterprise_name" name="enterprise_name" type="text" class="validate"> <label
								for="first_name">Nombre de empresa</label>
						</div>
						<div class="input-field col s12">
							<input id="madurity_level" name="madurity_level" type="text" class="validate"> <label
								for="first_name">Nivel de madurez</label>
						</div>
						<div class="input-field col s12">
							<input id="user" name="user" type="text" class="validate"> <label
								for="first_name">Usuario</label>
						</div>
						<div class="input-field col s12">
							<input id="password" name="password" type="password" class="validate"> <label
								for="password">Contraseña</label>
						</div>
						<div class="input-field col s12">
							<input id="password_secure" name="password_secure" type="password" class="validate"> <label
								for="password">Otra vez contraseña</label>
						</div>
						<div class="input-field col s12">
							<button class="btn waves-effect waves-light grey darken-1" type="submit"
								name="action">Registrar</button>
						</div>
					</div>
				</form>
				<div class="row">
					<form class="col s6" action="#">
						<div class="file-field input-field">
							<div class="btn grey darken-1">
								<span>Logo</span> <input type="file" name="rtlvl" >
							</div>
							<div class="file-path-wrapper">
								<input class="file-path validate" type="text">
							</div>
						</div>
						<img class="materialboxed" width="250" src="../img/sample-1.jpg">
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
