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
<c:url  value="/Page1.jsp" var="UrlInfo">
	<c:param name="id"  value="1001"/>
	<c:param name="loc"  value="Hyderabad"/>
</c:url>

<h2>${UrlInfo }</h2>
<h2><c:out value="${UrlInfo }" /></h2>
<c:redirect url="../${UrlInfo }" />


</body>
</html>