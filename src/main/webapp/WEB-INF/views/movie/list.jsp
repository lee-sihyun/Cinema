<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<title>영화관</title>
	
</head>
<style type="text/css">

th {
	background: #D4F4FA;
    color: #000000;
}

tr {
	border: 1px solid;
}
</style>
<body>
<p>영화목록</p>
<table>
<tr>

<th style="text-align: center; color: black;">영화이름</th>
<th style="text-align: center; color: black;">영화감독</th>
<th style="text-align: center; color: black;">영화배우</th>

</tr>

<c:forEach var="movie" items="${selctMv}">

<tr>
<td>${movie.mvName}</td>
<td>${movie.mvDirector}</td>
<td>${movie.mvCast}</td>

</tr>


</c:forEach>


</table>

</body>
</html>