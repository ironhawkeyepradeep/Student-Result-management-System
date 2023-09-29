<%@page import="java.sql.*" %>
<html>
    <head>
    <%@include file="hd.jsp" %>    
    </head>
<div id="data">
<center>
<form action="se1.jsp">
<table cellpadding="20">
<caption> search data</caption>
<tr>
<td>Enter Rollno </td>
<td><input type="text" placeholder="Enter Name" name="u1" class="A"></td>
</tr> 
<tr>
<th colspan="2"> <input type="submit" class="B" name="b1" value="search"></th>
</tr>
</table>
</center>
</div>
</body>
</html>
 
<%
// String b11=request.getParameter("b1");
// String s1=request.getParameter("u1");
// if(b11!=null)
// {
// try{        
//	Class.forName("com.mysql.jdbc.Driver");
//	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
//	Statement st=con.createStatement();
//	ResultSet rs=st.executeQuery("select * from  indemo where Rollno='"+s1+"'");
//	out.println("<form action='up.jsp'>");
//        out.println("<table bgcolor='red' cellpadding='12' border='1'>");
//	if(rs.next()){
//	out.println("<tr>");
//        out.println("<th>Rollno </th>");
//	out.println("<td><textarea name=u1>"+rs.getString(1)+"</textarea></td>");
//	out.println("</tr>");
//        out.println("<tr>");
//        out.println("<th>Name </th>");
//	out.println("<td><textarea name=u2>"+rs.getString(2)+"</textarea></td>");
//	out.println("</tr>");
//        out.println("<tr>");
//        out.println("<th>Phy </th>");
// 	out.println("<td><textarea name=u3>"+rs.getString(3)+"</textarea></td>");
//	out.println("</tr>");
//        out.println("<tr>");
//        out.println("<th>Chem </th>");
//	out.println("<td><textarea name=u4>"+rs.getString(4)+"</textarea></td>");
//	out.println("</tr>");
//        out.println("<tr>");
//        out.println("<th>Maths </th>");
//	out.println("<td><textarea name=u5>"+rs.getString(5)+"</textarea></td>");
//	out.println("</tr>");
//	}
//      
//	con.close();
//	}
//	catch(Exception e){
//	out.println(e);
//	}
//	
//	out.println("<tr>");
//	//out.println("<th colspan='5'><input type=\"submit\" class=\"B\" name='b12' value=\"Update\"></th>");
//	out.println("</tr>");
//    out.println("</table>");
// }
// 
 %>