<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Hosp_d" method="post">
hId:<input type="hidden" name="hid" value="${Hosp.hid}"><br><br>
hname:<input type="text" name="hname" value="${Hosp.hname}"><br><br>
hadd<input type="text" name="hadd" value="${Hosp.hadd}"><br><br>
treatments<input type="text" name="treat" value="${Hosp.noOfTreat}"><br><br>
<input type="submit" value="editteam" name="request_type">
</form>
</body>
</html>