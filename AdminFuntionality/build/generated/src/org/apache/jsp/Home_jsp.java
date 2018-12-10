package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/font.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/colour.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <style>\n");
      out.write(".mySlides {display:none}\n");
      out.write(".w3-left, .w3-right, .w3-badge {cursor:pointer}\n");
      out.write(".w3-badge {height:13px;width:13px;padding:0}\n");
      out.write("</style>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<!--        <link href=\"fonts/OpenSans-Regular.ttf\" rel=\"fonts\" type=\"text/css\">-->\n");
      out.write("        <title>Log In</title> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"logIn-page\">\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("                <div class=\"Logo\">\n");
      out.write("                <img src=\"images/litGalleryLogo.png\" alt=\"Logo\"/ height=\"800px\" width=\"300px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <label for=\"toggle\">&#9776;</label>\n");
      out.write("                    <input type=\"checkbox\" id=\"toggle\"/>\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("\n");
      out.write("                        <a href=\"Home.jsp\">Home</a>\n");
      out.write("<!--                        <a href=\"Gallery.html\">Gallery</a>-->\n");
      out.write("                        <a href=\"Shows.jsp\">Shows</a>\n");
      out.write("<!--                        <a href=\"Profile.html\">Profile</a> -->\n");
      out.write("                        <a href=\"SignUp.jsp\">SignIn</a> \n");
      out.write("                        <a href=\"Logout.jsp\">Logout</a> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header> \n");
      out.write("            <body>\n");
      out.write("                <div class=\"BodyCol\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"w3-content w3-display-container\">\n");
      out.write("                <img class=\"mySlides\" src=\"img/Sample1.png\" height=\"800px\" width=90% class=\"center\">\n");
      out.write("                <img class=\"mySlides\" src=\"img/Sample2.jpg\" height=\"800px\" width=90% class=\"center\">\n");
      out.write("                <img class=\"mySlides\" src=\"img/Sample3.jpg\" height=\"800px\" width=90% class=\"center\">\n");
      out.write("                <img class=\"mySlides\" src=\"img/Sample5.jpg\" height=\"800px\" width=90% class=\"center\"> \n");
      out.write("                <div class=\"w3-center w3-display-bottommiddle\" style=\"width:100%\">\n");
      out.write("                <div class=\"wrapper\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  <div class=\"w3-center w3-container w3-section w3-large w3-text-white w3-display-bottommiddle\" style=\"width:100%\">  \n");
      out.write("                    \n");
      out.write("                <div class=\"buttonCon\">   \n");
      out.write("                <div class=\"w3-left\" onclick=\"plusDivs(-1)\">&#10094;</div>\n");
      out.write("                <div class=\"w3-right\" onclick=\"plusDivs(1)\">&#10095;</div>\n");
      out.write("                </div> \n");
      out.write("                </div>    \n");
      out.write("                    \n");
      out.write("                <span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(1)\"></span>\n");
      out.write("                <span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(2)\"></span>\n");
      out.write("                <span class=\"w3-badge demo w3-border w3-transparent w3-hover-white\" onclick=\"currentDiv(3)\"></span>\n");
      out.write("                </div>\n");
      out.write("                </div></div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <div class=\"HomeMessage\">\n");
      out.write("                    \n");
      out.write("                <h1>\n");
      out.write("                    \n");
      out.write("                Home\n");
      out.write("                    \n");
      out.write("                </h1> \n");
      out.write("                    \n");
      out.write("                <p>\n");
      out.write("                    \n");
      out.write("                    Welcome to the home of our gallery site.    \n");
      out.write("                    \n");
      out.write("                </p> \n");
      out.write("                    \n");
      out.write("                <p>\n");
      out.write("                    \n");
      out.write("                   Here you can navigate to our gallery and shows pages.    \n");
      out.write("                    \n");
      out.write("                </p>   \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("               \n");
      out.write("                \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <div class=\"titles\"><h2>Gallery</h2></div>   \n");
      out.write("            \n");
      out.write("            <img src=\"img/Sample3.jpg\" alt=\"Sample\"/ height=\"550px\" width=60% class=\"center\">    \n");
      out.write("            \n");
      out.write("            <div class=\"titles2\"><h2>Shows</h2></div>   \n");
      out.write("            <div class=\"ImgHoBot\">\n");
      out.write("            <img src=\"img/Sample5.jpg\" alt=\"Sample\"/ height=\"450px\" width=40%> \n");
      out.write("            \n");
      out.write("            <img src=\"img/Sample5.jpg\" alt=\"Sample\"/ height=\"450px\" width=40%> \n");
      out.write("           </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            </body>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <footer></footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("var slideIndex = 1;\n");
      out.write("showDivs(slideIndex);\n");
      out.write("\n");
      out.write("function plusDivs(n) {\n");
      out.write("  showDivs(slideIndex += n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function currentDiv(n) {\n");
      out.write("  showDivs(slideIndex = n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showDivs(n) {\n");
      out.write("  var i;\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"demo\");\n");
      out.write("  if (n > x.length) {slideIndex = 1}    \n");
      out.write("  if (n < 1) {slideIndex = x.length}\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("     x[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("     dots[i].className = dots[i].className.replace(\" w3-white\", \"\");\n");
      out.write("  }\n");
      out.write("  x[slideIndex-1].style.display = \"block\";  \n");
      out.write("  dots[slideIndex-1].className += \" w3-white\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
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
