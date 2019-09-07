<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>Tong hai so</h1>
        <form action="index.jsp" method="get">
		Nh?p a: <input type="text" name = "so1">
		<br>
		Nh?p b: <input type="text" name = "so2">
		<br>
		<button type="submit">Tính t?ng</button>
	</form>
	<h2>K?t qu?: </h2>
	<jsp:useBean id="cal" class="sample.control.tong"/>
	<jsp:setProperty property="*" name="cal"/>
	<b>
	<h2 ><jsp:getProperty property="sum" name="cal"/></h2>
	</b>
	
            
        
    </body>
</html>