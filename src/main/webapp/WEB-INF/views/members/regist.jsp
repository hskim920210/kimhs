<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/include/header.jsp" />
<div>
	<p><a>Kakao ID로 가입하기</a></p>
	<p><a>Naver ID로 가입하기</a></p>
</div>
<div>
	<h3>일반 회원가입</h3>
	<form action="<%= request.getContextPath() %>/registConfirm" method="post">
	<table>
		<tr>
			<td>아이디 (*)</td>
			<td><input type="text" name="m_id" placeholder="ID를 입력해주세요."></td>
		</tr>
		<tr>
			<td>비밀번호 (*)</td>
			<td><input type="password" name="m_pw" placeholder="PW를 입력해주세요."></td>
		</tr>
		<tr>
			<td>비밀번호 확인 (*)</td>
			<td><input type="password" name="m_pwConfirm" placeholder="PW를 입력해주세요."></td>
		</tr>
		<tr>
			<td>이름 (*)</td>
			<td><input type="text" name="m_name" placeholder="Name를 입력해주세요."></td>
		</tr>
		<tr>
			<td>닉네임 (*)</td>
			<td><input type="text" name="m_nick" placeholder="NickName를 입력해주세요."></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="text" name="m_birth" placeholder="Birth를 입력해주세요."></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="m_email" placeholder="Email를 입력해주세요."></td>
		</tr>
		<tr>
			<td>연락처</td>
			<td><input type="text" name="m_tel" placeholder="Tel를 입력해주세요."></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="m_address" placeholder="Address를 입력해주세요."></td>
		</tr>
		<tr>
			<td><input type="hidden" name="m_regdate" placeholder="Address를 입력해주세요." value="1992-02-10"></td>
			<td><input type="hidden" name="m_type" placeholder="Address를 입력해주세요." value="0"></td>
		</tr>
		<tr>
			<td><input type="submit" value="작성완료"></td>
			<td><input type="reset" value="초기화"></td>
		</tr>
	</table>
	</form>
</div>
</body>
</html>