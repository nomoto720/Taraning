<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Random" %>
<%
	Random rand=new Random();
	String[] strs={"大吉","中吉","吉","凶"};
	String str=strs[rand.nextInt(strs.length)];
	switch(str){
	case "大吉":
		break;
	case "": 
		break;
	case "":
		break;
	case "":
}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>あなたの運勢は<%=str %>です</p>
</body>
</html>