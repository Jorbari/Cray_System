/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskAssignment;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author USER
 */
public class TaskFormAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

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

        TaskFormBean tb = (TaskFormBean) form;

        String name = tb.getName();
        String task = tb.getTask();
        String level = tb.getLevel();

        if (!"".equals(name) && !"".equals(task)) {
                
            try {

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/craysystem", user, Rootpassword);

                st = con.createStatement();
                ps = con.prepareStatement("INSERT INTO register(name,task,status,Priority) VALUES(?,?,?,?)");

                ps.setString(1, name);
                ps.setString(2, task);
                ps.setString(3, "pending");
                ps.setString(4, level);
                int send = ps.executeUpdate();

            } catch (Exception ex) {

            }

            return mapping.findForward(SUCCESS);
        }

        return mapping.findForward(ERROR);
    }
}
