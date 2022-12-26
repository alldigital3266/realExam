<%@page import="kr.co.mook.vo.MemberVO"%>
<%@page import="kr.co.mook.dao.MemberDAOImpl"%>
<%@page import="kr.co.mook.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	MemberDAO dao = new MemberDAOImpl();
	MemberVO vo = new MemberVO();

	vo.setMemId( request.getParameter("memId") );
	vo.setMemName( request.getParameter("memName") );
	vo.setMemPwd( request.getParameter("memPwd") );
	vo.setPhone( request.getParameter("phone") );
	
	int result = dao.updateMember(vo);
	

%>	

</body>
</html>