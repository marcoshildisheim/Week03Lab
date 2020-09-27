<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 27, 2020, 5:09:05 PM
    Author     : Marcos Hildisheim 820203
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Arithmetic Calculator</title>
    </head>
    <body>
        <h1>This is an Arithmetic Calculator!</h1>
        <form method="post" action="arithmetic">
            Please enter the first value: <input type="text" name="firstValue"><br>
            Please enter the Second value: <input type="text" name="secondValue"><br>
            <input type="submit" name="calculation" value="+">
            <input type="submit" name="calculation" value="-">
            <input type="submit" name="calculation" value="*">
            <input type="submit" name="calculation" value="%"><br><br>
        </form>
            <p>Final Result: ${message}</p><br>
            <a href="age">The Age Calculator</a>
    </body>
</html>
