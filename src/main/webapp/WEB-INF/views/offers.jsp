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
	<c:set var="sum" value="0" />
	<c:set var="sum2" value="0" />
	<c:set var="sum3" value="0" />
	<c:set var="sum4" value="0" />
	<c:set var="sum5" value="0" />
		<c:forEach var="offer" items="${offers}">
			<c:set var="sum" value="${sum + offer.grade}" />
			<c:set var="year" value="${offer.year}"/>
			<c:set var="semester" value="${offer.semester}"/>
		</c:forEach>
		<c:forEach var="offer2" items="${offers2}">
			<c:set var="sum2" value="${sum2 + offer2.grade}" />
			<c:set var="year2" value="${offer2.year}"/>
			<c:set var="semester2" value="${offer2.semester}"/>
		</c:forEach>
		<c:forEach var="offer3" items="${offers3}">
			<c:set var="sum3" value="${sum3 + offer3.grade}" />
			<c:set var="year3" value="${offer3.year}"/>
			<c:set var="semester3" value="${offer3.semester}"/>
		</c:forEach>
		<c:forEach var="offer4" items="${offers4}">
			<c:set var="sum4" value="${sum4 + offer4.grade}" />
			<c:set var="year4" value="${offer4.year}"/>
			<c:set var="semester4" value="${offer4.semester}"/>
		</c:forEach>
		<c:forEach var="offer5" items="${offers5}">
			<c:set var="sum5" value="${sum5 + offer5.grade}" />
			<c:set var="year5" value="${offer5.year}"/>
			<c:set var="semester5" value="${offer5.semester}"/>
		</c:forEach>
		<table class="formtable">
		<tr>
			<td>년도</td>
			<td>학기</td>
			<td>이수 학점</td>
			<td>상세보기</td>
		</tr>
		<tr>
			<td><c:out value="${year}" /></td>
			<td><c:out value="${semester}" /></td>
			<td><c:out value="${sum}" /></td>
			<td></td>
		</tr>
		<tr>
			<td><c:out value="${year2}" /></td>
			<td><c:out value="${semester2}" /></td>
			<td><c:out value="${sum2}" /></td>
			<td></td>
		</tr>
		<tr>
			<td><c:out value="${year3}" /></td>
			<td><c:out value="${semester3}" /></td>
			<td><c:out value="${sum3}" /></td>
			<td></td>
		</tr>
		<tr>
			<td><c:out value="${year4}" /></td>
			<td><c:out value="${semester4}" /></td>
			<td><c:out value="${sum4}" /></td>
			<td></td>
		</tr>
			<tr>
			<td><c:out value="${year5}" /></td>
			<td><c:out value="${semester5}" /></td>
			<td><c:out value="${sum5}" /></td>
			<td></td>
		</tr>
		</table>

</body>
</html>