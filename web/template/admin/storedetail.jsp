<%-- 
    Document   : StoreDetail
    Created on : Feb 17, 2022, 4:24:51 PM
    Author     : pallgree
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Store Detail</title>
    </head>
    <script>
         function fun(){
                 document.getElementById("content").value=document.getElementById("dropbox").value;
             }
    </script>
    <%
        int err=0;
    %>
    <body>
        <%
            try{
            ResultSet rs = (ResultSet) request.getAttribute("rs");
            String storeid1= (String )request.getAttribute("storeid");
            String storename= (String )request.getAttribute("storename");
            ResultSet rs1=(ResultSet)request.getAttribute("status");
            rs1.absolute(1);
            int status= rs1.getInt(1);
            rs1.last();    
            int sumTitles=rs1.getRow();
            rs1.first();
        %>
            <h4>Store id: <%=storeid1%></h4>
            <h4>Store name: <%=storename%></h4>
            
            <select name="status" id="dropbox" onchange="fun()">
                        <option value="1">Wait</option>
                        <option value="2">Process</option>
                        <option value="3">Done</option>
            </select>
            
            <form name="update status" action="StoresController?go=autoupdate" method="post">  
                    <input type="hidden" value="1" id="content" name="content" />
                    <input type="hidden" value="<%=storeid1%>" id="id" name="id" />  
                    <input type="submit" value="submit"/>
            </form>
            <br>
            <h3> <%=sumTitles%></h3>
            <table border="1">
                <thead>
                    <tr>
                        <th>OrderNum</th>
                        <th>Title</th>
                        <th>Quantity</th>
                        <th>price</th>
                        <th>total=quantity*price</th>
                    </tr>
                </thead>
                <tbody><% double total = 0; %>
                    <%while (rs.next()) {
                       try{
                    %>
                    <tr>
                        <% total = total + rs.getDouble(5); %>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                    </tr>
                    <%} catch(Exception e){
                        continue;
            }
}%>
                </tbody>
            </table>                     
                <p>Total =<%=total%> 
                </p>
          
    </body>
    <script>
             document.getElementById("dropbox").value=<%=status%>;           
    </script>
         <%
          }catch(Exception e){
              err=1;
}
          %>
          <script>
              if(<%=err%>==1){
                  alert("store not have bill detail!!");
              }
          </script>          
</html>
