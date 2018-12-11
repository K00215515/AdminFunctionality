<%-- 
    Document   : AddCourse
    Created on : 10-Dec-2018, 15:58:24
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.CourseEG"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/font.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/css/colour.css" rel="stylesheet" type="text/css">
        <title>Add Course</title>
    </head>
    <div class="logIn">
        <form action="CourseControllerEG" method="post" class="register-form" name="registration">

            <label>Course Name</label>
            <input type="text" name="course_name" id="course_name"/>
            <br>
            <label>Course Description</label>
            <input type="text" name="course_description" id="course_description"/>
            <input type="submit" name="menu" value="save" />
         </form>
    </div>
</html>
