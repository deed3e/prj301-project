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
                                    <a href="#">Wellcome: <%=user%></a>
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
            <div class="col-lg-3"></div>         
                <div class="col-lg-6">
                    <nav class="header__menu mobile-menu">
                        <ul>
                            <li><a href="StoresController">Customer Manager</a></li>
                            <li><a href="TitleController?go=listTitleAdmin">Product Manger</a></li>
                            <li><a href="SalesController">Bill Manager</a>                  
                        </ul>
                    </nav>
                </div>   
                <div class="col-lg-1"></div>             
            </div>
            <div class="canvas__open"><i class="fa fa-bars"></i></div>
        </div>
    </header>