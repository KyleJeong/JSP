<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	body{
		text-align : center;
		margin: 0 auto;
	}	
</style>

</head>
<body>
	<form action="ControllerServlet" method="post">
		Name : <input type="text" name="name"><br>
		PWd : <input type="text" name="pwd"><br>
		<input type="submit" value="login">
	</form>
</body>
</html>