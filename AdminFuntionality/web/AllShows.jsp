<%-- 
    Document   : AllShows
    Created on : 12-Dec-2018, 11:19:42
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
        <title>All Shows</title>
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
                    <a href="Shows.jsp">Shows</a>
                    <a href="Admin.jsp">Admin</a>

                </div>
            </div>
        </header>
        <div class="logIn">
            <form action="ShowControllerEG" method="post" class="register-form" name="shows">

                <input type="submit" name="home" value="List Shows" />
            </form>
        <table id="m">
                    <tr>             
                        <td>Image</td>
                        <td>Show title</td>
                    </tr>
                    <c:forEach var="shows" items="${allshows}">                  
                        <tr>                                            
                            <td ><img src="${pageContext.request.contextPath}/images/${shows.show_image}" alt="shows" width="40" height="40"></td>
                            <td ><a href="ShowControllerEG?menu=getShowView&show_id=${shows.show_id}">${shows.show_title}</a> </td>
                            <td ><a href="ShowControllerEG?menu=deleteShow&show_id=${shows.show_id}">Delete</a> </td>
                            <td ><a href="ShowControllerEG?menu=updateShow&show_id=${shows.show_id}">Update</a> </td>
                         </tr>
                    </c:forEach>
            </table>
        </div>
    </body>
    
</html>
