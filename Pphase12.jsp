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
        <p> Query 1: Phase 2 ( Country = ${beanPhase12.country})<p>
        <br><p>Please, select an Album: </p>
        <ol>
            <c:forEach var="albums" items="${beanPhase12.listAlbums}">
                <li><p><a href='?p=${beanPhase12.password}&pphase=13&pcountry=${beanPhase12.country}&paid=${albums.aid}'>Album='${albums.name}'</a> --- Year='${albums.year}' --- Performer='${albums.performer}' --- Review='${albums.review}'</p></li>
            </c:forEach>
        </ol>
        <br>
        <button type="button" id="home" onclick="window.location='P3M?p=${beanPhase12.password}&pphase=01'">Home</button>
        <button type="button"  id='back' onclick="window.location='P3M?p=${beanPhase12.password}&pphase=11'">Back</button>
        <h4>Henar Mari&ntilde;o Bodel&oacute;n</h4>
    </body>
</html>