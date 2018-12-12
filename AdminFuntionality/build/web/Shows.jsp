<%-- 
    Document   : Shows
    Created on : 10-Dec-2018, 09:57:25
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.ShowsEG"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="css/layout.css" rel="stylesheet" type="text/css">
        <link href="css/font.css" rel="stylesheet" type="text/css">
        <link href="css/colour.css" rel="stylesheet" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Shows</title> 
    </head>
    <body>
        <div class="shows-page">
            <header class="main-header">
                <img src="images/litGalleryLogo.png" alt="Logo"/>
                <div class="nav">
                    <label for="toggle">&#9776;</label>
                    <input type="checkbox" id="toggle"/>
                    <div class="menu">
                        <a href="Home.jsp">Home</a>
<!--                        <a href="Gallery.html">Gallery</a>-->
                        <a href="Shows.jsp">Shows</a>
                        <a href="Admin.jsp">Admin</a>
<!--                        <a href="Profile.html">Profile</a>-->
                        <a href="SignUp.jsp">Sign Up</a>
                        <a href="LogIn.jsp">Log In</a> 
                    </div>
                </div>
            </header> 
                    <table id="m">
                    <tr>             
                        <td>image</td>
                        <td>show title</td>
                    </tr>
                    <c:forEach var="shows" items="${allshows}">                  
                        <tr>                                            
                            
                            <td><img src="${pageContext.request.contextPath}/images/${shows.show_image}" alt="shows" width="80" height="80"></td>
                            <td><a href="ShowControllerEG?menu=getShowView&noticeId=${shows.show_id}">${shows.show_title}</a> </td>
                            <td><a href="ShowControllerEG?menu=deleteShow&noticeId=${shows.show_id}">Delete</a> </td>
                            <td><a href="ShowControllerEG?menu=updateShow&noticeId=${shows.show_id}">Update</a> </td>
                         </tr>
                    </c:forEach>
                    </table>
        </div>
        <div class="footer">
            <footer></footer>
        </div>
    </body>
</html>
