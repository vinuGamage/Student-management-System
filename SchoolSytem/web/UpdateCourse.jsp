<%-- 
    Document   : UpdateCourse
    Created on : Sep 19, 2019, 11:11:01 AM
    Author     : vinu_g
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update User</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container" style="font-family: century gothic;">
            <h1 class="display-1" >Update Course <s:property value="courseId"/></h1>
            <br>
            <form action="CourseUpdation" method="post">
                <div class="form-group">
                    <label for="CourseId">Course ID:</label>
                    <input type="text" class="form-control" name="courseId" value="<s:property value="courseId"/>" pattern="^[A-Za-z0-9 -]+$" placeholder="Enter Course Id" readonly>
                </div>
                <div class="form-group">
                    <label for="cname">Course Name:</label>
                    <input type="text" class="form-control" pattern="^[a-zA-Z0-9 ]*$"  placeholder="Enter Course Name" name="cname"  required >
                </div>
                <div class="form-group">
                    <label for="credits">Course Credits:</label>
                    <input type="text" class="form-control" pattern= "^[0-9]+$" placeholder="Enter Number Of Credits" name="credits" required>
                </div>



                <button type="submit" class="btn btn-primary">Update Course</button>
            </form>
        </div>
    </body>
</html>
