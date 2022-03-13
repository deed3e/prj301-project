<%-- 
    Document   : showCart.jsp
    Created on : Feb 24, 2022, 3:59:38 PM
    Author     : pallgree
--%>

<%@page import="model.DAOtiltes"%>
<%@page import="entity.tiltes"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <!-- head -->
    <%@include file="head.jsp" %>
    <%
        String user = "1";
        try {

            user = (String) session.getAttribute("user");
        } catch (Exception e) {
        }
        Vector<tiltes> vector = (Vector<tiltes>) request.getAttribute("listTitle");
        java.util.Enumeration em = session.getAttributeNames();
        DAOtiltes dao = new DAOtiltes();
        
        %>
        <%
            String status = (String) request.getAttribute("status");
        %>
    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>
        <%@include file="header.jsp" %>
        <!-- Header Section Begin -->
        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-option">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="breadcrumb__text">
                            <h4>Shopping Cart</h4>
                            <div class="breadcrumb__links">
                                <a href="./index.html">Home</a>
                                <span>Shopping Cart</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Breadcrumb Section End -->

        <!-- Shopping Cart Section Begin -->
        <section class="shopping-cart spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="shopping__cart__table">
          
                            <table>
                                <thead>
                                    <tr>
                                        <th>Product</th>
                                        <th>Quantity</th>
                                        <th>Total</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        double sum = 0, total = 0;
                                        int i=0;
                                        String key = "";
                                        String count = "";
                                        while (em.hasMoreElements()){
                                            
                                                key = em.nextElement().toString();
                                               if(!key.equals("count_cart")&&!key.equals("user")) 
                                              try {  
                                                count = (String)session.getAttribute(key);
                                                tiltes t1=(tiltes)dao.view1Title(key);
                                                i++;
                                    %>
                                    <tr>
                                        <td class="product__cart__item">
                                            <div class="product__cart__item__pic">
                                                <img width="90px" height="90px" src="assets/img/shopping-cart/cart-1.jpg" alt="">
                                            </div>
                                            <div class="product__cart__item__text">
                                                <h6><%=t1.getTitle() %></h6>
                                                <h5>$<input  style="width: 40px;border: none;" type="text" id="price<%=i%>" value="<%=t1.getPrice() %>"></h5>
                                            </div>
                                        </td>
                                        <td class="quantity__item">
                                            <div class="quantity">
                                                <div>
                                                    <input  style="width: 40px" type="text" id="qlt<%=i%>" onchange="changeS(<%=i%>,'<%=key%>')" value="<%=count%>">
                                                </div>
                                            </div>
                                        </td>
                                        <% 
                                           sum=Integer.parseInt(count)*t1.getPrice(); 
                                           total+=sum;
                                           
                                        %>
                                       
                                        <td style="width: 60px">     
                                            <input  style="width: 60px;border: none;" type="text" id="sum<%=i%>" value="<%=sum%>">
                                        </td>
                                        <td class="cart__close"><img onclick="remove('<%=key%>')" src="assets/img/icon/remove.png" ></td>
                                    </tr>
                                    <%
                                        
                                            } catch (Exception e) {
                                                continue;
                                            }
                                        }%> 

                                </tbody>
                            </table>
                        </div>                      
                    </div>
                    <div class="col-lg-4">
                        <% 
                            total=Math.round(total * 100);
                            total/=100;
                        %>
                        <div class="cart__total">
                            <h6>Cart total</h6>
                            $<input  style="border: none; background-color:#F3F2EE;font-weight: bold;" type="text" id="total" value="<%=total%>">
                            <br>
                            <a href="checkOut" class="primary-btn">Proceed to checkout</a>
                            <br>
                            <small id="status" style="display:none;color: green" class="text-blueGray-600" style="color:green" >Đã lưu đơn hàng của bạn vào database!!!</small>
                     
                        </div>
                        
                </div>
            </div>
        </section>
        <!-- Shopping Cart Section End -->

        <!-- Header Section End -->
        <!-- Shopping Cart Section End -->

        <%@include file="footer.jsp" %>
        <script>
             function changeS(i,titleId){
                 var a=document.getElementById('sum'+i+'').value;
                 document.getElementById('sum'+i+'').value=(document.getElementById('qlt'+i+'').value*document.getElementById('price'+i+'').value).toFixed(2);
                 var b=document.getElementById('sum'+i+'').value;
                 document.getElementById('total').value=(document.getElementById('total').value*1+(b-a)*1).toFixed(2);
                 var qlt=document.getElementById('qlt'+i+'').value;
                 $.ajax({
                        url:"changeQlt",
                        type:"get",  
                         data:{
                          value:qlt,
                          key: titleId

                        },                  
                        success: function(){
                            console.log('send data')
                            console.log(titleId)
                            console.log(qlt)
                            console.log('---')
                        },
                       });
             }

             function remove(titleId){
                 $.ajax({
                        url:"TitleController?go=removeItem",
                        type:"get",  
                         data:{                         
                          id: titleId
                        },                  
                        success: function(){
                            console.log('send data remove');
                            window.location.href ='TitleController?go=showCart'
                        
                        },
                       });

             }
        </script>
        <script>
    if (<%=status%> == 1){
        document.getElementById("status").style.display="inline";
    }
        
</script>
        <%@include file="jslib.jsp" %>
    </body>

</html>