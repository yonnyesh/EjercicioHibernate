<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>

	<h1>Alumno Registro</h1>
	<form:form action="guardarAlumno" method="post" commandName="alumno">
	
			<table>
			<tr>
				<td>Nombre</td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td>Apellido</td>
				<td><form:input path="apellido" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Guardar Alumno"></td>
			</tr>
		</table>
		
	</form:form>
	<a href="mostrarLista"> Mostrar Lista </a>
</body>
</html>