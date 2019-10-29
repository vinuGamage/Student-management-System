
import User.UserAction;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.UnmarshallingContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.StrutsStatics;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinu_g
 */
public class MyInterceptor implements Interceptor {

    public void init() {
        System.out.println("Inside MyInterceptor init()");
    }
    
     public void destroy() {
         System.out.println("Inside MyInterceptor destory()");
     }  

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    final ActionContext context = ai.getInvocationContext();
        HttpServletRequest req = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
        HttpSession session = req.getSession(true);
        Object user = session.getAttribute("USER");
        
        if(user == null){
            if(ai.getAction().getClass().equals(UserAction.class)){
                System.out.println("Inside MyInterceptor user==null");
                return ai.invoke();
            }
            return "login";
        }else{
            System.out.println("Inside MyInterceptor user!=null");
            ai.invoke();
             return "";
        }
    
    }

}
