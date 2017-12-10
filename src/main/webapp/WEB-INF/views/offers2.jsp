<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
</head>
<body>
	<c:set var="sum6" value="0" />
	<c:set var="sum7" value="0" />
	<c:set var="sum8" value="0" />
	<c:set var="sum9" value="0" />
	<c:set var="sum10" value="0" />
		<c:forEach var="offer6" items="${offers6}">
			<c:set var="sum6" value="${sum + offer6.grade}" />
			
			
		</c:forEach>
		<c:forEach var="offer7" items="${offers7}">
			<c:set var="sum7" value="${sum2 + offer7.grade}" />
			
			
		</c:forEach>
		<c:forEach var="offer8" items="${offers8}">
			<c:set var="sum8" value="${sum3 + offer8.grade}" />
			
		
		</c:forEach>
		<c:forEach var="offer9" items="${offers9}">
			<c:set var="sum9" value="${sum4 + offer9.grade}" />
			
		
		</c:forEach>
		<c:forEach var="offer10" items="${offers10}">
			<c:set var="sum10" value="${sum5 + offer10.grade}" />
			
			
		</c:forEach>
		<table class="formtable">
		<tr>
			<td>교필</td>
			<td>핵교</td>
			<td>전지</td>
			<td>전기</td>
			<td>전선</td>
			<td>총학점</td>
		</tr>
		<tr>
			<td><c:out value="${sum6}" /></td>
			<td><c:out value="${sum7}" /></td>
			<td><c:out value="${sum8}" /></td>
			<td><c:out value="${sum9}" /></td>
			<td><c:out value="${sum10}" /></td>
			<td></td>
		</tr>
		
		</table>

</body>
</html>