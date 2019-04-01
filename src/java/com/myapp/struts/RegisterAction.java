/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author USER
 */
public class RegisterAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession ses = request.getSession(true);
        String name,email,password,repassword;
        
        RegisterForm rf = (RegisterForm) form;
        name = rf.getName();
        email = rf.getEmail();
        password = rf.getPassword();
        repassword = rf.getRepassword();
        
        
         
        if( password.equals(repassword) ){
            
            try{
                DBconnect db = new DBconnect();  
                db.register(email, name, password);
                
                ses.setAttribute("user", name);
            }
            catch(Exception ex){
                System.out.println("error" + ex);
            }
            
            
            return mapping.findForward(SUCCESS);
            
        }
        
        else{
            return mapping.findForward(ERROR);
        }
        
        
        
        
    }
}
