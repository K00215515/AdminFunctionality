<%-- 
    Document   : DetailedPieceView
    Created on : 22-Jan-2019, 13:05:58
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
        <title>Detailed Piece View</title>
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
                <form action="EntryControllerEG" method="get" class="register-form" name="pieces">
                <br>
                <label>Entry Title</label>
                <input type="text" name= "entry_title" id="entry_title" value ="${pieces.entry_title}"/>
                <br>
                <label>Entry Description</label>
                <input type="text" name= "entry_description" id="entry_description" value ="${pieces.entry_description}"/>
                <br>
                <label>Price</label>
                <input type="text" name= "price" id="price" value ="${pieces.price}"/>
                <br>
                <input type="submit" name="menu" value="Update" />
                <input type="submit" name="menu" value="Delete" />
                </form>
            </div>
        </div>
        <script
            src="https://code.jquery.com/jquery-1.12.4.js"
            integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>
        <script src="js/jquery.validate.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/form-validation.js"></script>
    </body>
</html>
