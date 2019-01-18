<%-- 
    Document   : DetailedShowView
    Created on : 12-Dec-2018, 14:06:00
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
        <title>Detailed Show View</title>
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
                <form action="ShowControllerEG" method="get" class="register-form" name="shows">
                    
                <br>
                <label>Show Name</label>
                <input type="text" name="show_title" id="show_title" value="${shows.show_title}"/>
                <br>
                <label>Show Description</label>
                <input type="text" name="show_description" id="show_description" value="${shows.show_description}"/>
                <br>
                <label>Show Image</label>
                <input type="text" name="show_image" id="show_image" value="${shows.show_image}"/>
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

