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
<!--                <div class="grid-container">
                <form>
                    Title:<br>
                    <input type="text" name="title"><br>
                    Description:<br>
                    <input type="text" name="description"><br>
                    Start Date:<br>
                    <input type="date" name="start date"><br>
                    End Date:<br>
                    <input type="date" name="end date"><br>
                    Course:<br>
                    <input type="text" name="course"><br>
                    <input type="Submit" value="Publish">
                    <input type="reset" value="Cancel">
                </form>-->
<!--                <div class="item2">
                    <form>
                        <label for="img">Images:</label>
                        <input type="checkbox" name="img" id="img"><br>
                        <label for="video">Video:</label>
                        <input type="checkbox" name="video" id="video">
                    </form>-->
<!--                </div>
                <div class="item3">  

                    <div class="gallery-page"> 

                        <img src="images/Sample1.png" alt="Sample1" />

                        <img src="images/Sample2.jpg" alt="Sample2"/>

                        <img src="images/Sample3.jpg" alt="Sample3" />

                        <img src="images/Sample4.PNG" alt="Sample4" />

                    </div>
                </div> -->
                </div>
            </div>
        </div>
        <div class="footer">
            <footer></footer>
        </div>
    </body>
</html>
