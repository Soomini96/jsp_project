<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form method="get" action="service">
	
		<!-- hidden으로 명령어 집어넣어줌 -->
		<input type="hidden" name="command" value="login"> 
		
		<span>ID:&#9;</span><input type="text" name="id"><br>
		<span>PW:&#9;</span><input type="text" name="pw"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>