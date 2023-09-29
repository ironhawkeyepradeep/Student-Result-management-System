import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class dl extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
        int n=0;
	out.println("<html>");
	out.println("<body>");
        out.println("<head>\n" +"<link rel=\"stylesheet\" href=\"abc.css\">\n" +"</head>\n" +"<body background=\"bg3.jpg\">\n" +"<!-- <div id=\"mymenu\"> -->\n" +"<center>"+"<div id=\"mymenu\">\n" +"<ul>\n" +"<li><a href=\"menu\" >Home</a></li>\n" +"<li> <a href=\"menu.html\">insert </a></li>\n" +"<li>  <a href=\"se.html\">search</a></li>\n" +"<li>  <a href=\"dl.html\">delete</a></li>\n" +"<li>  <a href=\"up.html\">update</a></li>\n" +"<li>  <a href=\"sa\">showall</a></li>\n" +"<li> Contact</li>\n" +"<li><a href='logout'> Logout</a></li>\n" +"</ul>\n" +"</div>");
	String s1=request.getParameter("u1");
	try{        
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
	n= st.executeUpdate("delete  from  indemo where Rollno='"+s1+"'");
	out.println("<form action='sa'>");
        out.println("<table bgcolor='red' cellpadding='12' border='1'>");
	if(n!=0){
        out.println("<tr>");
	out.println("<th>Data deleted</th>");
	out.println("</tr>");    
        }else
        {
        out.println("<tr>");
	out.println("<th>Data not found</th>");
        out.println("</tr>");
        }
	con.close();
	}
	catch(Exception e){
	out.println(e);
	}
	
	out.println("<tr>");
	out.println("<th colspan='5'><input type=\"submit\" class=\"B\" value=\"Showall\"></th>");
	out.println("</tr>");
    out.println("</table>");
    out.println("</form>");
    out.println("</center>");
	out.println("</body>");
	out.println("</html>");
	out.close();
}
}