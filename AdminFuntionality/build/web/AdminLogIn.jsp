<%-- 
    Document   : AdminLogIn
    Created on : 22-Dec-2018, 14:57:55
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.AdminEG"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/font.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/colour.css" rel="stylesheet" type="text/css">
        
        <title>Admin Log In</title>
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

                        <a href="Home.jsp">Home</a>
<!--                        <a href="Gallery.html">Gallery</a>-->
                        <a href="Shows.jsp">Shows</a>
<!--                        <a href="Profile.html">Profile</a> -->
                        <a href="SignUp.jsp">SignIn</a> 
<!--                        <a href="Logout.jsp">Logout</a> -->
                    </div>
                </div>
            </header>  
            <div class="logIn">
                <form action="AdminControllerEG" method="post" class="register-form" name="Login">
                    <h2>Admin Log In</h2><br>
                    <label>User name</label>
                    <input type="text" name="username" id="username"/>
                    <br>
                    <label>Password</label>
                    <input type="password" name="password" id="password"/>
                    <br>
                    <input type="submit" name="menu" value="LogIn" />
                </form>
            </div>
        <script
            src="https://code.jquery.com/jquery-1.12.4.js"
            integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
        crossorigin="anonymous"></script>
        <script src="js/jquery.validate.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/form-validation.js"></script>
    </body>
</html>
