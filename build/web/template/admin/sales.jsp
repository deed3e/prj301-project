
<%@page import="entity.sales"%>
<%@page import="entity.tiltes"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
    <!-- head -->
    <%@include file="../head.jsp" %>
    <%
        String user = "1";
        try {

            user = (String) session.getAttribute("user");
        } catch (Exception e) {
        }

        Vector<sales> vector = (Vector<sales>) request.getAttribute("list");

        %>

    <!-- head -->

    <body>

        <!-- Header Section Begin -->
        <%@include file="../header-admin.jsp" %>
        <!-- Header Section End -->

        <div class="container-fluid">
            <form action="SalesController?go=search" method="post" class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search by id" aria-label="Search by id" name="query">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
            <br>
            <a href="Insert/InserSales.html" type="button" class="btn btn-primary">Add new item</a>
            <br>
            <br>
            <h3 class="text-center" >Sales Manager</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col" >Stor_id</th>
                        <th scope="col" >Ord_num</th>
                        <th scope="col">Ord_date</th>
                        <th scope="col">Qty</th>
                        <th scope="col">Payterms</th>
                        <th scope="col">Title_id</th>
                        <th scope="col">Status</th>
                        <th scope="col">Action</th>
                        

                    </tr>
                </thead>
                <tbody>
                    <%                    for (sales elem : vector) {
                %>
                <tr>
                    <td><%=elem.getStor_id()%></td>
                    <td><%=elem.getOrd_num()%></td>
                    <td><%=elem.getOrd_date()%></td>                  
                    <td><%=elem.getQty()%></td>                   
                    <td><%=elem.getPayterms()%></td>
                    <td><%=elem.getTitle_id()%></td>
                    <td><%=elem.getStatus()%></td>
                    <td><a class="btn btn-primary" href="SalesController?go=updateSale&storID=<%=elem.getStor_id()%>"> Update</a>
                    <a class="btn btn-primary"  href="SalesController?go=deleteSales&storID=<%=elem.getStor_id()%>"> Delete</a></td>
                    <%}%>
                </tr>
                </tbody>
            </table>
        </div> 

        <%@include file="../jslib.jsp" %>

    </body>

</html>
