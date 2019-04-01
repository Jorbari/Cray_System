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
        <div class="login-dark">
            <nav class="navbar navbar-light navbar-expand-md">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                        <h3 class="text-light" > Cray System </h3>
                    </a>
                    <button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div
                        class="collapse navbar-collapse" id="navcol-1">
                        <ul class="nav navbar-nav ml-auto">
                            <li class="nav-item" role="presentation"><a class="nav-link active" href="#">Home</a></li>
                            <!--<li class="nav-item" role="presentation"><a class="nav-link" href="#">API doc</a></li>-->
                            <li class="nav-item" role="presentation"><a class="nav-link" href="#">About us</a></li>
                        </ul>
                    </div>
                </div>
            </nav>



            <div class="row">
                <div  id="darken" class="col-md-4 offset-md-8 pt-4">
                    <html:form method="post" action="/login" >
                        <h2 class="sr-only">Login Form</h2>
                        <div class="illustration">
                            <i class="icon ion-ios-contact-outline"></i>
                            <a href="#" class="forgot text-white" data-toggle="modal" data-target="#modal1">Don't have an account? Sign up</a>
                        </div>
                        <div class="form-group" >
                            Email:
                            <html:text styleClass="form-control" property="email" styleId="pass1"   ></html:text>
                            </div>

                            <div class="form-group" >
                                Password:
                            <html:text property="password" styleClass="form-control"  ></html:text>
                            </div>

                            <div class="form-group">
                                <button class="btn btn-primary btn-block" type="submit" style="background:#2980EF;">Sign in</button>
                        </div>
                        <a href="#" class="forgot">Forgotten your password?.</a>
                    </html:form>
                </div>
            </div>

        </div>
        
        
        <div class="modal fade" role="dialog" tabindex="-1" id="modal1">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" style="font-weight:300;color:#2980EF;">Create an account</h4><button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">X</span></button></div>
                    <div class="modal-body" id="modalBody">
                        <html:form method="post" action="/register" >
                            
                            <div class="form-group">
                                Email:
                                <html:text styleClass="form-control" property="email"    ></html:text>
                            </div>
                            
                            <div class="form-group">
                                Name:
                                <html:text styleClass="form-control" property="name" ></html:text>
                            </div>
                            
                            <div class="form-group">
                                Password:
                                <html:text styleClass="form-control" property="password" ></html:text>
                            </div>
                            <div class="form-group">
                                Confirm Password:
                                <html:text styleClass="form-control" property="repassword"   ></html:text>
                            </div>

                            <div class="form-group">
                                <button class="btn btn-primary btn-block" type="submit" style="background:#2980EF;">Sign up</button>
                            </div>
                        </html:form>
                    </div>
                    <div class="modal-footer"><button class="btn btn-light" type="button" data-dismiss="modal">Close</button></div>
                </div>
            </div>
        </div>






        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/index.js"></script>
    </body>

</html:html>