<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<form method="post" action="index">
		<input type="submit" value="로그인" name="login">
		<input type="submit" value="회원가입" name="join">
	</form>
	<!-- Form : 이렇게 쓰지 말라는 거임 -->
	<!-- <button onclick="views/login.jsp">login</button>
	<button onclick="views/join.jsp">join</button> -->
	
	<br><br>
	// 이 방식이 제일 좋다<br>
	// button onclick="location.href='service?command=loginForm'"<br>
	<button onclick="location.href='service?command=loginForm'">login</button>
	<button onclick="service?command=joinForm">join</button>
<br><br>	
Served at: /mvc2<br>
login:로그인<br>
join:null<br>
<br><br>
Served at: /mvc2<br>
login:null<br>
join:회원가입	<br>
</body>
</html>