<%-- 
    Document   : LectuerHome
    Created on : Sep 19, 2019, 7:47:30 AM
    Author     : vinu_g
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="service.RetrieveDAO"%>
<%@page import="CourseBean.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lectuer Home</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container" style="font-family: century gothic;">
            <h1 class="display-1">Welcome <s:property value="fullname"/> !!</h1>
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
                            <%
                                ArrayList<Course> list = RetrieveDAO.retrieveCourses();

                                int x = 0;
                                while (x < list.size()) {
                                    Course u = list.get(x);

                            %>
                            <tr >

                                <td ><%=u.getCourseId()%></td>
                                <td><%=u.getCname()%></td>
                                <td><%=u.getCredits()%></td>

                            </tr>


                            <%
                                    x++;
                                }
                            %>


                        </tbody>
                    </table>


                    <br> <br><br>
                    <form action="UpdateCourseAction" method="post">
                        <div class="form-group">
                            <label for="CourseId">Course ID:</label>
                            <input type="text" class="form-control" name="courseId" pattern="^[A-Za-z0-9 -]+$" placeholder="Enter Course Id" >
                        </div>
                        <button type="submit" class="btn btn-primary">Update Course</button>
                    </form>
                    <br><br><br>

                    <form action="DeleteCourseAction" method="post">
                        <div class="form-group">
                            <label for="CourseId">Course ID:</label>
                            <input type="text" class="form-control" name="courseId" pattern="^[A-Za-z0-9 -]+$" placeholder="Enter Course Id" >
                        </div>
                        <button type="submit" class="btn btn-primary">Delete Course</button>
                    </form>
                    <br><br><br>
                    <a href="/SchoolSystem/AddCourse.jsp"><button type="button" class="btn btn-warning" >Add Course</button></a>


                </div>

                </body>
                </html>
