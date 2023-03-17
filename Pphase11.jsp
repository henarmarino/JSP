<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
    <head>
        <title> Music information service </title>
        <link href='./p3/p3.css' rel='stylesheet'>
    </head>
    <body>
        <h1>Music information service</h1>
        <br><p>Please, select a Country: </p>
        <ol>
            <c:forEach var="countries" items="${beanPhase11.listCountries}">
                <li><a href='?p=${beanPhase11.password}&pphase=12&pcountry=${countries}'>${countries}</a></li>
            </c:forEach>
        </ol>
        <button type="button" id="home" onclick="window.location='P3M?p=${beanPhase11.password}&pphase=01'">Home</button>
        <h4>Henar Mari&ntilde;o Bodel&oacute;n</h4>
    </body>
</html>