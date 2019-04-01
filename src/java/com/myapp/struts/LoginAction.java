/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Jorbari
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";
    private static final String ADMIN = "admin";

//    Variables to hold the database info
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String user = "root";
    String Rootpassword = "";

    String StoredEmail;
    String StoredPassword;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        HttpSession ses = request.getSession(true);

        LoginActionForm data = (LoginActionForm) form;

        String email = data.getEmail();
        String password = data.getPassword();

        try {
//            

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/craysystem", user, Rootpassword);

            st = con.createStatement();
            ps = con.prepareStatement("SELECT email,name,password FROM register WHERE email = ? and password = ?");
            
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if(email.equalsIgnoreCase("admin@admin.com") && password.equalsIgnoreCase("admin1234") ){
                return mapping.findForward(ADMIN);
            }
            
            if (rs.next()) {
                StoredEmail = rs.getString(1);
                StoredPassword = rs.getString(3);
                String StoredName = rs.getString(2);
                ses.setAttribute("user", StoredName);
                
                if (email.equals(StoredEmail) && password.equals(StoredPassword)) {
                    return mapping.findForward(SUCCESS);
                }

            } else {
                System.out.println("Dont have such user");
            }
            
            

        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return mapping.findForward(ERROR);

    }
}
