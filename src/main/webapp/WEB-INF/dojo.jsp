<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dojos</title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
    		<div class="column">
    		<h1 style="align-center">The Ninjas of the ${dojo.name} DOJO</h1>
   	 		</div>
   	 		<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">First Name</th>
			      <th scope="col">Last Name</th>
			      <th scope="col">Age</th>
			    </tr>
			  </thead>
			  <tbody>
			    <c:forEach var="ninja" items="${ninjas}">
			    <tr>
			      <td>${ninja.firstname}</td>
			      <td>${ninja.lastname}</td>
			      <td>${ninja.age}</td>
			    </tr>
			    </c:forEach>
			  </tbody>
			</table>
			   	 		
			    	</div>
					<div class="row">
					<h2><a href="/">Home</a></h2>
					</div>
				</div>
			    
</body>
</html>