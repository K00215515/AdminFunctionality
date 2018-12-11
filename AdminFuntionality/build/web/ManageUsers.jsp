<%-- 
    Document   : ManageUsers
    Created on : 11-Dec-2018, 12:19:07
    Author     : K00215515
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
        <title>Manage Users</title>
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
            <h2>Manage Users</h2>
            <form action="AdminControllerEG" method="post" class="register-form" name="users">
                <table id="m">
                    <tr>             
                        <td>username</td>
                    </tr>
                    <c:forEach var="users" items="${allusers}">                  
                        <tr>                                            
                            <td ><a href="AdminControllerEG?menu=getUserView&user_id=${admin.userid}">${admin.username}</a> </td>
                            <td ><a href="AdminControllerEG?menu=deleteUsers&user_id=${admin.userid}">Delete</a> </td>
                            <td ><a href="AdminControllerEG?menu=updateUsers&user_id=${admin.userid}">Update</a> </td>
                         </tr>
                    </c:forEach>
<!--                <input type="submit" name="menu" value="save" />-->
            </form>
        </div>
    </body>
</html>
