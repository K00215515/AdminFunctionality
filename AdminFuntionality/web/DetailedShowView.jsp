<%-- 
    Document   : DetailedNoticeView
    Created on : 04-Dec-2017, 10:01:52
    Author     : Elizabeth.Bourke
--%>

<%-- 
    Document   : register
    Created on : 07-Dec-2016, 21:39:41
    Author     : AMarie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Shows"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css">
        <title>Detailed Notice View</title>
    </head>
    <body>
        <div class="login-page">

            <div class="form">
                <form action="NoticeController2" method="get" class="register-form" name="registration">
                    
                <br>
<!--                <label for="filename_1">Image:</label>-->
<!--                    <input type="text" name="image" id="image" value="${notice.image}"/>-->
<!--                <input id="filename_1" type="file" name="filename_1" size="50"/><br/>-->
                <label>Image</label>
                <input type="text" name="image" id="image" value="${notice.image}"/>
                <br>
                <label>Short Description</label>
                <input type="text" name="shortDescription" id="shortDescription" value="${notice.shortDescription}"/>
                <br>
                <label>Long Description</label>
                <input type="text" name="longDescription" id="longDescription" value="${notice.longDescription}"/>
                <br>
                
                <form action="UserController" method="get" class="register-form" name="registration">
                <label>User Name</label>
                <input type="text" name="username" id="username" value="${noticeUser.username}"/>
                <br>

                <label>Email</label>
                <input type="email" name="email" id="email" value="${noticeUser.email}"/>
                <br>

                <label>Phone</label>
                <input type="text" name="phone" id="phone" value="${noticeUser.phone}"/>
                
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

