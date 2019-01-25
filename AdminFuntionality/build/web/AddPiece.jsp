<%-- 
    Document   : AddPiece
    Created on : 18-Jan-2019, 14:47:58
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.EntriesEG"%>
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
            <form action="EntryControllerEG" method="post" class="register-form" name="pieces">
                
                <label>Entry Title</label>
                <input type="text" name="entry_title" id="entry_title" value="${pieces.entry_title}"/>
                <br>
                <label>Entry Description</label>
                <input type="text" name="entry_description" id="entry_description" value="${pieces.entry_description}"/>
                <br>
                <label>Price</label>
                <input type="text" name="price" id="price" value="${pieces.price}"/>
                <br>
                <input type="submit" name="home" value="List Pieces" />
                <input type="submit" name="menu" value="Save Piece" />
            </form>
        </div>
    </body>
</html>
