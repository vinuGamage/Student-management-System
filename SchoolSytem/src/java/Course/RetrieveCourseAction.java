/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import CourseBean.Course;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import service.RetrieveDAO;
import service.ValidateDAO;

/**
 *
 * @author vinu_g
 */
public class RetrieveCourseAction extends ActionSupport implements ModelDriven<Course>{

    private Course course = new Course();
    private List<Course> dataList = null;
//    ResultSet rs = null;
//   
    @Override
    public Course getModel() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return getCourse();
    }
    
    
    
    public String execute() throws Exception {

       
          //  dataList = new ArrayList<Course>();
            
          setDataList(RetrieveDAO.retrieveCourses());
//            if (rs != null) {
//                while (rs.next()) {
//                
//                    course.setCourseId(rs.getString("courseId"));
//                    System.out.println("course ID : " + rs.getString("courseId"));
//                    course.setCname(rs.getString("cnmae"));
//                    System.out.println("course ID : " + rs.getString("cname"));
//                    course.setCredits(rs.getInt("credits"));
//                    System.out.println("course ID : " + rs.getString("credits"));
//                    dataList.add(course);
//
//                }
//
//            }
           //  System.out.println(getDataList().get(0).getCname());
           //  System.out.println(getDataList().get(1).getCname());
             return "RetrieveCourse";
        } 

//        ArrayList<Course> courseList = (ArrayList<Course>) RetrieveDAO.retrieveCourse();
//        System.out.println("course List : " + courseList);
//        course.setCourseList(courseList);
//        course.getCourseList();

    /**
     * @return the course
     */
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
     * @return the dataList
     */
    public List<Course> getDataList() {
        return dataList;
    }

    /**
     * @param dataList the dataList to set
     */
    public void setDataList(List<Course> dataList) {
        this.dataList = dataList;
    }
       

    
}
