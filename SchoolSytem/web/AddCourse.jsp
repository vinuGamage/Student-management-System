<%-- 
    Document   : AddCourse
    Created on : Sep 19, 2019, 11:10:48 AM
    Author     : vinu_g
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Course</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container" style="font-family: century gothic;">

            <h1 class="display-1" >Add Course</h1>
            <br>
            <div class="container">


                <form action="AddCourseAction" method="post">
                    <div class="form-group">
                        <label for="CourseId">Course ID:</label>
                        <input type="text" class="form-control" name="courseId" pattern="^[A-Za-z0-9 -]+$" placeholder="Enter Course Id" required>
                    </div>
                    <div class="form-group">
                        <label for="cname">Course Name:</label>
                        <input type="text" class="form-control" name="cname"   pattern="^[a-zA-Z0-9 ]*$" placeholder="Enter Course Name"  required>
                    </div>
                    <div class="form-group">
                        <label for="credits">Course Credits:</label>
                        <input type="text" class="form-control" pattern= "^[0-9]+$" placeholder="Enter Number Of Credits" name="credits" required>
                    </div>



                    <button type="submit" class="btn btn-primary">Add Course</button>
                </form>
            </div>

    </body>
</html>
