package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <a href=\"#\"><img src=\"assets/img/icon/cart.png\" alt=\"\"></a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.count_cart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("}\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"canvas__open\"><i class=\"fa fa-bars\"></i></div>\n");
      out.write("        </div>\n");
      out.write("    </header>");
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
