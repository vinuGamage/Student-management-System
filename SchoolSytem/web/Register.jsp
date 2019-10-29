<%-- 
    Document   : Register
    Created on : Sep 19, 2019, 7:44:25 AM
    Author     : vinu_g
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Register User</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container" style="font-family: century gothic;">

            <h1 class="display-1" >Register your account</h1>
            <br>
            <div class="container">


                <form action="UserAction" method="post">
                    <div class="form-group">
                        <label for="fullname">Full Name:</label>
                        <input type="text" class="form-control" name="fullname" pattern="^[A-Za-z -]+$" placeholder="Enter full name" required>
                    </div>
                    <div class="form-group">
                        <label for="pwd">Username:</label>
                        <input type="text" class="form-control" pattern="^[a-zA-Z0-9_.]*$" placeholder="Enter username" name="username"   required>
                    </div>
                    <div class="form-group">
                        <label for="pwd">Password:</label>
                        <input type="password" class="form-control" pattern= "^[A-Za-z0-9 -]+$" placeholder="Enter password" name="password" required>
                    </div>

                      <div class="form-group">
                       
                        <input type="password" class="form-control" value="" name="page" required>
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                    <a href="/SchoolSystem/Login.jsp"><button type="button" class="btn btn-warning" >Login</button></a>
                </form>

                <br>  <br>

            </div>

    </body>
</html>
