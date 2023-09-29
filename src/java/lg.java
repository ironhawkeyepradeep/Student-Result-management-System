import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class lg extends HttpServlet{
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
	ResultSet rs=st.executeQuery("select * from demo where uname='"+s1+"'AND upass='"+s2+"'");
	if(rs.next()){
            //HttpSession ss=request.getSession();
            //ss.setAttribute("uname",s1);
            
       Cookie ck=new Cookie("un",s1);
       ck.setMaxAge(60*2);
       response.addCookie(ck);
            response.sendRedirect("menu");
        
        }
        else
        response.sendRedirect("index 2.html");   
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