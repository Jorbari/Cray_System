<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html:html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cray System</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/Footer-Dark.css">
        <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
        <link rel="stylesheet" href="assets/css/Newsletter-Subscription-Form.css">
        <link rel="stylesheet" href="assets/css/style.css">
    </head>

    <body>
        <div class="login-dark mb-5">
            <nav class="navbar navbar-light navbar-expand-md">
                <div class="container-fluid"><a class="navbar-brand" href="#"><img src="assets/img/LogoSmall.png" class="img-fluid"></a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                    <div
                        class="collapse navbar-collapse" id="navcol-1">
                        <ul class="nav navbar-nav ml-auto">
                            <li class="nav-item" role="presentation"><a class="nav-link active" href="#">Home</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="#">API doc</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="#">About us</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="#">Contact us</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="row">
                <div  styleId="darken" styleclass="col-md-4 offset-md-8 pt-4">
                    <html:form method="post" action="/login" >
                        <h2 styleclass="sr-only">Login Form</h2>
                        <div styleclass="illustration">
                            <i styleclass="icon ion-ios-contact-outline"></i>
                            <a href="#" styleclass="forgot text-white" data-toggle="modal" data-target="#modal1">Don't have an account? Sign up</a>
                        </div>
                        <div styleclass="form-group" >
                            <%--<html:text  type="email" name="name" placeholder="User Name"></html:text>--%>
                            <html:text styleClass="form-control" property="name" styleId="pass1" name="name"  ></html:text>
                        </div>
                        
                        <div styleclass="form-group" >
                            <html:text property="password" styleClass="form-control" name="password" ></html:text>
                        </div>
                        
                        <div styleclass="form-group">
                            <!--<button styleclass="btn btn-primary btn-block" type="submit" style="background:#2980EF;">Sign in</button>-->
                        <html:submit styleClass="btn btn-block" style="background:#2980EF;" >Sign in</html:submit>
                        </div>
                        <a href="#" styleclass="forgot">Forgotten your password?</a>
                    </html:form>
                </div>
            </div>
            <a href="../../../../../GitHub/Airtime/index.html"></a>
        </div>
       
        
           


        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/index.js"></script>
    </body>

</html:html>