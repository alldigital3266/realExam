<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	*{
		list-style: none;
	}
	nav ul{
		display:flex;
	}
	nav ul li{
		width:100px;
	}

</style>


</head>
<body>
	<h1>저희 회사를 방문해 주셔서 감사합니다.</h1>
	<nav>
		<ul>
			<li><a href="/mem/login">로그인</a></li>
			<li><a href="/mem/insertForm">회원가입</a></li>
			<li><a href="/mem/memView">회원조회</a></li>
			<li><a href="/mem/updateForm">회원수정</a></li>
		
		</ul>
		
	 </nav>


</body>
</html>