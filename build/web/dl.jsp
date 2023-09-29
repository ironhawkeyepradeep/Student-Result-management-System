<%@page import="java.sql.*" %>
<html>
    <head>
    <%@include file="hd.jsp" %>    
    </head>
<div id="data">
<center>
<form action="dl.jsp">
<table cellpadding="20">
<caption> delete data</caption>
<tr>
<td>Enter Rollno </td>
<td><input type="text" placeholder="Enter Name" name="u1" class="A"></td>
</tr> 
<tr>
<th colspan="2"> <input type="submit" name="b1" class="B" value="delete"></th>
</tr>
</table>
</center>
</div>
</body>
</html>
<%
String b1=request.getParameter("b1");
String s1=request.getParameter("u1");
int n=0;
if(b1!=null){
try{        
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false","root","root");
	Statement st=con.createStatement();
	n= st.executeUpdate("delete  from  indemo where Rollno='"+s1+"'");
	out.println("<form action='sa.jsp'>");
        out.println("<table bgcolor='red' cellpadding='12' border='1'>");
	if(n!=0){
       response.sendRedirect("sa.jsp");
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
}

%>