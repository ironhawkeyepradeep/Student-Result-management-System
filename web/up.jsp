<%@page import="java.sql.*"%>
        <html>
            <head>
                <%@include file="hd.jsp" %>
                <center>
<form action="up.jsp">
<table cellpadding="12">
<caption>Update Page</caption>
<tr>

<td>Enter RollNo</td>
<td><input type="text" placeholder="Roll No" name="ur" class="t1"></td>
</tr>
<tr>
    <th colspan="2"><input type="submit" class="B" name="b1" value="search"></th>
<tr>
</table>
</form>
<% 
    String s1=request.getParameter("ur");
    if(s1!=null){
    try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false&allowPublicKeyRetrieval=true","root","root");
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("Select * from indemo where Rollno='"+s1+"'");
%>
  <form action="up1.jsp">
     <table>
   <%
      
if(rs.next()){%>  
       
<tr>    
    <td>RollN</td>
    <td><input type="text" value=<%=rs.getString(1)%> name="n2"></td>
</tr>
<tr>    
    <td>Name</td>
    <td><input type="text" value=<%=rs.getString(2)%> name="n1"></td>
</tr>
<tr>    
    <td>Phy</td>
   <td><input type="text" value=<%=rs.getString(3)%> name="n3"></td>
</tr>
 <tr>    
    <td>Maths</td>
    <td><input type="text" value=<%=rs.getString(4)%> name="n4"></td>
</tr>
 <tr>    
    <td>Chem</td>
    <td><input type="text" value=<%=rs.getString(5)%> name="n5"></td>
</tr>   

<tr>
    <th colspan="2"><input type="submit" name="b2" value="update" class="B"></th>
</tr>
<%}
else{
out.println("Data not Found");
}%>
 </table>
  </form>
 </center>
<%}
 

	catch(Exception e1){
		out.println(e1);

}
}
    
%>
        </center>
        </body>
</html>