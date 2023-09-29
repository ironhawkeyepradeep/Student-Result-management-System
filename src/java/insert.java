import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class insert extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	String s1=request.getParameter("u1");
	String s2=request.getParameter("u2");
	String s3=request.getParameter("u3");
	String s4=request.getParameter("u4");
	String s5=request.getParameter("u5");
	try{        //"com.mysql.jdbc.Driver"
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
        st.executeUpdate("insert into indemo values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
	response.sendRedirect("menu.html");
        con.close();
	}
	catch(Exception e){
	out.println(e);
	}
	
	out.println("<h1> data insert</h1>");
	out.println("</body>");
	out.println("</html>");
	out.close();
}
}