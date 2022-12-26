<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 수정 페이지</h1>
<form action="/mem/updateMember">

	<table>
		<tr><td>이름</td><td>    <input type="text" name="memName" /></td> </tr>
		<tr><td>아이디</td><td>   <input type="text" name="memId"  /></td></tr>
    	<tr><td>비밀번호</td><td>  <input type="password" name="memPwd" /></td></tr>
    	<tr><td>확인</td> <td>    <input type="text" /></td></tr>
    	<tr><td>전화번호</td> <td>  <input type="text" name="phone" /></td></tr>
	</table>
	
	<br />
		<input type="submit" value="수정완료" /> 
		<input type="reset" value="리셋" />

</form>
</body>
</html>