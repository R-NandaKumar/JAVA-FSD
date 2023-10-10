<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Out Tag</h1>
<h2><c:out value="${'This is JSTL Session'}" /></h2>

<c:set  var="x"  value="${100.00 }"  />

<h2>X value is : <c:out value="${x}" /></h2>
<h2>X Square value is : <c:out value="${x*x}" /></h2>

<c:remove  var="x" />

<h2>X value is : <c:out value="${x}" /></h2>
<hr />
<c:set  var="sal"  value="${23000}"  />

<h2>Employee Salary is : 
<c:out value="${sal }" />
</h2>

<c:if  test="${sal>=20000 }">
	<h2 style='color:green'><c:out value="${'Employee Sal above or equl 20k'}" /></h2>
</c:if>

<c:if  test="${sal<20000 }">
	<h2 style='color:red'><c:out value="${'Employee Sal below 20k'}" /></h2>
</c:if>

</body>
</html>