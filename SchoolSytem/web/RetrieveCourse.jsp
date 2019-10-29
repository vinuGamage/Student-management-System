<%-- 
    Document   : RetrieveCourse
    Created on : Sep 19, 2019, 11:11:23 AM
    Author     : vinu_g
--%>

<%@page import="service.RetrieveDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Courses</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container" style="font-family: century gothic;">

            <h1 class="display-1" >All Courses</h1>
            <br>
            <div class="container">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Course ID</th>
                            <th>Course Name</th>
                            <th>Course Credits</th>
                        </tr>

                    </thead>



                    <tbody>
                        <s:iterator value="dataList">
                            <tr>
                                <td><s:property value="courseId" /></td>
                                <td><s:property value="cname" /></td>
                                <td><s:property value="credits" /></td>
                            </tr>
                        </s:iterator>
                    </tbody>





                </table>

            </div>
        </div>
    </body>
</html>
