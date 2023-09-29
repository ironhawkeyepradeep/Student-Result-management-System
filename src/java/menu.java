import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class menu extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
       Cookie ck[]=request.getCookies();
       //HttpSession ss=request.getSession();
       // String s1=(String)ss.getAttribute("uname");
       
      // if(s1!=null)
      if(ck!=null)
      {
        out.println("<html>");
	out.println("<body>");
        out.println("<head>\n" +"<link rel=\"stylesheet\" href=\"abc.css\">\n" +"</head>\n" +"<body background=\"bg3.jpg\">\n" +"<!-- <div id=\"mymenu\"> -->\n" +"<center>"+"<div id=\"mymenu\">\n" +"<ul>\n" +"<li><a href=\"menu\" >Home</a></li>\n" +"<li> <a href=\"menu.html\">insert </a></li>\n" +"<li>  <a href=\"se.html\">search</a></li>\n" +"<li>  <a href=\"dl.html\">delete</a></li>\n" +"<li>  <a href=\"up.html\">update</a></li>\n" +"<li>  <a href=\"sa\">showall</a></li>\n" +"<li> Contact</li>\n" +"<li><a href='logout'> Logout</a></li>\n" +"</ul>\n" +"</div>");
       out.println("<p style='font-family:Algerian;font-size:100px;color:white;background:linear-gradient(to right,red,black,blue);'>Wellcome<br> "+ck[0].getValue()+"</p>");
        out.println("</center>");
	out.println("</body>");
	out.println("</html>");
        }
        else {
        response.sendRedirect("login.html");
        }
	out.close();
}
}