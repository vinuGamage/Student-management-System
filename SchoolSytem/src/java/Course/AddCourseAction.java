/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import UserBean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import CourseBean.Course;
import javax.swing.JOptionPane;
import service.InsertDAO;
import service.ValidateDAO;
/**
 *
 * @author vinu_g
 */
public class AddCourseAction extends ActionSupport implements ModelDriven<Course>{

    private Course course= new Course();
    
    @Override
    public Course getModel() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return course;
    }
    
     public String execute() throws Exception {
         if(ValidateDAO.validatingCourseId(course.getCourseId())){
               JOptionPane.showMessageDialog(null, "Course already exits");
               return "AddCourse";
         }else{
             if(InsertDAO.insertCourse(course.getCourseId(), course.getCname(), course.getCredits())){
                  JOptionPane.showMessageDialog(null, "Course was successfully added");
                  return "LectuereHome";
             }else{
                  JOptionPane.showMessageDialog(null, "Course was not successfully added");
                  return "AddCourse";
             }
         }
             
     
     }
    
}
