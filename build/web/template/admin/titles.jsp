
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

        Vector<tiltes> vector = (Vector<tiltes>) request.getAttribute("list");

    %>

    <!-- head -->

    <body>

        <!-- Header Section Begin -->
        <%@include file="../header-admin.jsp" %>
        <!-- Header Section End -->

        <div class="container-fluid">
            <form action="TitleController?go=search" method="post" class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="query">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
            <br>
            <a href="Insert/InsertTitle.html" type="button" class="btn btn-primary">Add new item</a>
            <br>
            <br>
            <h3 class="text-center" >Title Manager</h3>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Img</th>
                        <th scope="col">ID</th>
                        <th scope="col">Title</th>
                        <th scope="col">Type</th>
                        <th scope="col">Pub_ID</th>
                        <th scope="col">Price</th>
                        <th scope="col">Advance</th>
                        <th scope="col">Royalty </th>
                        <th scope="col">YTD_Sales</th>
                        <th scope="col">Notes</th>
                        <th scope="col">Pub date</th>                        
                         <th scope="col">Action</th>

                    </tr>
                </thead>
                <tbody>
                    <%  for (tiltes elem : vector) {
                    %>
                    <tr>
                         <td><img width="220px" heigh="220px" class="rounded" src='<%=elem.getPath()%>'></td>
                        <td><%=elem.getTitle_id()%></td>
                        <td><%=elem.getTitle()%></td>
                        <td><%=elem.getType()%></td>
                        <td><%=elem.getPub_id()%></td>
                        <td><%=elem.getPrice()%></td>
                        <td><%=elem.getAdvance()%></td>
                        <td><%=elem.getRoyalty()%></td>
                        <td><%=elem.getYtd_sales()%></td>
                        <td><%=elem.getNotes()%></td>
                        <td><%=elem.getPubdate()%></td>                     
                        <td><a  class="btn btn-primary" href="TitleController?go=updateTitle&titleID=<%=elem.getTitle_id()%>">Update</a></td>
                            <% }%>

                    </tr>
                </tbody>
            </table>
        </div> 

        <%@include file="../jslib.jsp" %>

    </body>

</html>
