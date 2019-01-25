 <%-- 
    Document   : LogIn
    Created on : 29-Nov-2018, 14:50:45
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
        
        <title>Log In</title>
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
                        <a href="NavigationControllerEG?menu=signUp">SignUp</a>
                    </div>
                </div>
            </header>  
            <div class="logIn">
                <form action="UserControllerEG" method="post" class="register-form" name="Login">
                    <h2>Log In</h2><br>
                    <label>User name</label>
                    <input type="text" name="username" id="username"/>
                    <br>
                    <label>Password</label>
                    <input type="password" name="password" id="password"/>
                    <br>
                    <input type="submit" name="menu" value="LogIn" />  
                    <br>
<!--                    <input type="submit" name="menu" value="Process Login" />-->
                    <input type="submit" name="menu" value="Admin LogIn" />

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
