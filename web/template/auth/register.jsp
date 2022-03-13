<%-- 
    Document   : register
    Created on : Mar 5, 2022, 11:53:38 AM
    Author     : pallgree
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta name="theme-color" content="#000000" />
        <link rel="icon" class="rounded-circle" href="assets/img/apple-icon.jpg" >
        <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css" />
        <link rel="stylesheet" href="assets/styles/tailwind.css" />
        <title>Register | Bookstore</title>
        <%
            String status = (String) request.getAttribute("status");
        %>
       


    </head>
    <body class="text-blueGray-700 antialiased" >

        <section class="relative w-full h-full py-40 min-h-screen">
            <div class="absolute top-0 w-full h-full bg-blueGray-800 bg-full bg-no-repeat"
                 style="background-image: url(assets/img/register_bg_2.jpg)"></div>
            <div class="container mx-auto px-4 h-full">
                <div class="flex content-center items-center justify-center h-full">
                    <div class="w-full lg:w-4/12 px-4">
                        <div
                            class="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-200 border-0">
                            <div class="rounded-t mb-0 px-6 py-6">
                                <div class="text-center mb-3">
                                    <h6 class="text-blueGray-500 text-sm font-bold">
                                        Register
                                    </h6>
                                </div>
                                <hr class="mt-6 border-b-1 border-blueGray-300" />
                            </div>
                            <div class="flex-auto px-4 lg:px-10 py-10 pt-0">                               
                                <form action="register" method="post">
                                    <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">Username</label><input type="text" name="user"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="Username" />
                                    </div>
                                    <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">Password</label><input type="password" name="pass"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="Password" />
                                    </div>
                                     <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">Store ID</label><input type="text" name="id"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="Store ID" />
                                    </div>
                                     <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">Name store</label><input type="text" name="name"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="Name store" />
                                    </div>
                                     <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">Address</label><input type="text" name="add"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="Address" />
                                    </div>  
                                     <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">City</label><input type="text" name="city"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="City" />
                                    </div> 
                                     <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">State</label><input type="text" name="state"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="char(2)" />                                            
                                    </div> 
                                     <div class="relative w-full mb-3">
                                        <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                                               for="grid-password">Zip</label><input type="text" name="zip"
                                               class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                                               placeholder="char(5)" />
                                    </div>                                    
                                    <div  class="text-center mt-6" id="status1" role="alert" style="display: none">
                                         <small class="text-blueGray-600" style="color:red" >Username đã tồn tại!!!</small>
                                    </div>
                                    <div  class="text-center mt-6" id="status2" role="alert" style="display: none">
                                         <small class="text-blueGray-600" style="color:red" >Không thể tạo mới account!!!</small>
                                    </div>
                                    <div class="text-center mt-6">
                                        <button
                                            class="bg-blueGray-800 text-white active:bg-blueGray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none mr-1 mb-1 w-full ease-linear transition-all duration-150"
                                            type="submit">
                                            Creater account
                                        </button>
                                    </div>
                                    <div class="text-center mt-6">              
                                        <div >
                                            <a href="loginEmloyment" ><small>Sign in</small></a>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <footer class="absolute w-full bottom-0 bg-blueGray-800 pb-6">
                <div class="container mx-auto px-4">
                    <hr class="mb-6 border-b-1 border-blueGray-600" />
                    <div class="flex flex-wrap items-center md:justify-between justify-center">
                        <div class="w-full md:w-4/12 px-4">
                            <div class="text-sm text-white font-semibold py-1 text-center md:text-left">
                                Copyright © <span id="get-current-year"></span>
                                <a href="https://www.creative-tim.com?ref=njs-login"
                                   class="text-white hover:text-blueGray-300 text-sm font-semibold py-1">pallgree.shop</a>
                            </div>
                        </div>

                    </div>
                </div>
            </footer>
        </section>
    </main>
    <script>
    if (<%=status%> == 1){
        document.getElementById("status1").style.display="inline";
    }
    if (<%=status%> == 2){
        document.getElementById("status2").style.display="inline";
    }
</script>
</body>
<script src="https://unpkg.com/@popperjs/core@2/dist/umd/popper.js"></script>
</html>