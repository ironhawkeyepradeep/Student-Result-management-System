<%  
Cookie ck[]=request.getCookies();
       //HttpSession ss=request.getSession();
       // String s1=(String)ss.getAttribute("uname");
       
      // if(s1!=null)
//      if(ck!=null)
//      {
        out.println("<html>");
	out.println("<body>");
        out.println("<head>\n" +"<link rel=\"stylesheet\" href=\"abc.css\">\n" +"</head>\n" +"<body background=\"bg3.jpg\">\n" +"<!-- <div id=\"mymenu\"> -->\n" +"<center>"+"<div id=\"mymenu\">\n" +"<ul>\n" +"<li><a href=\"menu.jsp\" >Home</a></li>\n" +"<li> <a href=\"in.jsp\">insert </a></li>\n" +"<li>  <a href=\"se.jsp\">search</a></li>\n" +"<li>  <a href=\"dl.jsp\">delete</a></li>\n" +"<li>  <a href=\"up.jsp\">update</a></li>\n" +"<li>  <a href=\"sa.jsp\">showall</a></li>\n" +"<li> Contact</li>\n" +"<li><a href='logout.jsp'> Logout</a></li>\n" +"</ul>\n" +"</div>");
      //  out.println("<p style='font-family:Algerian;font-size:100px;color:white;background:linear-gradient(to right,red,black,blue);'>Wellcome<br> "+"</p>");
        out.println("</center>");
	out.println("</body>");
	out.println("</html>");
        //}
//        else {
//        response.sendRedirect("lg.jsp");
//        }
        %>