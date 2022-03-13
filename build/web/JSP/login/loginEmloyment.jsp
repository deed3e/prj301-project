<%-- 
    Document   : loginEmloyment
    Created on : Mar 1, 2022, 4:52:39 PM
    Author     : pallgree
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% 
                  String status=(String)request.getAttribute("status");
        %>
        <script>
            if(<%=status%>==1)
            alert("Mật khẩu hoặc Tên đăng nhập không đúng!!!");
        </script>
    </head>
    <body>
        <h1>Login emloyments</h1>
        <form action="loginEmloyment" method="post">
            Username<input type="text" name="user" >
            <br>
            Password<input type="text" name="pass" >
            <br>
            <input type="submit">
                       
        </form>
    </body>
</html>
