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
public class StaffFormAction extends org.apache.struts.action.Action {

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

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        StaffFormBean sf = (StaffFormBean) form;
        
        String task = sf.getTask();
        String status = sf.getComplete();
        
        if(!"".equals(task) && !"".equals(status) ){
            
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/craysystem", user, Rootpassword);

                ps = con.prepareStatement("UPDATE register SET status = ? WHERE task = ? ");

                ps.setString(1, status);
                ps.setString(2, task);
                ps.executeUpdate();
                
                if( ps != null ){
                    return mapping.findForward(SUCCESS);
                }
            }
            catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex);
            }
            
        }
        
        return mapping.findForward(ERROR);
    }
}
