<%-- 
    Document   : StudentHome
    Created on : Sep 19, 2019, 7:47:01 AM
    Author     : vinu_g
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Home</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container" style="font-family: century gothic;">
            <h1 class="display-1">Welcome <s:property value="fullname"/> !!</h1>
            <br><br><br>
            <a href="RetrieveCourseAction"><button type="button" class="btn btn-warning" >View all Courses</button></a>

        </div>
    </body>
</html>
