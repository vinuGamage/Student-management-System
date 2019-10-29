/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javax.swing.JOptionPane;
import service.InsertDAO;
import service.ValidateDAO;
import UserBean.User;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author vinu_g
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return user;
    }

    public String execute() throws Exception {

        if (user.getUsername().contains(".")) {
            user.setRole("lectuer");
            if (ValidateDAO.validateUser(user.getUsername()) == null) {

                String myHash = ValidateDAO.encryptThisString(user.getPassword());
                user.setPassword(myHash);
                
                //Storing the session
               // ServletActionContext.getRequest().getSession().setAttribute("USER", user.getUsername());
                if (InsertDAO.insertUsers(user.getFullname(), user.getUsername(), user.getPassword(), user.getRole())) {

                    return "login";
                } else {
                    return "register";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username already exits");
                return "register";
            }
        } else {
            user.setRole("student");
            if (ValidateDAO.validateUser(user.getUsername()) == null) {

                String myHash = ValidateDAO.encryptThisString(user.getPassword());
                user.setPassword(myHash);
                if (InsertDAO.insertUsers(user.getFullname(), user.getUsername(), user.getPassword(), user.getRole())) {
                    return "login";
                } else {
                    return "register";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username already exits");
                return "register";
            }

        }

    }

}
