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
        <h2>Files with errors: ${beanPhase02.errorsFiles.size()}</h2>
        <ul>
            <c:forEach var="errors" items="${beanPhase02.errorsFiles}">
                <br>
                <li>${errors}</li>
            </c:forEach>
        </ul>
        <h2>Files with fatal errors: ${beanPhase02.fatalErrorsFiles.size()}</h2>
        <ul>
            <c:forEach var="fatalErrors" items="${beanPhase02.fatalErrorsFiles}">
                <br>
                <li>${fatalErrors}</li>
            </c:forEach>
        </ul>
        <br>
        <button type="button" id="home" onclick="window.location='P3M?p=${beanPhase02.password}&pphase=01'">Home</button>
        <br>
        <h4>Henar Mari&ntilde;o Bodel&oacute;n</h4>
    </body>
</html>