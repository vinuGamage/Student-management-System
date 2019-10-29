/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import CourseBean.Course;

/**
 *
 * @author vinu_g
 */
public class RetrieveDAO {

    private static String query1 = "SELECT * FROM course";
    private static Connection con;

    public static ArrayList<Course> retrieveCourses() {

        ArrayList<Course> dataList = new ArrayList();
        try {
            con = DBConnection.ConnectDB();
            PreparedStatement ps = con.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Course course = new Course();
                course.setCourseId(rs.getString("courseId"));
                // System.out.println("course ID : " + rs.getString("courseId"));
                course.setCname(rs.getString("cname"));
                //  System.out.println("course ID : " + rs.getString("cname"));
                course.setCredits(rs.getInt("credits"));
                // System.out.println("course ID : " + rs.getString("credits"));
                dataList.add(course);

            }
            // System.out.println(dataList.get(0).getCname());
            // System.out.println(dataList.get(1).getCname());
            return dataList;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RetrieveDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RetrieveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataList;
    }

//    public static ResultSet retrieveCourse(){   
//        try {
//            con = DBConnection.ConnectDB();
//            PreparedStatement ps = con.prepareStatement(query1);
//            ResultSet rst = ps.executeQuery();
//            
//            return rst;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(RetrieveDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(RetrieveDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         return null;
//    }
//    
}
