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
        <p> Query 1: Phase 2 ( Country = ${beanPhase13.country}, Album= ${beanPhase13.aid})<p>
        <br><p>This is the query result: </p>
        <ol>
            <c:forEach var="songs" items="${beanPhase13.listSongs}">
                <li><p>Title='${songs.title}' --- Language='${songs.lang}' --- Genres='${songs.genre}' --- Composer='${songs.composer}'</p></li>
            </c:forEach>
        </ol>
        <br>
        <button type="button" id="home" onclick="window.location='P3M?p=${beanPhase13.password}&pphase=01'">Home</button>
        <button type="button"  id='back' onclick="window.location='P3M?p=${beanPhase13.password}&pphase=12&pcountry=${beanPhase13.country}'">Back</button>
        <h4>Henar Mari&ntilde;o Bodel&oacute;n</h4>
    </body>
</html>