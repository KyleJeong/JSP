<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="domain.Custom, java.util.*,controller.EmpController" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	String spageid = request.getParameter("page");
	int pageId = Integer.parseInt(spageid);
	int total = 5;
	
	if(pageId == 1){
		
	}else{
		pageId = pageId-1;
		pageId = pageId*total + 1;
	}
	
	List<Custom> list = EmpController.getRecords(pageId, total);
	
	out.print("<h1>Page No :" + spageid+"</h1>");
	out.print("<table border='1' cellpadding='4' width='60%'>");
	out.print("<tr><th>Id</th><th>Name</th><th>Book</th>");
	for(Custom e:list){
		out.print("<tr><td>"+e.getNum()+"</td><td>"+e.getCustName()+"</td><td>"+e.getBookTitle()+"</td></td>");
		
	}
	out.print("</table>");
	
%>
<a href = "view.jsp?page=1">1</a>
<a href = "view.jsp?page=2">2</a>
<a href = "view.jsp?page=3">3</a>
</body>
</html>