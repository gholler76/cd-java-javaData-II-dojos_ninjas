<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ninjas</title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
    		<div class="column">
    		<h1>NEW NINJA</h1>
    		<form:form class="form-group" action="createNinja" method="POST" modelAttribute="ninja">
    		<form:label class="input-control" path="dojo">Dojo: </form:label>
    		<form:select class="input-control" path="dojo">
    			<c:forEach items="${dojos}" var="dojo">
    			<option value="${dojo.id}">${dojo.name}</option>
    			</c:forEach>
    		</form:select>
    		<form:label class="input-control" path="firstname">First Name: </form:label>
    		<form:input class="input-control" path="firstname" type="text"></form:input>
    		<form:label class="input-control" path="lastname">Last Name: </form:label>
    		<form:input class="input-control" path="lastname" type="text"></form:input>
    		<form:label class="input-control" path="age">Age: </form:label>
    		<form:input class="input-control" path="age" type="text"></form:input>
    		<form:button type="submit" class="btn btn-warning lg">Submit</form:button>
    		</form:form>
    		
   	 		</div>
    	</div>
	</div>
    
</body>
</html>