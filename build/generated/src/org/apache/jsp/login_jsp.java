package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleId_styleClass_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleId_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_method_action.release();
    _jspx_tagPool_html_text_styleClass_property_nobody.release();
    _jspx_tagPool_html_text_styleId_styleClass_property_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      if (_jspx_meth_html_html_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_html_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_html_html_0.setPageContext(_jspx_page_context);
    _jspx_th_html_html_0.setParent(null);
    int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
    if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("    <head>\n");
        out.write("        <meta charset=\"utf-8\">\n");
        out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        out.write("        <title>Cray System</title>\n");
        out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        out.write("        <link rel=\"stylesheet\" href=\"assets/css/Footer-Dark.css\">\n");
        out.write("        <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        out.write("        <link rel=\"stylesheet\" href=\"assets/css/Newsletter-Subscription-Form.css\">\n");
        out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
        out.write("    </head>\n");
        out.write("\n");
        out.write("    <body>\n");
        out.write("        <div class=\"login-dark\">\n");
        out.write("            <nav class=\"navbar navbar-light navbar-expand-md\">\n");
        out.write("                <div class=\"container-fluid\">\n");
        out.write("                    <a class=\"navbar-brand\" href=\"#\">\n");
        out.write("                        <h3 class=\"text-light\" > Cray System </h3>\n");
        out.write("                    </a>\n");
        out.write("                    <button class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navcol-1\">\n");
        out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
        out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
        out.write("                    </button>\n");
        out.write("                    <div\n");
        out.write("                        class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
        out.write("                        <ul class=\"nav navbar-nav ml-auto\">\n");
        out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"#\">Home</a></li>\n");
        out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"#\">API doc</a></li>\n");
        out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"#\">About us</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </nav>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("            <div class=\"row\">\n");
        out.write("                <div  id=\"darken\" class=\"col-md-4 offset-md-8 pt-4\">\n");
        out.write("                    ");
        if (_jspx_meth_html_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("        <div class=\"modal fade\" role=\"dialog\" tabindex=\"-1\" id=\"modal1\">\n");
        out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
        out.write("                <div class=\"modal-content\">\n");
        out.write("                    <div class=\"modal-header\">\n");
        out.write("                        <h4 class=\"modal-title\" style=\"font-weight:300;color:#2980EF;\">Create an account</h4><button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">X</span></button></div>\n");
        out.write("                    <div class=\"modal-body\" id=\"modalBody\">\n");
        out.write("                        ");
        if (_jspx_meth_html_form_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"modal-footer\"><button class=\"btn btn-light\" type=\"button\" data-dismiss=\"modal\">Close</button></div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
        out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        out.write("        <script src=\"assets/js/index.js\"></script>\n");
        out.write("    </body>\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      return true;
    }
    _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
    return false;
  }

  private boolean _jspx_meth_html_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_form_0.setMethod("post");
    _jspx_th_html_form_0.setAction("/login");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <h2 class=\"sr-only\">Login Form</h2>\n");
        out.write("                        <div class=\"illustration\">\n");
        out.write("                            <i class=\"icon ion-ios-contact-outline\"></i>\n");
        out.write("                            <a href=\"#\" class=\"forgot text-white\" data-toggle=\"modal\" data-target=\"#modal1\">Don't have an account? Sign up</a>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"form-group\" >\n");
        out.write("                            ");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <div class=\"form-group\" >\n");
        out.write("                            ");
        if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"background:#2980EF;\">Sign in</button>\n");
        out.write("                        </div>\n");
        out.write("                        <a href=\"#\" class=\"forgot\">Forgotten your password?.</a>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleId_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setStyleClass("form-control");
    _jspx_th_html_text_0.setProperty("name");
    _jspx_th_html_text_0.setStyleId("pass1");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleId_styleClass_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleId_styleClass_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("password");
    _jspx_th_html_text_1.setStyleClass("form-control");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_1.setPageContext(_jspx_page_context);
    _jspx_th_html_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_form_1.setMethod("post");
    _jspx_th_html_form_1.setAction("/register");
    int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
    if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <!--<input class=\"form-control\" type=\"text\" name=\"Full_Name\" placeholder=\"Name\">-->\n");
        out.write("                                ");
        if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <!--<input class=\"form-control\" type=\"email\" name=\"email\" placeholder=\"email\">-->\n");
        out.write("                                ");
        if (_jspx_meth_html_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <!--<input class=\"form-control\" type=\"password\" name=\"password2\" placeholder=\"Password\">-->\n");
        out.write("                                ");
        if (_jspx_meth_html_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <!--<input class=\"form-control\" type=\"password\" name=\"Repassword2\" placeholder=\"Re-type Password\">-->\n");
        out.write("                                ");
        if (_jspx_meth_html_text_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"background:#2980EF;\">Sign up</button>\n");
        out.write("                            </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_1);
      return true;
    }
    _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_2.setStyleClass("form-control");
    _jspx_th_html_text_2.setProperty("user");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_3.setStyleClass("form-control");
    _jspx_th_html_text_3.setProperty("email");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_4.setStyleClass("form-control");
    _jspx_th_html_text_4.setProperty("password");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_4);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_5.setStyleClass("form-control");
    _jspx_th_html_text_5.setProperty("Repassword");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_5);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }
}
