package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.AdminEG;
import model.ShowsEG;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("/css/colour.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <header class=\"main-header\">\n");
      out.write("        <div class=\"Logo\">\n");
      out.write("            <img src=\"images/litGalleryLogo.png\" alt=\"Logo\"height=\"800px\" width=\"300px\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"toggle\">&#9776;</label>\n");
      out.write("                    <input type=\"checkbox\" id=\"toggle\"/>\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <a href=\"NavigationControllerEG?menu=home\">Home</a>\n");
      out.write("                    <a href=\"NavigationControllerEG?menu=gallery\">Gallery</a>\n");
      out.write("                    <a href=\"NavigationControllerEG?menu=shows\">Shows</a>\n");
      out.write("                    <a href=\"NavigationControllerEG?menu=admin\">Admin</a>\n");
      out.write("                    <a href=\"NavigationControllerEG?menu=profile\">Profile</a>\n");
      out.write("                    <a href=\"NavigationControllerEG?menu=logout\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header> \n");
      out.write("        <div class=\"logIn\">\n");
      out.write("                <form action=\"ShowControllerEG\" class=\"shows-page\">\n");
      out.write("                   <input type=\"submit\" name=\"menu\" value=\"Manage Shows\"/>\n");
      out.write("                   <input type=\"submit\" name=\"menu\" value=\"Add Show\"/>\n");
      out.write("                </form>\n");
      out.write("                <form action=\"EntryControllerEG\" class=\"entries-page\">\n");
      out.write("                   <input type=\"submit\" name=\"menu\" value=\"Manage Pieces\"/>  \n");
      out.write("<!--                   <input type=\"submit\" name=\"menu\" value=\"All Pieces\"/>-->\n");
      out.write("                </form>\n");
      out.write("                <form action=\"AdminControllerEG\" class=\"manageusers-page\">   ");
      out.write("                                 \n");
      out.write("                    <input type=\"submit\" name=\"menu\" value=\"Manage Users\" />\n");
      out.write("                    <input type=\"submit\" name=\"menu\" value=\"logout\" />\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
