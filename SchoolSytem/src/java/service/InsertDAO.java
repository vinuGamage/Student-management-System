/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import User.UserAction;

/**
 *
 * @author vinu_g
 */
public class InsertDAO {

    private static String query1 = "INSERT INTO user (fullname,username,password,role) VALUES (?,?,?,?)";
    private static String query2 = "INSERT INTO course (courseId,cname,credits) VALUES (?,?,?)";
    private static Connection con;

    //inserting user to the database
    public static boolean insertUsers(String fullname, String username, String password, String role) {

        try {
            con = DBConnection.ConnectDB();
            PreparedStatement ps = con.prepareStatement(query1);
            ps.setString(1, fullname);
            System.out.println("fullname : " + fullname);
            ps.setString(2, username);
            System.out.println("username : " + username);
            ps.setString(3, password);
            System.out.println("password : " + password);
            ps.setString(4, role);
            System.out.println("role : " + role);
            System.out.println("inserted");
            ps.execute();

            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    //inserting user to the database
    public static boolean insertCourse(String courseId, String cname, int credits) {

        try {
            con = DBConnection.ConnectDB();
            PreparedStatement ps = con.prepareStatement(query2);
            ps.setString(1, courseId);
            System.out.println("courseID : " + courseId);
            ps.setString(2, cname);
            System.out.println("COurse name : " + cname);
            ps.setInt(3, credits);
            System.out.println("credits : " + credits);

            System.out.println("inserted");
            ps.execute();

            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }
}
