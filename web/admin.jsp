<%-- 
    Document   : success
    Created on : 23-Mar-2019, 20:43:49
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">

        <%@ page import="java.io.*,java.util.*,java.sql.*"%>  
        <%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
        <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
        <%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

        <title>Success</title>
    </head>
    <body class="bg-dark text-white " >

        <nav class="navbar navbar-light bg-light navbar-expand-md">
            <div class="container-fluid">
                <a class="navbar-brand" href="login.jsp">
                    <i class="icon ion-person mr-2" style="padding: 5px 10px 5px 10px; border: 1px solid black; border-radius: 100%;" ></i>
                    Logout
                </a>

                    <ul class="nav navbar-nav ml-auto">
                        <li class="nav-item" role="presentation text-black">
                            <a class="nav-link active" href="#">
                                <i class="icon ion-person mr-2" style="padding: 5px 10px 5px 10px; border: 1px solid black; border-radius: 100%;" ></i>
                                Admin
                            </a>
                        </li>
                    </ul>
            </div>
        </nav>



        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                           url="jdbc:mysql://localhost:3306/craysystem"  
                           user="root"  password=""/> 


        <sql:query dataSource="${db}" var="rs">  
            SELECT * from register where email IS NULL and password IS NULL;  
        </sql:query>  
            
        <sql:query dataSource="${db}" var="userInfo">   
            SELECT * from register; 
        </sql:query> 


        <table class="table table-bordered table-hover text-white mt-5" style="width:80%; margin:auto;" > 
            <thead class="thead-light" >
                <tr>  
                    <th>Name</th>  
                    <th>Task</th>  
                    <th>Status</th>  
                </tr> 
            </thead>

            <tbody>

                <c:forEach var="table" items="${rs.rows}">  
                    <tr>  
                        <td><c:out value="${table.name}"/></td>
                        <td><c:out value="${table.task}"/></td>
                        <td><c:out value="${table.status}"/></td>
                    </tr>  
                </c:forEach> 

            </tbody>

        </table>  

            <hr/>
            
        <div class="container" >


            <html:form method="post" action="/assign" style="text-align:center;" >

                <div class="form-group" >
                    Staff Names: 

                    <html:select property="name">
                        <c:forEach var="UserLog" items="${userInfo.rows}">  
                            <html:option value="${UserLog.name}" > <c:out value="${UserLog.name}"/> </html:option>
                        </c:forEach> 
                    </html:select >

                </div>

                <div class="form-group" >
                    Critical Level:
                    <html:select property="level">
            
                            <html:option value="Highly_Critical" > Highly Critical </html:option>
                            <html:option value="Critical" > Critical </html:option>
                            <html:option value="Normal" > Normal </html:option>
                     
                    </html:select >
                </div>
                

                
                <div class="form-group" >
                    Task: 
                    <html:text property="task" styleClass="form-control" style="width:50%; height:10vh; margin:auto; " ></html:text>
                </div>

                <div class="form-group">
                    <button class="btn btn-primary btn-block" type="submit" style="background:#2980EF; width:40%; margin: auto;">Assign Task</button>
                </div>


            </html:form>



        </div>

    </body>
</html>
