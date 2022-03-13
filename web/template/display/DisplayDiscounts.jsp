<%-- 
    Document   : DisplayDiscounts
    Created on : Feb 10, 2022, 4:07:33 PM
    Author     : ptuan
--%>

<%@page import="java.util.Vector"%>
<%@page import="model.DAOdiscounts,entity.discounts"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%String titlepage = (String) request.getAttribute("titlepage");%>
        <title><%=titlepage%></title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="box">
            <a href="index.html" class="home"> Home</a>
        </div>
        <%
            Vector<discounts> vector = (Vector<discounts>) request.getAttribute("list");
            String titleTable = (String) request.getAttribute("titleTabale");
        %>

        <table border="1">
            <caption><%=titleTable%></caption>
            <thead>
                <tr>
                    <th>Discounttype</th>
                    <th>stor_id</th>
                    <th>lowqty</th>
                    <th>highqty</th>
                    <th>discount</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (discounts elem : vector) {
                %>
                <tr>
                    <td><%=elem.getDiscounttype()%></td>
                    <td><%=elem.getStor_id()%></td>
                    <td><%=elem.getLowqty()%></td>
                    <td><%=elem.getHighqty()%></td>
                    <td><%=elem.getDiscount()%></td>
                    <td><a href="PublishersController?go=updatePublisher&pub_id=<%=elem.getPub_id()%>"> Update</td>
                    <td><a href="PublishersController?go=deletepub&pub_id=<%=elem.getPub_id()%>"> Delete</td>
                    <%}%>
                </tr>
            </tbody>
        </table>
    </body>
</html>
