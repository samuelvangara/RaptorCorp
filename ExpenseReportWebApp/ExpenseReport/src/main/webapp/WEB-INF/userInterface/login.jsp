<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expense Report</title>
</head>
<body>
<div>
<label>First Name</label>
<form:input path="firstName" id="firstName"/>

</div>
<div>
<button onclick="register" title="Register" value="Submit">Submit</button>
</div>
</body>
</html>