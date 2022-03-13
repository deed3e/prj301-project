
<%@page import="entity.stores"%>
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

        Vector<stores> vector = (Vector<stores>) request.getAttribute("list");
        String titleTable = (String) request.getAttribute("titleTabale");

        %>

    <!-- head -->

    <body>

        <!-- Header Section Begin -->
        <%@include file="../header-admin.jsp" %>
        <!-- Header Section End -->

        <div class="container-fluid">
            <form action="StoresController?go=searchByName" method="post" class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="query">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
            <br>
            <a href="Insert/InsertStores.html" type="button" class="btn btn-primary">Add new item</a>
            <br>
            <br>
            <h3 class="text-center" >Store Manager</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Store ID</th>
                        <th scope="col">Store Name</th>
                        <th scope="col">Store Address</th>
                        <th scope="col">City</th>
                        <th scope="col">State</th>
                        <th scope="col">Zip</th>
                        <th scope="col">Action </th>
                    </tr>
                </thead>
                <tbody>
                    <%  for (stores elem : vector) {
                    %>
                    <tr>
                        <td><%=elem.getStor_id()%></td>
                        <td><%=elem.getStor_name()%></td>
                        <td><%=elem.getStor_address()%></td>
                        <td><%=elem.getCity()%></td>
                        <td><%=elem.getState()%></td>
                        <td><%=elem.getZip()%></td>
                        <td><a class="btn btn-primary" href="StoresController?go=updateStore&stor_id=<%=elem.getStor_id()%>">Update</a>
                        <a class="btn btn-primary" href="StoresController?go=deleteStore&stor_id=<%=elem.getStor_id()%>">Delete</a>
                        <a class="btn btn-primary" href="StoresController?go=storedetail&storID=<%=elem.getStor_id()%>&storname=<%=elem.getStor_name()%>">Detail</a>
                        </td>
                        <% }%>

                    </tr>
                </tbody>
            </table>
        </div> 

        <%@include file="../jslib.jsp" %>

    </body>

</html>
