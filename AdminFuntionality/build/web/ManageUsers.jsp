<%-- 
    Document   : ManageUsers
    Created on : 13-Dec-2018, 13:33:56
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.AdminEG"%> <%-- UsersEG --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/font.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/colour.css" rel="stylesheet" type="text/css">
        <title>All Users</title>
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
<!--                    <a href="NavigationControllerEG?menu=gallery">Gallery</a>-->
                    <a href="NavigationControllerEG?menu=shows">Shows</a>
                    <a href="NavigationControllerEG?menu=admin">Admin</a>
<!--                    <a href="NavigationControllerEG?menu=signUp">SignUp</a>
                    <a href="NavigationControllerEG?menu=logout">Logout</a>-->

                </div>
            </div>
        </header>
        <div class="logIn">
            <form action="AdminControllerEG" method="post" class="register-form" name="admin">

                <input type="submit" name="home" value="List Users" />
            </form>
        <table id="m">
                    <tr>             
                        <td>Username</td>
                    </tr>
                    <c:forEach var="users" items="${allusers}">                  
                        <tr>                                                                        
                            <td ><a href="AdminControllerEG?menu=getUserView&user_id=${users.user_id}">${users.username}</a> </td>
                            <td ><a href="AdminControllerEG?menu=deleteUser&user_id=${users.user_id}">Delete</a> </td>
                            <td ><a href="AdminControllerEG?menu=updateUser&user_id=${users.user_id}">Update</a> </td> <%-- or userControllerEG--%>
                         </tr>
                    </c:forEach>
            </table>
        </div>
    </body> 
</html>

