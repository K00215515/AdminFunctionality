package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.AdminEG;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/layout.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/font.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/colour.css\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("        <title>Sign Up</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("                <div class=\"Logo\">\n");
      out.write("                <img src=\"images/litGalleryLogo.png\" alt=\"Logo\"/ height=\"800px\" width=\"300px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"toggle\">&#9776;</label>\n");
      out.write("                    <input type=\"checkbox\" id=\"toggle\"/>\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("\n");
      out.write("                        <a href=\"Home.jsp\">Home</a>\n");
      out.write("<!--                        <a href=\"Gallery.jsp\">Gallery</a>-->\n");
      out.write("                        <a href=\"Shows.jsp\">Shows</a>\n");
      out.write("<!--                        <a href=\"Profile.jsp\">Profile</a> -->\n");
      out.write("                        <a href=\"SignUp.jsp\">SignIn</a> \n");
      out.write("<!--                        <a href=\"Logout.jsp\">Logout</a> -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </header> \n");
      out.write("            \n");
      out.write("        <div class=\"logIn\">\n");
      out.write("            <form action=\"AdminControllerEG\" method=\"post\" class=\"register-form\" name=\"registration\">\n");
      out.write("                <h2>Sign Up</h2><br>\n");
      out.write("                <label>User name</label>\n");
      out.write("                <input type=\"text\" name=\"username\" id=\"username\"/>\n");
      out.write("                <br>\n");
      out.write("                <label>Password</label>\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\"/>\n");
      out.write("                <br>\n");
      out.write("                <label>Email</label>\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"email\"/>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label>First Name</label>\n");
      out.write("                <input type=\"text\" name=\"F_name\" id=\"F_name\"/>\n");
      out.write("                <br>\n");
      out.write("                <label>Last Name</label>\n");
      out.write("                    <input type=\"text\" name=\"L_name\" id=\"L_name\"/>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" name=\"menu\" value=\"SignUp\" />\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-1.12.4.js\"\n");
      out.write("            integrity=\"sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/form-validation.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
}
