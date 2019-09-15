<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<h1><a href="<%= request.getContextPath() %>">Welcome to HSWorld !</a></h1>
</div>

<div>
	<a href="<%= request.getContextPath() %>/regist">회원가입</a>
	<a href="<%= request.getContextPath() %>/login">로그인</a>
	<a href="<%= request.getContextPath() %>/lotto">로또</a>
	<a href="<%= request.getContextPath() %>/chat">채팅</a>
</div>