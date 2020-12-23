<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="ex.Monster" import="ex.Slime" import="ex.DeathBat" %>

<% Monster m1=new Slime("スラキチ"); %>
<% Monster m2=new DeathBat("ゴメス"); %>
<% Monster m3=new Slime("スラッチ"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Monster App</title>
</head>
<body>
<p>()=m1.run() %></p>
<p><%=m2.run() %></p>
<p><%=m3.run() %></p>
</body>
</html>