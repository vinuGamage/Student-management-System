/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import CourseBean.Course;
import UserBean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.struts2.ServletActionContext;
import service.RetrieveDAO;
import service.ValidateDAO;

/**
 *
 * @author vinu_g
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();
    private Course course = new Course();
    private List<Course> dataList = null;
    @Override
    public User getModel() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return user;
    }

    public List<Course> getDataList() {
        return dataList;
    }

    public Course getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    
    /**
     * @param dataList the dataList to set
     */
    public void setDataList(List<Course> dataList) {
        this.dataList = dataList;
    }
       
    
    
    public String execute() throws Exception {

        String myHash = ValidateDAO.encryptThisString(user.getPassword());
        if (ValidateDAO.hashingPaswordandValidating(myHash, user.getUsername())) {
                 //Storing the session
                ServletActionContext.getRequest().getSession().setAttribute("Role", user.getRole());
            if (ValidateDAO.validatingRole(user.getUsername()).equals("student")) {
                setDataList(RetrieveDAO.retrieveCourses());
                if(RetrieveDAO.retrieveCourses()==null)
                    System.out.println("Data list is null");
                else
                    System.out.println("Data list is not null");
                return "StudentHome";
            } else {
                return "LectuereHome";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username already exits");
            return "login";
        }
    }

}
