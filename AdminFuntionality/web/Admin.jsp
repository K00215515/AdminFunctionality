<%-- 
    Document   : Admin
    Created on : 10-Dec-2018, 15:43:35
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
        <title>JSP Page</title>
    </head>
    <body>

        <div class="login-page">
            <header class="main-header">

           
                
            </header>
            <div class="form">               
                <div class="update-form"><%-- don't need another div --%>
                <form action="UserController" class="logIn">   <%-- //login-form  --%>                                 
                   <input type="submit" name="menu" value="Users" />
                    
                </form> 
                <form action="CourseControllerEG" class="logIn">
                    <input type="submit" name="menu" value="Add Course" />       
                </form>    
                <form action="ShowController" class="logIn">
                   <input type="submit" name="menu" value="AddShow" />  
                </form>
                </div>
<!--                    <table id="m">
                    <tr>             
                        <td>image</td>
                        <td>username</td>
                    </tr>-->
                    <c:forEach var="users" items="${allusers}">                  
                        <tr>                                            
                            
<!--                            <td ><img src="${pageContext.request.contextPath}/images/${notices.image}" alt="student work" width="40" height="40"></td>-->
                            <td ><a href="NoticeController2?menu=getNoticeView&noticeId=${user.userid}">${user.username}</a> </td>
                            <td ><a href="NoticeController2?menu=deleteNotice&noticeId=${user.userid}">Delete</a> </td>
                            <td ><a href="NoticeController2?menu=updateNotice&noticeId=${user.userid}">Update</a> </td>
                         </tr>
                    </c:forEach>
            </div>
        </div>

    </body>
</html>

