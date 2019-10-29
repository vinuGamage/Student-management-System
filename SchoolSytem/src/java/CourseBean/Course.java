/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseBean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinu_g
 */
public class Course {

    private String courseId;
    private String cname;
    private int credits;
    private  ArrayList<Course> dataList ;

    public ArrayList<Course> getCourseList() {
        return dataList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.dataList = courseList;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
