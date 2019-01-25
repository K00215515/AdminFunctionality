<%-- 
    Document   : Admin
    Created on : 10-Dec-2018, 15:43:35
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.AdminEG"%>
<%@page import="model.ShowsEG"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/font.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/colour.css" rel="stylesheet" type="text/css">
        <title>Admin</title>
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
                    <a href="NavigationControllerEG?menu=gallery">Gallery</a>
                    <a href="NavigationControllerEG?menu=shows">Shows</a>
                    <a href="NavigationControllerEG?menu=admin">Admin</a>
                    <a href="NavigationControllerEG?menu=profile">Profile</a>
                    <a href="NavigationControllerEG?menu=logout">Logout</a>
                </div>
            </div>
        </header> 
        <div class="logIn">
                <form action="AdminControllerEG" class="manageusers-page">   <%-- //login-form  --%>                                 
                    <input type="submit" name="menu" value="Manage Users" />
                    <input type="submit" name="menu" value="logout" />
                </form>
                <form action="ShowControllerEG" class="shows-page">
                   <input type="submit" name="menu" value="Manage Shows"/>
                </form>
                <form action="EntryControllerEG" class="entries-page">
                   <input type="submit" name="menu" value="Manage Pieces"/>  
                </form>
        </div>
    </body>
</html>