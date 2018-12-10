<%-- 
    Document   : AddShow
    Created on : 10-Dec-2018, 16:03:05
    Author     : K00215515
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.ShowsEG"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div class="logIn">
        <form action="ShowController" method="post" class="register-form" name="registration">

            <label>Show Name</label>
            <input type="text" name="show_title" id="show_title"/>
            <br>
            <label>Show Description</label>
            <input type="text" name="show_Description" id="show_description"/>
            <br>
            <label>Show Image</label>
            <input type="text" name="show_image" id="show_image"/><br>
            <input type="submit" name="menu" value="Save" />
         </form>
    </div>
</html>
