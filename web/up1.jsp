<%@page import="java.sql.*" %>
<%
    String s12=request.getParameter("b2");
    if(s12!=null){
    String s11=request.getParameter("n1");
        String s22=request.getParameter("n2");
        String s33=request.getParameter("n3");
        String s44=request.getParameter("n4");
        String s55=request.getParameter("n5");
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///psy?useSSL=false&allowPublicKeyRetrieval=true","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("Update indemo set name='"+s11+"',Phy='"+s33+"',Math='"+s44+"',Chem='"+s55+"'where Rollno='"+s22+"'");

response.sendRedirect("sa.jsp");
		con.close();
	}
	catch(Exception e11){
		out.println(e11);
	}
    }
%>