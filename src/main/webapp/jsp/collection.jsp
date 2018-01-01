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
	<div class="container">
		<div class="section">
			<div class="row">
				<form class="col s5 offset-s2">
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
					<form class="col s5" action="#">
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

<ul id="nav-mobile" class="side-nav fixed" style="transform: translateX(0%);">	
        <li class="logo"><a id="logo-container" href="/" class="brand-logo">
            <object id="front-page-logo" type="image/svg+xml" data="img/logo.svg">Your browser does not support SVG</object></a></li>
            <br>
        <li class="bold"><a href="about.html" class="waves-effect waves-teal">About</a></li>
        <li class="bold"><a href="getting-started.html" class="waves-effect waves-teal">Getting Started</a></li>
        <li class="no-padding">
          <ul class="collapsible collapsible-accordion">
            <li class="bold"><a class="collapsible-header waves-effect waves-teal">CSS</a>
              <div class="collapsible-body">
                <ul>
                  <li><a href="color.html">Color</a></li>
                </ul>
              </div>
            </li>
            <li class="bold"><a class="collapsible-header waves-effect waves-teal">Components</a>
              <div class="collapsible-body">
                <ul>
                  <li><a href="badges.html">Badges</a></li>
                </ul>
              </div>
            </li>
            <li class="bold active"><a class="collapsible-header active waves-effect waves-teal">JavaScript</a>
              <div class="collapsible-body" style="display: block;">
                <ul>
                  <li><a href="carousel.html">Carousel</a></li>
                  <li class="active"><a href="collapsible.html">Collapsible</a></li>
                  <li><a href="dialogs.html">Dialogs</a></li>
                  <li><a href="dropdown.html">Dropdown</a></li>
                  <li><a href="feature-discovery.html">FeatureDiscovery</a></li>
                </ul>
              </div>
            </li>
          </ul>
        </li>
        <li class="bold"><a href="mobile.html" class="waves-effect waves-teal">Mobile</a></li>
        <li class="bold"><a href="showcase.html" class="waves-effect waves-teal">Showcase</a></li>
        <li class="bold"><a href="themes.html" class="waves-effect waves-teal">Themes</a></li>
      </ul>


	<!--  Scripts-->
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/materialize.js"></script>
	<script src="js/init.js"></script>

</body>
</html>
