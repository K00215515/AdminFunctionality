package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ShowsEG;

public final class Gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/font.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/colour.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <title>Gallery</title> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"shows-page\">\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("                <img src=\"images/litGalleryLogo.png\" alt=\"Logo\"/>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"toggle\">&#9776;</label>\n");
      out.write("                    <input type=\"checkbox\" id=\"toggle\"/>\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <a href=\"NavigationControllerEG?menu=home\">Home</a>\n");
      out.write("                        <a href=\"NavigationControllerEG?menu=gallery\">Gallery</a>\n");
      out.write("                        <a href=\"NavigationControllerEG?menu=shows\">Shows</a>\n");
      out.write("                        <a href=\"NavigationControllerEG?menu=admin\">Admin</a>\n");
      out.write("                        <a href=\"NavigationControllerEG?menu=signUp\">SignUp</a>\n");
      out.write("                        <a href=\"NavigationControllerEG?menu=logIn\">LogIn</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>           \n");
      out.write("        </div>\n");
      out.write("        <div class=\"gallery-page\">                \n");
      out.write("                        <img src=\"images/Sample1.png\" alt=\"Sample1\"/>\n");
      out.write("<!--\n");
      out.write("                        <button type=\"button\">Like</button>\n");
      out.write("                        <input type=\"text\" name=\"comment\" id=\"comment\">\n");
      out.write("-->\n");
      out.write("                        <img src=\"images/Sample2.jpg\" alt=\"Sample2\"/>         \n");
      out.write("                    \n");
      out.write("                        <img src=\"images/Sample3.jpg\" alt=\"Sample3\"/>\n");
      out.write("            \n");
      out.write("\n");
      out.write("                        <img src=\"images/Sample4.PNG\" alt=\"Sample4\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <footer></footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
