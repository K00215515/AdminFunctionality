<%-- 
    Document   : AddCourse
    Created on : 10-Dec-2018, 15:58:24
    Author     : K00215515
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.CourseEG"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div class="form">
        <form action="CourseControllerEG" method="post" class="register-form" name="registration">

            <label>Course Name</label>
            <input type="text" name="course_name" id="course_name"/>
            <br>
            <label>Course Description</label>
            <input type="text" name="course_Description" id="course_Description"/>
            <input type="submit" name="menu" value="Save" />
         </form>
    </div>
</html>
