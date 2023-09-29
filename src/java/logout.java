import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class logout extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
        //HttpSession ss=request.getSession();
         
      //  ss.invalidate();
        Cookie ck=new Cookie("un","");
        ck.setMaxAge(00);
      response.addCookie(ck);
        
       response.sendRedirect("login.html");
	out.close();
}
}