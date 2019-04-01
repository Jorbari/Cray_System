
package com.myapp.struts;
import java.sql.*;


public class DBconnect {
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String user = "root";
    String Rootpassword = "";
//    
//    String name = "Jerry";
//    String email = "Jerry@gmail.com";
//    String password = "12345";
    
    public void register(String email, String name, String password){
//        this.name = name;
//        this.email = email;
//        this.password = password;
        try{
            System.out.println("Hello");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/craysystem", user, Rootpassword);
            
            
            String add = "INSERT INTO register(email,name,password) VALUES(?,?,?)";
            ps = con.prepareStatement(add);

            ps.setString(1, email);
            ps.setString(2, name);
            ps.setString(3, password);
//            Executing the query
            int execute = ps.executeUpdate();
            
            System.out.println("Successfull");
   
            
        }
        catch(Exception ex){
            System.out.println("Error" + ex);
        }
    }
    
    public void test(){
        String show;

        try{
            String email = "mail@mail.com";
            String password = "123445";
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/craysystem", user, Rootpassword);
            
            
            st = con.createStatement();
            ps = con.prepareStatement("SELECT email,password FROM register WHERE email = ? and password = ?" );
//            rs = st.executeQuery("SELECT email,password FROM register WHERE email = ? and password = ?" );
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if(rs.next()){
                System.out.println("Data exist");
                  show = rs.getString(1);
                  System.out.println(show);
            }
            else{
                System.out.println("Dont have such user");
            }
     
        }
        catch(Exception ex){
            System.out.println("Error" + ex);
        }
    }
    
    public static void main(String[] args){
        DBconnect db = new DBconnect();
//        db.register("mail@mail.com", "jerry", "123445");

    }

    
}
