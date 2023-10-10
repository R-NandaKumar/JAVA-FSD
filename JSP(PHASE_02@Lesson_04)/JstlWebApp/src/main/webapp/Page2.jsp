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

<c:forEach var="x"  begin="1" end="10">
	<p>
		Value : <c:out value="${x}" />
	</p>
</c:forEach>

<%
	List<String>  strlst = new ArrayList<String>();
	strlst.add("Lavanya");
	strlst.add("Priya Bhavani");
	strlst.add("Sravani");
	strlst.add("Sahasra");
	strlst.add("Pravasthi");
	
	pageContext.setAttribute("strlt", strlst);
%>
<hr />
<c:forEach  items="${strlt}" var="str">
<p>
	<c:out value="${str}" />
</p>
</c:forEach>

<c:redirect  url="Page1.jsp" />
</body>
</html>