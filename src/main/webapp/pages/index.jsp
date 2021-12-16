
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>MVC</title>
</head>
<body>
    <c:forEach var="lang" items="${list}">
        <p>${lang}</p>
    </c:forEach>

</body>
</html>
