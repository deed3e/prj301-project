<%-- 
    Document   : add2Cart
    Created on : Feb 24, 2022, 3:17:17 PM
    Author     : ptuan
--%>

<%@page import="entity.tiltes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String key = request.getParameter("titleId");
            tiltes title = (tiltes) session.getAttribute(key);
            if(title == null){
                title.setQty(1);
                session.setAttribute(key, title);
            }
            else{
                title.setQty(title.getQty()+1);
                session.setAttribute(key, title);
            }
        %>
        <h1> Item with id = <%=key%> was added to the Shopping Cart </h1>
        <h2>
            <a href="showCart.jsp"> Show Shoping Cart
        </h2>
        <p> <%=title%>
    </body>
</html>
