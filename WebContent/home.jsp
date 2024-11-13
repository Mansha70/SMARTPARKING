<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

<!-- Check if a success message is passed in the URL -->
<c:if test="${param.message != null}">
    <div style="color: green; font-weight: bold;">
        ${param.message}
    </div>
</c:if>

<h2>Welcome to PARK EASE!</h2>
<p>This is the home page after successful sign-in.</p>

</body>
</html>