<%-- 
    Document   : showCart.jsp
    Created on : Feb 24, 2022, 3:59:38 PM
    Author     : pallgree
--%>

<%@page import="entity.Cart"%>
<%@page import="entity.tiltes"%>
<%@page import="entity.employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% 
                java.util.Enumeration em = session.getAttributeNames();
                String key1=em.nextElement().toString();
                employee em1=(employee)session.getAttribute(key1);
                String name=em1.getFname()+" "+em1.getLname();
        %>
    </head>
    <body>
        Employee: <%=name%>
        <h1>Shopping Cart Details</h1>
        <table border="1">
            <thead>
                <tr>                   
                    <th>Name</th>
                    <th>Quantity</th>
                    <th>Remove</th>
                </tr>
            </thead>
            <tbody>
                <%
                    
                    double sum = 0, total = 0;
                     String key="";
                     String count="";
                    while (em.hasMoreElements()) {
                        
                         key = em.nextElement().toString();
                        if(!key.contains(key1) ) {
                        count = (String) session.getAttribute(key);
                       
                %>
                <tr>
                    <td><%=key%></td>
                    <td><%=count%></td>
                    <td>remove</td>
                    <td></td>
                </tr>
                <%}}%>
            </tbody>
            <tfoot>
                <tr>
                    <th>Total</th>
                    <td><%= total%></td>
                    <td>Remove All</td>
                </tr>
            </tfoot>
        </table>
        


        <h2><a href="JSP/checkOut.jsp">Check-out</h2>

    </body>
</html>
