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
    <body class="bg-dark text-light" >

        <c:set var="user" value="${sessionScope.user}" ></c:set>

            <nav class="navbar navbar-light bg-light navbar-expand-md">
                <div class="container-fluid">
                    <a class="navbar-brand" href="login.jsp">
                        <i class="icon ion-person mr-2" style="padding: 5px 10px 5px 10px; border: 1px solid black; border-radius: 100%;" ></i>
                        Logout
                    </a>

                    <ul class="nav navbar-nav ml-auto">
                        <li class="nav-item" role="presentation">
                            <a class="nav-link active" href="#">
                                <i class="icon ion-person mr-2" style="padding: 5px 10px 5px 10px; border: 1px solid black; border-radius: 100%;" ></i>
                            <c:out value="${user}"></c:out>
                            </a>

                        </li>
                    </ul>
                </div>
            </nav>



        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                           url="jdbc:mysql://localhost:3306/craysystem"  
                           user="root"  password=""/> 


        <sql:query dataSource="${db}" var="rs">   
            SELECT name,task,status,Priority FROM register WHERE name = ? and email IS NULL and password IS NULL;
            <sql:param value="${user}" />
        </sql:query>  

        <sql:query dataSource="${db}" var="ts">   
            SELECT task from register where name = ?; 
            <sql:param value="${user}" />
        </sql:query> 


        <table class="table table-bordered table-hover  mt-5" style="width:80%; margin:auto;" > 
            <thead class="thead-light" >
                <tr>  
                    <th>Name</th>  
                    <th>Task</th> 
                    <th>Status</th>
                    <th>Priority Level</th>
                </tr> 
            </thead>

            <tbody>

                <c:forEach var="table" items="${rs.rows}">  
                    <tr>   
                        <td><c:out value="${table.name}"/></td>   
                        <td><c:out value="${table.task}"/></td> 
                        <td><c:out value="${table.status}"/></td> 
                        <td><c:out value="${table.Priority}"/></td> 
                    </tr>  
                </c:forEach> 

            </tbody>

        </table> 

        <br/><br/>




        <html:form method="post" action="/complete" style="text-align:center;" >

            Task: 

            <html:select property="task">
                <c:forEach var="tab" items="${ts.rows}">  
                    <html:option value="${tab.task}" > <c:out value="${tab.task}"/> </html:option>
                </c:forEach> 
            </html:select >

            Status:
            <html:select property="complete">
                <html:option value="pending" > <c:out value="Pending"/> </html:option>
                <html:option value="completed" > <c:out value="Completed"/> </html:option>
            </html:select >




            <div class="form-group">
                <button class="btn btn-primary btn-block mt-3" type="submit" style="background:#2980EF; width:40%; margin: auto;">Update Task</button>
            </div>


        </html:form>





    </body>
</html>
