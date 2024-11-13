<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sign In</title>
</head>
<body>

<!-- Show error message if login fails -->
<c:if test="${param.error != null}">
    <div style="color: red; font-weight: bold;">
        Invalid Credentials, please try again.
    </div>
</c:if>

<form action="/sign-in" method="POST">
    <label for="uname">USERNAME:</label>
    <input type="text" name="uname" placeholder="Enter your username" required>
    <br><br>

    <label for="pwd">PASSWORD:</label>
    <input type="password" name="pwd" placeholder="Enter your password" required>
    <br><br>

    <input type="submit" value="Sign In" class="new">
</form>

</body>
</html>