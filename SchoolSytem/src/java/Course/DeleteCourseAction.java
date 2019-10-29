/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import CourseBean.Course;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javax.swing.JOptionPane;
import service.InsertDAO;
import service.UpdateDAO;
import service.ValidateDAO;

/**
 *
 * @author vinu_g
 */
public class DeleteCourseAction extends ActionSupport implements ModelDriven<Course> {

    private Course course = new Course();

    @Override
    public Course getModel() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return course;
    }

    public String execute() throws Exception {
        if (ValidateDAO.validatingCourseId(course.getCourseId())) {
            if (UpdateDAO.deleteRecord(course.getCourseId())) {
                JOptionPane.showMessageDialog(null, "Course was successfully deleted");
                return "LectuerHome";
            } else {
                JOptionPane.showMessageDialog(null, "Error");
                return "LectuerHome";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Course does not exist");
            return "LectuerHome";
        }

    }
}
