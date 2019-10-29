<%-- 
    Document   : Login
    Created on : Sep 19, 2019, 7:44:36 AM
    Author     : vinu_g
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container" style="font-family: century gothic;">
            <h1 class="display-1">Login</h1>
            <br><br>
            <form   action = "LoginAction" method="POST" >


                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" class="form-control"  placeholder="Enter username" pattern="^[a-zA-Z0-9._]*$" name="username" required>
                </div>

                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control"  placeholder="Enter password" pattern= "^[A-Za-z0-9 -]+$" name="password" required>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </body>
</html>
