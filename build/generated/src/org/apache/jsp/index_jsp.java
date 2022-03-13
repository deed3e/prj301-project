package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"Male_Fashion Template\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Male_Fashion, unica, creative, html\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Pallgree | Workshop</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Font -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap\"\r\n");
      out.write("    rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Css Styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\" type=\"text/css\">\r\n");
      out.write("    ");
                       
                         String user=(String)session.getAttribute("user");
    
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Page Preloder -->\r\n");
      out.write("    <div id=\"preloder\">\r\n");
      out.write("        <div class=\"loader\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <!-- Header Section Begin -->\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"header__top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6 col-md-7\">\r\n");
      out.write("                        <div class=\"header__top__left\">\r\n");
      out.write("                            <p>@tienhung.workshop</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 col-md-5\">\r\n");
      out.write("                        <div class=\"header__top__right\">\r\n");
      out.write("                            ");
if(2>1){
      out.write("\r\n");
      out.write("                            <div class=\"header__top__links\">\r\n");
      out.write("                                <a href=\"#\">Log out</a>\r\n");
      out.write("                            </div> \r\n");
      out.write("                            ");
}else{
      out.write("\r\n");
      out.write("                            <div class=\"header__top__links\">\r\n");
      out.write("                                <a href=\"loginEmloyment\">Sign in</a>\r\n");
      out.write("                                <a href=\"#\">Regester</a>\r\n");
      out.write("                            </div> \r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <div class=\"header__logo\">\r\n");
      out.write("                        <a href=\"./index.html\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                    <nav class=\"header__menu mobile-menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"active\"><a href=\"./index.html\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"template/shop.jsp\">Shop</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Show Cart</a>                   \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                    <div class=\"header__nav__option\">\r\n");
      out.write("                        <a href=\"#\" class=\"search-switch\"><img src=\"assets/img/icon/search.png\" alt=\"\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"assets/img/icon/cart.png\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"canvas__open\"><i class=\"fa fa-bars\"></i></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Header Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Hero Section Begin -->\r\n");
      out.write("    <section class=\"hero\">\r\n");
      out.write("        <div class=\"hero__slider owl-carousel\">\r\n");
      out.write("            <div class=\"hero__items set-bg\" data-setbg=\"assets/img/hero/hero-1.jpg\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-5 col-lg-7 col-md-8\">\r\n");
      out.write("                            <div class=\"hero__text\">                               \r\n");
      out.write("                                <div class=\"hero__social\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"hero__items set-bg\" data-setbg=\"assets/img/hero/hero-2.jpg\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-5 col-lg-7 col-md-8\">\r\n");
      out.write("                            <div class=\"hero__text\">\r\n");
      out.write("                                <div class=\"hero__social\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Hero Section End -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Footer Section Begin -->\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__about\">\r\n");
      out.write("                        <div class=\"footer__logo\">\r\n");
      out.write("                            <a href=\"#\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>The customer is at the heart of our unique business model, which includes design.</p>\r\n");
      out.write("                        <a href=\"#\"><img src=\"assets/img/payment.png\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-2 offset-lg-1 col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__widget\">\r\n");
      out.write("                        <h6>Shopping</h6>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Boook Store</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Trending Book</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Accessories</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Sale</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-2 col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__widget\">\r\n");
      out.write("                        <h6>Shopping</h6>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Payment Methods</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Delivary</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Return & Exchanges</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 offset-lg-1 col-md-6 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer__widget\">\r\n");
      out.write("                        <h6>NewLetter</h6>\r\n");
      out.write("                        <div class=\"footer__newslatter\">\r\n");
      out.write("                            <p>Be the first to know about new arrivals, look books, sales & promos!</p>\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Your email\">\r\n");
      out.write("                                <button type=\"submit\"><span class=\"icon_mail_alt\"></span></button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <div class=\"footer__copyright__text\">\r\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                        <p>Copyright Â©\r\n");
      out.write("                            <script>\r\n");
      out.write("                                document.write(new Date().getFullYear());\r\n");
      out.write("                            </script>2020\r\n");
      out.write("                            All rights reserved | This template is made with <i class=\"fa fa-heart-o\"\r\n");
      out.write("                            aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- Footer Section End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Search Begin -->\r\n");
      out.write("    <div class=\"search-model\">\r\n");
      out.write("        <div class=\"h-100 d-flex align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"search-close-switch\">+</div>\r\n");
      out.write("            <form class=\"search-model-form\">\r\n");
      out.write("                <input type=\"text\" id=\"search-input\" placeholder=\"Search here.....\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Search End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.countdown.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/mixitup.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
