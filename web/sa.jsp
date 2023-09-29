 <%@page import="java.sql.*"%>
 
 <%@include file="hd.jsp" %> %>   
<%
Class.forName("com.mysql.jdbc.Driver");
try{	
Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from  indemo");
    out.println("<center>");
        out.println("<form action='menu.jsp'>");
        out.println("<table bgcolor='red' cellpadding='12' border='1'>");
	out.println("<tr>");
    out.println("<th>Roll no </th>");
    out.println("<th>Name </th>");
    out.println("<th>Phy </th>");
    out.println("<th>Che </th>");
    out.println("<th>Maths </th>");
        while(rs.next()){
        out.println("<tr>");
	out.println("<td>"+rs.getString(1)+"</td>");
	out.println("<td>"+rs.getString(2)+"</td>");
	out.println("<td>"+rs.getString(3)+"</td>");
	out.println("<td>"+rs.getString(4)+"</td>");
	out.println("<td>"+rs.getString(5)+"</td>");
	out.println("</tr>"); }
	con.close();
	}
	catch(Exception e){
	out.println(e);
        }
	
	out.println("<tr>");
	out.println("<th colspan='5'><input type=\"submit\" class=\"B\" value=\"Home\"></th>");
	out.println("</tr>");
    out.println("</table>");
    out.println("</form>");
    out.println("</center>");
	out.println("</body>");
	out.println("</html>");
%>