<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
    <%@ page import="Entity.Hosp" %>
    <%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Hospital</title>
</head>
<body>
<div>
<div class="container-fluid">
	<nav class="bg-info"> 	
		<div class="Conatiner" style="background-color:Grey">
		&nbsp;&nbsp;
		<center>
		<h1> Welcome to Advance Java</h1>
		<marquee width="60%" direction="right" height="100px">
			<h1>Here are the top Hospital deatils with top treatments</h1>
			</marquee>
		</ul>
	</div>
    </div>
	</nav>
<br></br>
<br></br>
<br></br>
<form action="Hosp_d" method="post">
<div class="container">
<br></br>
<h3>Welcome To Top Hospitals Deatils</h3>
<br></br>
<table class="table table-bordered">
<thead class="bg-info">
<tr>
<th>Hospital_ID</th>
<th>Hospital_Name</th>
<th>Hospital_Address</th>
<th>Type Of Treatments</th>
</tr>
</thead>
<c:forEach var="h" items="${requestScope.hosp}">
				   <tr class="bg-primary">
						<td><input type="radio" value="${h.hid}" name="id">${h.hid}</td>
						<td>${h.hname}</td>
						<td>${h.hadd}</td>
						<td>${h.noOfTreat}</td>	
					</tr>
				</c:forEach>
<tbody class="bg-secondary">
</tbody>
</table>
</div>
<center>
<a href="Add1.html" role="button" 
class="btn btn-info btn-lg">Add</a>
&nbsp;&nbsp;&nbsp;
<button type="submit" value="updateteam" 
class="btn btn-primary btn-lg" name="request_type">Update</button>
&nbsp;&nbsp;&nbsp;
<button type="submit" value="deleteteam" 
class="btn btn-danger btn-lg" name="request_type">Delete</button>
	</div>
</center>
</form>
</body>
</html>