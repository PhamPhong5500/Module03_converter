<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/8/2023
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency conversion</title>
    <style>
    form{
        border: 1px solid black;
        width: 200px;
    }
    </style>
</head>
<body>
    <h2>Currency conversion</h2>
<form action="/converterServlet" method="post">
    <div>
        <label> Rate : </label> <br>
        <input name="rate" type="text" placeholder="Rate" value="23000"> <br>
        <label>USD: </label> <br>
        <input name="usd" type="text" placeholder="USD" value="0"/> <br>
        <input type="submit" id="submit" value="Converter"/>
    </div>
</form>

</body>
</html>
