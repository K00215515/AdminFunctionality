<%-- 
    Document   : AddPiece
    Created on : 18-Jan-2019, 14:47:58
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.ShowsEG"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/font.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/colour.css" rel="stylesheet" type="text/css">
        <title>Add Piece</title>
    </head>
    <body>
    <header class="main-header">
        <div class="Logo">
            <img src="images/litGalleryLogo.png" alt="Logo"height="800px" width="300px"/>
                </div>
                <div class="nav">
                    <label for="toggle">&#9776;</label>
                    <input type="checkbox" id="toggle"/>
                <div class="menu">
                    <a href="NavigationControllerEG?menu=home">Home</a>
                    <a href="NavigationControllerEG?menu=shows">Shows</a>
                    <a href="NavigationControllerEG?menu=admin">Admin</a>

                </div>
            </div>
        </header> 
        <div class="logIn">
            <form action="ShowControllerEG" method="post" class="register-form" name="shows">

                <label>Show Description</label>
                <input type="text" name="show_description" id="show_description" value="${shows.show_description}"/>
                <br>
                <input type="submit" name="home" value="List Pieces" />
                <input type="submit" name="menu" value="SavePiece" />
            </form>
        </div>
    </body>
</html>
