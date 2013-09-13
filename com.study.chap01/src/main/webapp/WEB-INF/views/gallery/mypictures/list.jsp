<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>
	List Page
	<br>${group}
	<br>${type}
	<c:forEach var="qlist" items="${qList }">
		<li><c:out value="${qlist.name }"/>,
		 <c:out value="${qlist.addr }"/> ,
		 <c:out value="${qlist.sex }"/> , 
		 <c:out value="${qlist.age }"/></li>
	</c:forEach>
	
</h1>

</body>
</html>