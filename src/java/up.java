import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class up extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
        out.println("<head>\n" +"<link rel=\"stylesheet\" href=\"abc.css\">\n" +"</head>\n" +"<body background=\"bg3.jpg\">\n" +"<!-- <div id=\"mymenu\"> -->\n" +"<center>"+"<div id=\"mymenu\">\n" +"<ul>\n" +"<li><a href=\"menu\" >Home</a></li>\n" +"<li> <a href=\"menu.html\">insert </a></li>\n" +"<li>  <a href=\"se.html\">search</a></li>\n" +"<li>  <a href=\"dl.html\"></a>delete</li>\n" +"<li>  <a href=\"up.html\"></a>update</li>\n" +"<li>  <a href=\"sa\"></a>showall</li>\n" +"<li> Contact</li>\n" +"<li> <a href='logout'> Logout</a></li>\n" +"</ul>\n" +"</div>");
	String s1=request.getParameter("u1");
	try{        
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from  indemo where Rollno='"+s1+"'");
    
	out.println("<form action='up1'>");
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
	out.println("<th colspan='5'><input type=\"submit\" class=\"B\" value=\"Update\"></th>");
	out.println("</tr>");
    out.println("</table>");
    out.println("</center>");
	out.println("</body>");
	out.println("</html>");
	out.close();
}
}