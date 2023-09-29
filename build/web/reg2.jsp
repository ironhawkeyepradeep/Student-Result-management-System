<%@page import="java.sql.*"%>
<%
 out.println("<html>");
	out.println("<body>");
	String s1=request.getParameter("un");
	String s2=request.getParameter("up");
	try{        //"com.mysql.jdbc.Driver"
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
        st.executeUpdate("insert into demo values('"+s1+"','"+s2+"')");
	response.sendRedirect("lg.jsp");
	con.close();
	}
	catch(Exception e){
	out.println(e);
	}
	
	out.println("<h1> data insert</h1>");
	out.println("</body>");
	out.println("</html>");
	out.close();   
%>