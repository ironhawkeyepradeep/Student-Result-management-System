package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<body background=\"bg3.jpg\">\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css\">\n");
      out.write("</head><!-- <div id=\"mymenu\"> -->\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"lg.jsp\" >Home</a></li>\n");
      out.write("<li> <a href=\"lg.jsp\">Login </a></li>\n");
      out.write("<li>  <a href=\"reg.jsp\">Registration</a></li>\n");
      out.write("<li> Contact</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<!-- </div> -->\n");
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("<form action=\"lg2.jsp\">\n");
      out.write("<table cellpadding=\"20\" >\n");
      out.write("<caption> LogIn Page</caption>\n");
      out.write("<tr>\n");
      out.write("<td>Enter Name </td>\n");
      out.write("<td><input type=\"text\" placeholder=\"Enter Name\" name=\"un\" class=\"A\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Enter Pass </td>\n");
      out.write("<td><input type=\"password\" placeholder=\"Enter password\" name=\"up\" class=\"A\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"> <input type=\"submit\"  value=\"LogIn\" class=\"B\"</th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
