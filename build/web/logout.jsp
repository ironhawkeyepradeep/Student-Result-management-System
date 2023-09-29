<%
 HttpSession ss=request.getSession();
         
        ss.invalidate();
       response.sendRedirect("lg.jsp");
%>