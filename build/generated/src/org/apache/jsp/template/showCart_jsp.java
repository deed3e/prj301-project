package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DAOtiltes;
import entity.tiltes;
import java.util.Vector;

public final class showCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/template/head.jsp");
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/footer.jsp");
    _jspx_dependants.add("/template/jslib.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <!-- head -->\n");
      out.write("    ");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"Male_Fashion Template\">\n");
      out.write("    <meta name=\"keywords\" content=\"Male_Fashion, unica, creative, html\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Book Store | Workshop</title>\n");
      out.write("    <link rel=\"icon\" class=\"rounded-circle\" href=\"assets/img/apple-icon.jpg\" >\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap\"\n");
      out.write("    rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Css Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/styles/css.css\" >\n");
      out.write("\n");
      out.write("    ");

        String user = "1";
        try {

            user = (String) session.getAttribute("user");
        } catch (Exception e) {
        }
        Vector<tiltes> vector = (Vector<tiltes>) request.getAttribute("listTitle");
        java.util.Enumeration em = session.getAttributeNames();
        DAOtiltes dao = new DAOtiltes();
        
        
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Page Preloder -->\n");
      out.write("        <div id=\"preloder\">\n");
      out.write("            <div class=\"loader\"></div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write(" <header class=\"header\">\n");
      out.write("        <div class=\"header__top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-7\">\n");
      out.write("                        <div class=\"header__top__left\">\n");
      out.write("                            <p>@tienhung.workshop</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-5\">\n");
      out.write("                        <div class=\"header__top__right\">\n");
      out.write("                                ");
if (user!=null) {
      out.write("\n");
      out.write("                                <div class=\"header__top__links\">\n");
      out.write("                                    <a href=\"#\">customer: ");
      out.print(user);
      out.write("</a>\n");
      out.write("                                    <a href=\"logOut\">Log out</a>\n");
      out.write("                                </div> \n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                <div class=\"header__top__links\">\n");
      out.write("                                    <a href=\"loginEmloyment\">Sign in</a>\n");
      out.write("                                    <a href=\"#\">Regester</a>\n");
      out.write("                                </div> \n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\n");
      out.write("                    <div class=\"header__logo\">\n");
      out.write("                        <a href=\"homeController\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                    <nav class=\"header__menu mobile-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"homeController\">Home</a></li>\n");
      out.write("                            <li><a href=\"TitleController\">Shop</a></li>\n");
      out.write("                            <li><a href=\"TitleController?go=showCart\">Show Cart</a>                   \n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-3\">\n");
      out.write("                    <div class=\"header__nav__option\">\n");
      out.write("                        <a href=\"#\" class=\"search-switch\"><img src=\"assets/img/icon/search.png\" alt=\"\"></a>\n");
      out.write("                        <a href=\"#\"><img src=\"assets/img/icon/cart.png\" alt=\"\"></a>\n");
      out.write("                        <div class=\"count_cart_div\">\n");
      out.write("                         <input class=\"count_cart\" id=\"count_cart\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.count_cart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">    \n");
      out.write("                         </div>                 \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"canvas__open\"><i class=\"fa fa-bars\"></i></div>\n");
      out.write("        </div>\n");
      out.write("    </header>");
      out.write("\n");
      out.write("        <!-- Header Section Begin -->\n");
      out.write("        <!-- Breadcrumb Section Begin -->\n");
      out.write("        <section class=\"breadcrumb-option\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"breadcrumb__text\">\n");
      out.write("                            <h4>Shopping Cart</h4>\n");
      out.write("                            <div class=\"breadcrumb__links\">\n");
      out.write("                                <a href=\"./index.html\">Home</a>\n");
      out.write("                                <span>Shopping Cart</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("        <!-- Shopping Cart Section Begin -->\n");
      out.write("        <section class=\"shopping-cart spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"shopping__cart__table\">\n");
      out.write("                            <table>\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Product</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("                                        <th>Total</th>\n");
      out.write("                                        <th></th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                        double sum = 0, total = 0;
                                        int i=0;
                                        String key = "";
                                        String count = "";
                                        while (em.hasMoreElements()) {
                                            try {
                                                key = em.nextElement().toString();
                                                count = (String)session.getAttribute(key);
                                                tiltes t1=(tiltes)dao.view1Title(key);
                                                i++;
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td class=\"product__cart__item\">\n");
      out.write("                                            <div class=\"product__cart__item__pic\">\n");
      out.write("                                                <img width=\"90px\" height=\"90px\" src=\"assets/img/shopping-cart/cart-1.jpg\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"product__cart__item__text\">\n");
      out.write("                                                <h6>");
      out.print(t1.getTitle() );
      out.write("</h6>\n");
      out.write("                                                <h5>$<input  style=\"width: 40px;border: none;\" type=\"text\" id=\"price");
      out.print(i);
      out.write("\" value=\"");
      out.print(t1.getPrice() );
      out.write("\"></h5>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"quantity__item\">\n");
      out.write("                                            <div class=\"quantity\">\n");
      out.write("                                                <div>\n");
      out.write("                                                    <input  style=\"width: 40px\" type=\"text\" id=\"qlt");
      out.print(i);
      out.write("\" onchange=\"changeS(");
      out.print(i);
      out.write(")\" value=\"");
      out.print(count);
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        ");
 sum=Double.parseDouble(count) *t1.getPrice(); 
                                            total+=sum;
                                        
      out.write("\n");
      out.write("                                        <td style=\"width: 60px\">     \n");
      out.write("                                            <input  style=\"width: 60px;border: none;\" type=\"text\" id=\"sum");
      out.print(i);
      out.write("\" value=\"");
      out.print(sum);
      out.write("\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"cart__close\"><i class=\"fa fa-close\"></i></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                            } catch (Exception e) {
                                                continue;
                                            }
                                        }
      out.write(" \n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>                      \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"cart__total\">\n");
      out.write("                            <h6>Cart total</h6>\n");
      out.write("                            $<input  style=\"border: none; background-color:#F3F2EE;font-weight: bold;\" type=\"text\" id=\"total\" value=\"");
      out.print(total);
      out.write("\">\n");
      out.write("                            <br>\n");
      out.write("                            <a href=\"#\" class=\"primary-btn\">Proceed to checkout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Shopping Cart Section End -->\n");
      out.write("\n");
      out.write("        <!-- Header Section End -->\n");
      out.write("\n");
      out.write("        <!-- Shopping Cart Section End -->\n");
      out.write("\n");
      out.write("        ");
      out.write("<footer class=\"footer\">\r\n");
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
      out.write("                        <p>copyright-pallgree.shop</p>\r\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>");
      out.write("\n");
      out.write("        <script>\n");
      out.write("             function changeS(i){\n");
      out.write("                 var a=document.getElementById('sum'+i+'').value;\n");
      out.write("                 document.getElementById('sum'+i+'').value=(document.getElementById('qlt'+i+'').value*document.getElementById('price'+i+'').value).toFixed(2);\n");
      out.write("                 var b=document.getElementById('sum'+i+'').value;\n");
      out.write("                 document.getElementById('total').value=(document.getElementById('total').value*1+(b-a)*1).toFixed(2)\n");
      out.write("             }\n");
      out.write("        </script>\n");
      out.write("        ");
      out.write("  <!-- Js Plugins -->\r\n");
      out.write("    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.countdown.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.slicknav.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/mixitup.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
