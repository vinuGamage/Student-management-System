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

/**
 *
 * @author vinu_g
 */
public class UpdateDAO {

    private static String query1 = "DELETE FROM course WHERE courseId=?";
    private static String query2 = "UPDATE course SET cname=?,credits=? WHERE courseId=?";
    private static Connection con;

    public static boolean deleteRecord(String courseId) {
        try {
            con = DBConnection.ConnectDB();
            PreparedStatement ps = con.prepareStatement(query1);
            ps.setString(1, courseId);
            ps.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean updateRecord(String courseId, String cname, int credits) {
        try {
            con = DBConnection.ConnectDB();
            PreparedStatement ps = con.prepareStatement(query2);
            ps.setString(1, cname);
            ps.setInt(2, credits);
            ps.setString(3, courseId);
            ps.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
