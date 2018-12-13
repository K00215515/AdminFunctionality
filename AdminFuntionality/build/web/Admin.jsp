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
                    <a href="Home.jsp">Home</a>
<!--                        <a href="Gallery.html">Gallery</a>-->
                    <a href="Shows.jsp">Shows</a>
                    <a href="Admin.jsp">Admin</a>
<!--                        <a href="Profile.html">Profile</a> -->
<!--                    <a href="SignUp.jsp">SignIn</a> 
-->                    <a href="Logout.jsp">Logout</a> 
                </div>
            </div>
        </header> 
        <div class="logIn">
                <form action="AdminControllerEG" class="manageusers-page">   <%-- //login-form  --%>                                 
                    <input type="submit" name="menu" value="Manage Users" />
                    <input type="submit" name="menu" value="logout" />
                </form>
                <form action="ShowControllerEG" class="shows-page">
                   <input type="submit" name="menu" value="Add Show" />  
                   <input type="submit" name="menu" value="All Shows"/>
                </form>
            <table id="m">
                    <tr>             
                        <td>image</td>
                        <td>show title</td>
                    </tr>
                    <c:forEach var="shows" items="${allshows}">                  
                        <tr>                                            
                            <td ><img src="${pageContext.request.contextPath}/images/${shows.show_image}" alt="shows" width="80" height="80"></td>
                            <td ><a href="ShowControllerEG?menu=getShowView&show_id=${shows.show_id}">${shows.show_title}</a> </td>
                            <td ><a href="ShowControllerEG?menu=deleteShow&show_id=${shows.show_id}">delete</a> </td>
                            <td ><a href="ShowControllerEG?menu=updateShow&show_id=${shows.show_id}">update</a> </td>
                         </tr>
                    </c:forEach>
            </table>
<!--                <table id="m">
                    <tr>             
                        <td>username</td>
                    </tr>
              <!--
                        <tr>                                            
                            <td ><a href="UserControllerEG?menu=getUserView&user_id=${users.userid}">${users.username}</a> </td>
                            <td ><a href="UserControllerEG?menu=deleteUsers&user_id=${users.userid}">Delete</a> </td>
                            <td ><a href="UserControllerEG?menu=updateUsers&user_id=${users.userid}">Update</a> </td>
                         </tr>

                    </table>-->
        </div>
    </body>
</html>