<%@page import="entity.tiltes"%>
<%@page import="entity.publishers"%>
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

        Vector<publishers> vectorPu = (Vector<publishers>) request.getAttribute("list");
        Vector<tiltes> vector = (Vector<tiltes>) request.getAttribute("listTitle");
    %>
    <!-- head -->

    <body>

        <!-- Header Section Begin -->
        <%@include file="header.jsp" %>
        <!-- Header Section End -->


        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-option">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="breadcrumb__text">
                            <h4>Shop</h4>
                            <div class="breadcrumb__links">
                                <a href="homeController">Home</a>
                                <span>Shop</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Breadcrumb Section End -->

        <!-- Shop Section Begin -->
        <section class="shop spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="shop__sidebar">
                            <div class="shop__sidebar__search">
                                <form action="#">
                                    <input oninput="search(this)" type="text" placeholder="Search...">
                                    <button type="submit"><span class="icon_search"></span></button>
                                </form>
                            </div>
                            <div class="shop__sidebar__accordion">
                                <div class="accordion" id="accordionExample">

                                    <div class="card">
                                        <div class="card-heading">
                                            <a data-toggle="collapse" data-target="#collapseTwo">Category</a>
                                        </div>
                                        <div id="collapseTwo" class="collapse show" data-parent="#accordionExample">
                                            <div class="card-body">
                                                <div class="shop__sidebar__brand">
                                                    <%
                                                        for (publishers elem : vectorPu) {
                                                    %>                                                                                                              
                                                    <ul>
                                                        <li><a onclick="searchByPublisher('<%=elem.getPub_name()%>')"><%=elem.getPub_name()%></a></li>
                                                    </ul>
                                                    <%}%>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-heading">
                                            <a data-toggle="collapse" data-target="#collapseThree">Filter Price</a>
                                        </div>
                                        <div id="collapseThree" class="collapse show" data-parent="#accordionExample">
                                            <div class="card-body">
                                                <div class="shop__sidebar__price">
                                                    <ul>
                                                        <li><a onclick="searchByPrice(0, 5)">$0.00 - $5.00</a></li>
                                                        <li><a onclick="searchByPrice(5, 10)">$5.00 - $10.00</a></li>
                                                        <li><a onclick="searchByPrice(10, 15)">$10.00 - $15.00</a></li>
                                                        <li><a onclick="searchByPrice(15, 20)">$15.00 - $20.00</a></li>
                                                        <li><a onclick="searchByPrice(20, 25)">$20.00 - $25.00</a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-9">

                        <!-- Shopping Cart Section Begin -->
                        <section class="shopping-cart spad">
                            <div class="container">
                                <div >

                                    <div >
                                        <div class="shopping__cart__table">
                                            <table style="width: 100%">
                                                <thead>
                                                    <tr>
                                                        <th>Product</th>
                                                        <th>Content</th>            
                                                        <th></th>
                                                        <th>Date publish</th>
                                                    </tr>
                                                </thead>
                                                <tbody id="content1">
                                                    <%
                                                        try {
                                                            for (tiltes item : vector) {
                                                    %> 
                                                    <tr>
                                                        <td class="product__cart__item">
                                                            <div class="product__cart__item__pic">
                                                                <img src="assets/img/shopping-cart/cart-1.jpg" class="rounded-circle" width="90px" height="90px"  alt="">
                                                            </div>
                                                            <div class="product__cart__item__text">
                                                                <h6><%=item.getTitle()%></h6>
                                                                <h5>$<%=item.getPrice()%></h5>
                                                            </div>
                                                        </td>
                                                        <td class="quantity__item">
                                                            <h6><%=item.getNotes()%></h6> 
                                                            </div>
                                                        </td>
                                                        <th></th>
                                                        <td><h6><%=item.getPubdate().substring(0, 10)%></h6></td>
                                                        <td class="cart__add"><img onclick="addtocart('<%=item.getTitle_id()%>')" src="assets/img/icon/add_cart.png" alt=""></a></td>
                                                    </tr>  
                                                    <% }
                                                        } catch (Exception e) {
                                                        }%>                                
                                                </tbody>
                                            </table>
                                        </div>                                    
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">
                                        </div>
                                        <div class="col-md-4">
                                            <nav aria-label="...">
                                                <ul class="pagination pagination-sm">

                                                        <a class="page-link" onclick="loadTitles(0)" >1</a>
                                                    <li class="page-item"><a class="page-link" onclick="loadTitles(2)" value="2" >2</a></li>
                                                    <li class="page-item"><a class="page-link" onclick="loadTitles(8)" >3</a></li>
                                                    <li class="page-item"><a class="page-link" onclick="loadTitles(12)" >4</a></li>
                                                    <li class="page-item"><a class="page-link" onclick="loadTitles(16)" >5</a></li>
                                                 
                                                </ul>
                                            </nav>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                        <!-- Shopping Cart Section End -->
                    </div>
                </div>
            </div>
        </section>
        <!-- Shop Section End -->
        <!--content -->


        <script>
            function addtocart(str) {

                $.ajax({
                    url: "TitleController?go=addtoCart&titleId=" + str + "",
                    type: "get",
                    success: function (data) {
                        console.log('addtocart success');
                        console.log(data);
                        document.getElementById('count_cart').value = data;
                    },
                });

            }

           function loadTitles(param) {

                $.ajax({
                    url: "shopPagination",
                    type: "get",
                    data:{
                        num:param
                    },
                    success: function (data) {                      
                          var row = document.getElementById("content1");
                        row.innerHTML = data;
                         console.log(data);
                    },
                });

            }


            function search(param) {
                var txt = param.value;
                $.ajax({
                    url: "searchByAjax",
                    type: "get",
                    data: {
                        query: txt
                    },
                    success: function (data) {
                        var row = document.getElementById("content1");
                        row.innerHTML = data;
                    },
                });
            }

            function searchByPublisher(param) {
                $.ajax({
                    url: "searchByPublisher",
                    type: "get",
                    data: {
                        query: param
                    },
                    success: function (data) {
                        var row = document.getElementById("content1");
                        row.innerHTML = data;
                    },
                });
            }

            function searchByPrice(a, b) {
                $.ajax({
                    url: "searchByPrice",
                    type: "get",
                    data: {
                        from: a,
                        to: b
                    },
                    success: function (data) {
                        var row = document.getElementById("content1");
                        row.innerHTML = data;
                    },
                });
            }
        </script>

        <%@include file="footer.jsp" %>

        <%@include file="jslib.jsp" %>

    </body>

</html>