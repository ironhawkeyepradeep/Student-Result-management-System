import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet1 extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	String s1=request.getParameter("un");
	String s2=request.getParameter("up");
	try{        //"com.mysql.jdbc.Driver"
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false&allowPublicKeyRetrieval=true","root","root");
	Statement st=con.createStatement();
	st.executeUpdate("insert into demo values('"+s1+"','"+s2+"')");
	response.sendRedirect("login.html");
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