<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="v-bind" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>Test Hibernate</title>
</head>
<body>

<div align="center">City Table from DB world (MySql) obtained by hibernate, displayed by JSP </div>

<table cellspacing="5" cellpadding="10" border="1" width="100%">
    <thead>
    <tr>
        <th>id</th>
        <th>country code</th>
        <th>district</th>
        <th>name</th>
        <th>population</th>
    </tr>
    </thead>
    <tbody>
    <jsp:useBean id="city" scope="request" type="java.util.List"/>
    <c:forEach items="${city}" var="cities">
        <tr>
            <td> ${cities.id}</td>
            <td> ${cities.countryCode}</td>
            <td>${cities.district}</td>
            <td>${cities.name}</td>
            <td>${cities.population}</td>
        </tr>



    </c:forEach>
    </tbody>
</table>
</body>
</html>