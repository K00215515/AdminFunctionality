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

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Admin</title>\n");
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
      out.write("                    <a href=\"Home.jsp\">Home</a>\n");
      out.write("<!--                        <a href=\"Gallery.html\">Gallery</a>-->\n");
      out.write("                    <a href=\"Shows.jsp\">Shows</a>\n");
      out.write("                    <a href=\"Admin.jsp\">Admin</a>\n");
      out.write("<!--                        <a href=\"Profile.html\">Profile</a> -->\n");
      out.write("<!--                    <a href=\"SignUp.jsp\">SignIn</a> \n");
      out.write("-->                    <a href=\"Logout.jsp\">Logout</a> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header> \n");
      out.write("        <div class=\"logIn\">\n");
      out.write("                <form action=\"AdminControllerEG\" class=\"manageusers-page\">   ");
      out.write("                                 \n");
      out.write("                    <input type=\"submit\" name=\"menu\" value=\"Manage Users\" />\n");
      out.write("                    <input type=\"submit\" name=\"menu\" value=\"logout\" />\n");
      out.write("                </form>\n");
      out.write("                <form action=\"ShowControllerEG\" class=\"shows-page\">\n");
      out.write("                   <input type=\"submit\" name=\"menu\" value=\"Add Show\" />  \n");
      out.write("                   <input type=\"submit\" name=\"menu\" value=\"All Shows\"/>\n");
      out.write("                </form>\n");
      out.write("            <table id=\"m\">\n");
      out.write("                    <tr>             \n");
      out.write("                        <td>image</td>\n");
      out.write("                        <td>show title</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </table>\n");
      out.write("<!--                <table id=\"m\">\n");
      out.write("                    <tr>             \n");
      out.write("                        <td>username</td>\n");
      out.write("                    </tr>\n");
      out.write("              <!--\n");
      out.write("                        <tr>                                            \n");
      out.write("                            <td ><a href=\"UserControllerEG?menu=getUserView&user_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a> </td>\n");
      out.write("                            <td ><a href=\"UserControllerEG?menu=deleteUsers&user_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Delete</a> </td>\n");
      out.write("                            <td ><a href=\"UserControllerEG?menu=updateUsers&user_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Update</a> </td>\n");
      out.write("                         </tr>\n");
      out.write("\n");
      out.write("                    </table>-->\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("shows");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allshows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                  \n");
          out.write("                        <tr>                                            \n");
          out.write("                            <td ><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shows.show_image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"shows\" width=\"80\" height=\"80\"></td>\n");
          out.write("                            <td ><a href=\"ShowControllerEG?menu=getShowView&show_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shows.show_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shows.show_title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a> </td>\n");
          out.write("                            <td ><a href=\"ShowControllerEG?menu=deleteShow&show_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shows.show_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">delete</a> </td>\n");
          out.write("                            <td ><a href=\"ShowControllerEG?menu=updateShow&show_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shows.show_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">update</a> </td>\n");
          out.write("                         </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
