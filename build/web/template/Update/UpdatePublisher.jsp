<%-- 
    Document   : UpdatePublisher
    Created on : Feb 17, 2022, 3:44:08 PM
    Author     : ptuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="PublishersController">
            <input type="hidden" name="go" value="insertPublisher">
            <table>
                <tr>
                    <td>Publisher ID</td>
                    <td>
                        <input type="text" name = "pub_id">
                    </td>
                </tr>
                <tr>
                    <td>Publisher Name</td>
                    <td>
                        <input type="text" name="pub_name">
                    </td>
                </tr>
                <tr>
                    <td>City</td>
                    <td>
                        <input type="text" name="city">
                    </td>
                </tr>
                <tr>
                    <td>State</td>
                    <td>
                        <input type="text" name ="state">
                    </td>
                </tr>
                <tr>
                    <td>Country</td>
                    <td>
                        <input type="text" name="country">
                    </td>
                </tr>
            </table>
            <p>
                <input type="submit" value="send">
                <input type="reset" value="reset">
            </p>
        </form>
    </body>
</html>
