package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class up_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/hd.jsp");
  }

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


String b11=request.getParameter("b1");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    ");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css\">\n");
      out.write("</head>\n");
      out.write("<body background=\"bg1.jpg\">\n");
      out.write("<!-- <div id=\"mymenu\"> -->\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"menu.jsp\" >Home</a></li>\n");
      out.write("<li> <a href=\"in.jsp\">insert </a></li>\n");
      out.write("<li>  <a href=\"se.jsp\">search</a></li>\n");
      out.write("<li>  <a href=\"dl.jsp\">delete</a></li>\n");
      out.write("<li>  <a href=\"up.jsp\">update</a></li>\n");
      out.write("<li>  <a href=\"sa.jsp\">showall</a></li>\n");
      out.write("<li> Contact</li>\n");
      out.write("<li><a href='logout'> Logout</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("<form action=\"up.jsp\">\n");
      out.write("<table cellpadding=\"20\">\n");
      out.write("<caption> Update data</caption>\n");
      out.write("<tr>\n");
      out.write("<td>Enter Rollno </td>\n");
      out.write("<td><input type=\"text\" placeholder=\"Enter Name\" name=\"u1\" class=\"A\"></td>\n");
      out.write("</tr> \n");
      out.write("<tr>\n");
      out.write(" ");

 if(b11==null){
 
      out.write("\n");
      out.write("<th colspan=\"2\"> <input type=\"submit\" class=\"B\" name=\"b1\" value=\"Update\"></th>\n");
      out.write(" ");

 }
 
      out.write("\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    \n");

 String s1=request.getParameter("u1");
 if(b11!=null)
 {
 try{        
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from  indemo where Rollno='"+s1+"'");
	out.println("<form action='up1.jsp'>");
        out.println("<table bgcolor='red' cellpadding='12' border='1'>");
	if(rs.next()){
	out.println("<tr>");
        out.println("<th>Rollno </th>");
	out.println("<td><textarea name=u1>"+rs.getString(1)+"</textarea></td>");
	out.println("</tr>");
        out.println("<tr>");
        out.println("<th>Name </th>");
	out.println("<td><textarea name=u2>"+rs.getString(2)+"</textarea></td>");
	out.println("</tr>");
        out.println("<tr>");
        out.println("<th>Phy </th>");
 	out.println("<td><textarea name=u3>"+rs.getString(3)+"</textarea></td>");
	out.println("</tr>");
        out.println("<tr>");
        out.println("<th>Chem </th>");
	out.println("<td><textarea name=u4>"+rs.getString(4)+"</textarea></td>");
	out.println("</tr>");
        out.println("<tr>");
        out.println("<th>Maths </th>");
	out.println("<td><textarea name=u5>"+rs.getString(5)+"</textarea></td>");
	out.println("</tr>");
	}
      
	con.close();
	}
	catch(Exception e){
	out.println(e);
	}
	
	out.println("<tr>");
	out.println("<th colspan='5'><input type=\"submit\" class=\"B\" name='b12' value=\"Update\"></th>");
	out.println("</tr>");
	out.println("</form >");
    out.println("</table>");
 }

      out.write("\n");
      out.write("</center>\n");
      out.write(" ");

String b12=request.getParameter("b12");
if(b12!=null)
{
 response.sendRedirect("up1.jsp");       
}

      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" ");
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
