 <header class="header">
        <div class="header__top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-7">
                        <div class="header__top__left">
                            <p>@tienhung.workshop</p>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-5">
                        <div class="header__top__right">
                                <%if (user!=null) {%>
                                <div class="header__top__links">
                                    <a href="#">customer: <%=user%></a>
                                    <a href="logOut">Log out</a>
                                </div> 
                                <%} else {%>
                                <div class="header__top__links">
                                    <a href="loginEmloyment">Sign in</a>
                                    <a href="register">Regester</a>
                                </div> 
                                <%}%>
                            </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3">
                    <div class="header__logo">
                        <a href="homeController"><img src="assets/img/logo.png" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <nav class="header__menu mobile-menu">
                        <ul>
                            <li><a href="homeController">Home</a></li>
                            <li><a href="TitleController">Shop</a></li>
                            <li><a href="TitleController?go=showCart">Show Cart</a>                   
                        </ul>
                    </nav>
                </div>
                <div class="col-lg-3 col-md-3">
                    <div class="header__nav__option">
                        <a href="#" class="search-switch"><img src="assets/img/icon/search.png" alt=""></a>
                        <a href="#"><img src="assets/img/icon/cart.png" alt=""></a>
                        <div class="count_cart_div">
                         <input class="count_cart" id="count_cart" value="${sessionScope.count_cart}">    
                         </div>                 
                    </div>
                </div>
            </div>
            <div class="canvas__open"><i class="fa fa-bars"></i></div>
        </div>
    </header>