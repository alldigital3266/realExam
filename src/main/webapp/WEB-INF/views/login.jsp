<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인 화면</h1>

<form action="/mem/main">
	<input type="text" name="memId" placeholder="ID"/> <br />
	<input type="password" name="memPwd" placeholder="PASSWORD"/> <br />
	<input type="submit" value="확인" />
</form>



</body>
</html>