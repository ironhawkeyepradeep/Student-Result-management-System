<%@page import="java.sql.*" %>
<%@include file="hd.jsp" %>
<%
String s1=request.getParameter("u1");
    out.println("<center>");
	try{        
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from  indemo where Rollno='"+s1+"'");
    
	out.println("<form action='se.jsp'>");
        out.println("<table bgcolor='red' cellpadding='12' border='1'>");
	out.println("<tr>");
    out.println("<th>Rollno </th>");
    out.println("<th>Name </th>");
    out.println("<th>phy </th>");
    out.println("<th>Che </th>");
    out.println("<th>Maths </th>");
	out.println("</tr>");
	if(rs.next()){
	out.println("<tr>");
	out.println("<td>"+rs.getString(1)+"</td>");
	out.println("<td>"+rs.getString(2)+"</td>");
	out.println("<td>"+rs.getString(3)+"</td>");
	out.println("<td>"+rs.getString(4)+"</td>");
	out.println("<td>"+rs.getString(5)+"</td>");
	out.println("</tr>");
	}
        else
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
	out.println("<th colspan='5'><input type=\"submit\" class=\"B\" value=\"Search\"></th>");
	out.println("</tr>");
    out.println("</table>");
    out.println("</center>");
	out.println("</body>");
	out.println("</html>");

%>