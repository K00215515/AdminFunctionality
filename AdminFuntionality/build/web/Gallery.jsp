<%-- 
    Document   : Gallery
    Created on : 29-Jan-2019, 15:41:18
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

        <title>Gallery</title> 
    </head>
    <body>
        <div class="shows-page">
            <header class="main-header">
                <img src="images/litGalleryLogo.png" alt="Logo"/>
                <div class="nav">
                    <label for="toggle">&#9776;</label>
                    <input type="checkbox" id="toggle"/>
                    <div class="menu">
                        <a href="NavigationControllerEG?menu=home">Home</a>
                        <a href="NavigationControllerEG?menu=gallery">Gallery</a>
                        <a href="NavigationControllerEG?menu=shows">Shows</a>
                        <a href="NavigationControllerEG?menu=admin">Admin</a>
                        <a href="NavigationControllerEG?menu=signUp">SignUp</a>
                        <a href="NavigationControllerEG?menu=logIn">LogIn</a>
                    </div>
                </div>
            </header>           
        </div>
        <div class="gallery-page">                
                        <img src="images/Sample1.png" alt="Sample1"/>
<!--
                        <button type="button">Like</button>
                        <input type="text" name="comment" id="comment">
-->
                        <img src="images/Sample2.jpg" alt="Sample2"/>         
                    
                        <img src="images/Sample3.jpg" alt="Sample3"/>
            

                        <img src="images/Sample4.PNG" alt="Sample4"/>
        </div>
        <div class="footer">
            <footer></footer>
        </div>
    </body>
</html>
