<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>Insert title here</title>
<style>
.error{
	color:red;
}
.errorblock{
	color:blue;
	background-color:yellow;
}
</style>
</head>

<body>
<a href="?Language=en">English</a>|||<a href="?Language=es">Spanish</a> || <a href="?Language=hn">Hindi</a>
<form:form commandName="goal">
	<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
<table>
	<tr>
		<td><spring:message code="setgoal.text"/></td>
		<td> <form:input path="minutes"/></td>
		<td> <form:errors path="minutes" cssClass="error"/></td>
		
	</tr>
	<tr>
		<td colspan =3	><input type="Submit" value="Enter your Goal"/></td>
	</tr>
</table>
</form:form>


</body>
</html>