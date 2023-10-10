<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set  var="sal"  value="${9000 }" />
<h2>Employee salary is : <c:out  value="${sal }" /></h2>

<c:choose>
	<c:when  test="${sal>=10000  && sal<=30000 }">
		<h2>Salary is above or equals 10K</h2>
	</c:when>
	<c:when  test="${sal>0 && sal<10000 }">
		<h2>Salary is below 10K</h2>
	</c:when>
	<c:otherwise>
		<h2>Undetermined Salary</h2>
	</c:otherwise>
</c:choose>

<c:redirect url="http://www.facebook.com" />
</body>
</html>