<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String user = (String) request.getAttribute("userValide");
%>

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
			<ul class="right hide-on-med-and-down">
				<li><a>Cerrar Sesión</a></li>
			</ul>
		</div>
	</nav>


	<!-- Page Layout here -->
	<div class="row">
		<div class="col s3">

			<ul class="collapsible" data-collapsible="accordion">
				<!-- Empieza Nivel 1-->
				<li>
					<div class="collapsible-header grey lighten-1">
						<i class="material-icons">filter_drama</i>Proceso Principal
					</div>
					<div class="collapsible-body">
						<div class="row">
							<div class="col s12 m12">
								<ul class="collapsible" data-collapsible="accordion">
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Aquisición
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Adquisición de
																un sistema
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="documento" class="collection-item">Documento</a>
																	<a href="#!" class="collection-item">Diagrama de flujo</a>
																	<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_aquisicion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Lanzamiento de
																proyecto
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> 
																	<a href="#!" class="collection-item">Diagrama deflujo</a> 
																	<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_lanzamiento" class="collection-item">Documento</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Actualizar
																contrato con el cliente
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> 
																	<a href="#!" class="collection-item">Diagrama deflujo</a> 
																	<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_contrato" class="collection-item">Documento</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Suministro
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Petición de
																proyecto y orden de ejecucion
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a>
																	<a href="#!" class="collection-item">Diagrama de flujo</a> 
																	<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_peticion" class="collection-item">Documento</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Planificación
																del proyecto
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> 
																	<a href="#!" class="collection-item">Diagrama de flujo</a> 
																	<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_planificacion" class="collection-item">Documento</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Planificación
																de reuniones de seguimiento y coordinacion
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> 
																	<a href="#!" class="collection-item">Diagrama de flujo</a>
																	<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_planificacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Acciones
																correctivas y preventivas
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> 
																	<a href="#!" class="collection-item">Diagrama de flujo</a>
																	<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_acciones" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Entrega final
																del proyecto
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_entrega" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Desarrollo
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Recepción de
																solicitud de software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_recepcion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Elaboración de
																plan de proyecto
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_elaboraccionPlan" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Educcion de
																requerimientos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_educcion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Elicitacion de
																requerimientos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_elicitacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Especificacion
																de requerimientos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_especificacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Actualizar
																requerimientos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_actualizar" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Validacion de
																requerimientos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_validacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Diseño de
																arquitectura de software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_diseno" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Construccion
																de software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_construccion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Integracion de
																software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_integracion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Elaboración
																pruebas de software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_elaboracionPruebas" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Ejecucion de
																pruebas de software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a><a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_ejecucionPruebas" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Instalacion de
																software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_instalacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Elaboración de
																manuales de usuario
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_elaboracionManuales" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Capacitación
																de usuario
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_capacitacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Operación
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Elaboración
																del documento de operación
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_elaboracionOperacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Pruebas de
																operación
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_pruebasOperacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Despliegue
																para la operación del sistema
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_despliegueOperacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Creación de
																acceso a los servicios del sistema
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_"creacionAcceso class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Atención al
																usuario
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_AtencionUsuario" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Mantenimiento
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Implementación
																del proceso
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_implementacionProcesos" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Análisis de
																problemas y modificaciones
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_analisis" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Implementación
																de las modificaciones
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_implementacionModificaciones" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Revisión/aceptación
																del mantenimiento.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_aceptacionMantenimiento" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Migración
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_Migracion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Retirada del
																software
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_retiradaSoft" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
								</ul>
							</div>
						</div>
					</div>
				</li>
				<!-- Termina Nivel 1-->



				<!-- Empieza Nivel 1-->
				<li>
					<div class="collapsible-header grey lighten-1">
						<i class="material-icons">filter_drama</i>Procesos de apoyo
					</div>
					<div class="collapsible-body">
						<div class="row">
							<div class="col s12 m12">
								<ul class="collapsible" data-collapsible="accordion">
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Documentación
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Implementación
																del proceso
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_ImplementacionProceso" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Diseño y
																desarrollo
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_disenoDesarrollo" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Producción
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_produccion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Mantinimiento
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a><a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_mantenimiento" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Gestión de la
											configuración
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Implementación
																del proceso
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_implemetacionProceso" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Identificación
																de la configuración
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a><a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_identificacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Control de la
																configuración
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_controlConfig" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Determinación
																del estado de la configuración.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_determinacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Evaluación de
																la configuración.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_evaluacionConfig" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Gestión de
																releases y entrega
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_getionRelease" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Verificación
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Implementación
																del proceso
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_implementacionproces" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Verificacion
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_verificacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Validación
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Implementación
																del proceso
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_implemntacionProces" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Validación
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_vaidacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Auditoría
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Planificación
																de Auditorías
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_planAuditoria" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Realización de
																Auditorías
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_realizacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Subcontratación
																de realización de auditorías
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_subcontratacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Creación de
																acceso a los servicios del sistema
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_creacionAcceso" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Solución de
											problemas
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Control de
																problemas y no conformidades
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_controlProblemas" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Acciones
																correctivas para la solución de problemas
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_accionesCorrectivas" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Acciones
																preventivas para la solución de problemas
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_accionesPreventivas" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
								</ul>
							</div>
						</div>
					</div>
				</li>
				<!-- Termina Nivel 1-->




				<!-- Empieza Nivel 1-->
				<li>
					<div class="collapsible-header grey lighten-1">
						<i class="material-icons">filter_drama</i>Procesos de
						organizativos
					</div>
					<div class="collapsible-body">
						<div class="row">
							<div class="col s12 m12">
								<ul class="collapsible" data-collapsible="accordion">
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Gestión
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Recolección de
																requisitos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_recoleccion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Asignación de
																recursos a los requisitos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_asignacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Mejora de
																requisitos
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_mejoraReq" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Realización de
																plan de gestión
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Implementación
																de Plan
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_implementacionPlan" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Seguimiento,
																control y evaluación.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_seguimiento" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Finalización.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_finalizacion" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Infraestructura
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Establecimiento
																del proceso
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <<a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_establecimiento" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Evaluación del
																proceso.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_evalucionProces" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Mejora del
																proceso.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_mejoraProces" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
									<!-- Empieza Nivel 2-->
									<li>
										<div class="collapsible-header grey lighten-2">
											<i class="material-icons">filter_drama</i>Recursos Humanos
										</div>
										<div class="collapsible-body">
											<div class="row">
												<div class="col s12 m12">
													<ul class="collapsible" data-collapsible="accordion">
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Necesidades
																del proceso.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_necesidadesproces" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Desarrollo del
																material de formación.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_desarrolloMat" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
														<li>
															<div class="collapsible-header grey lighten-3">
																<i class="material-icons">filter_drama</i>Evaluación del
																plan de formación.
															</div>
															<div class="collapsible-body">
																<div class="collection">
																	<a href="#!" class="collection-item">Documento</a> <a
																		href="#!" class="collection-item">Diagrama de
																		flujo</a> <a href="PlantillaGen?descrip=Proceso Principal-Adquisicion&dirdoc=plantilla_evaluacionPlanForm" class="collection-item">Plantilla</a>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</li>
									<!-- Termina Nivel 2-->
								</ul>
							</div>
						</div>
					</div>
				</li>
				<!-- Termina Nivel 1-->
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
									<button class="btn waves-effect waves-light grey darken-1"
										type="submit" name="action">Modificar</button>
								</div>
							</div>
						</form>
						<div class="row">
							<form class="col s3" action="guardarImagen"
								enctype="multipart/form-data" id="fileUploadForm" method="post">
								<input type="file" name="uploadFile" accept="image/png, .jpeg, .jpg, image/gif"/> <br />
								<br /> <input type="submit"  id="btnSubmit" value="Subir Logo" />
								<br />
								<div id="result">
								<img class="materialboxed" style="width:100%" src="logo/logo_juandeyby.png">
								</div>
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
