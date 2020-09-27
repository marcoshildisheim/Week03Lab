<%-- 
    Document   : agecalculator
    Created on : Sep 27, 2020, 3:31:00 PM
    Author     : Marcos Hildisheim 820203
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>The Age Calculator.</h1>
        <form method="post" action="age">
            Please enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age Next Birthday!">
        </form>
            <p>${message}</p><br>
            <a href="arithmetic">The Arithmetic Calculator</a>
    </body>
</html>
