<%-- 
    Document   : DetailedUserView
    Created on : 12-Dec-2018, 10:40:36
    Author     : K00215515
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.UserEG"%>

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
            <img src="images/litGalleryLogo.png" alt="Logo"/ height="800px" width="300px">
                </div>
                <div class="nav">
                    <label for="toggle">&#9776;</label>
                    <input type="checkbox" id="toggle"/>
                <div class="menu">
                    <a href="Home.jsp">Home</a>
<!--                        <a href="Gallery.html">Gallery</a>-->
                    <a href="Shows.jsp">Shows</a>
                    <a href="Admin.jsp">Admin</a>
<!--                        <a href="Profile.html">Profile</a> -->
<!--                    <a href="SignUp.jsp">SignIn</a> 
                    <a href="Logout.jsp">Logout</a> -->
                </div>
            </div>
        </header> 
            <div class="logIn">
                <form action="AdminControllerEG" method="get" class="register-form" name="users">
                    
                <br>
                <label>Username</label>
                <input type="text" name="username" id="username" value="${users.username}"/>
                <br>
                <label>Password</label>
                <input type="password" name="password" id="password" value="${users.password}"/>
                <br>
                <label>Email</label>
                <input type="email" name="email" id="email" value="${users.email}"/>
                <br>
                <label>F_name</label>
                <input type="text" name="username" id="username" value="${users.F_name}"/>
                <br>
                <label>L_name</label>
                <input type="text" name="username" id="username" value="${users.F_name}"/>
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
