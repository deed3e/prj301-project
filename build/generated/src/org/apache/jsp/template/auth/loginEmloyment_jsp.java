package org.apache.jsp.template.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginEmloyment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <meta name=\"theme-color\" content=\"#000000\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" />\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../../assets/img/apple-icon.png\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/vendor/@fortawesome/fontawesome-free/css/all.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/styles/tailwind.css\" />\n");
      out.write("        <title>Login | Pallgree.shop</title>\n");
      out.write("        ");

            String status = (String) request.getAttribute("status");
        
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"text-blueGray-700 antialiased\" >\n");
      out.write("\n");
      out.write("        <section class=\"relative w-full h-full py-40 min-h-screen\">\n");
      out.write("            <div class=\"absolute top-0 w-full h-full bg-blueGray-800 bg-full bg-no-repeat\"\n");
      out.write("                 style=\"background-image: url(assets/img/register_bg_2.png)\"></div>\n");
      out.write("            <div class=\"container mx-auto px-4 h-full\">\n");
      out.write("                <div class=\"flex content-center items-center justify-center h-full\">\n");
      out.write("                    <div class=\"w-full lg:w-4/12 px-4\">\n");
      out.write("                        <div\n");
      out.write("                            class=\"relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-200 border-0\">\n");
      out.write("                            <div class=\"rounded-t mb-0 px-6 py-6\">\n");
      out.write("                                <div class=\"text-center mb-3\">\n");
      out.write("                                    <h6 class=\"text-blueGray-500 text-sm font-bold\">\n");
      out.write("                                        Sign in with\n");
      out.write("                                    </h6>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"mt-6 border-b-1 border-blueGray-300\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"flex-auto px-4 lg:px-10 py-10 pt-0\">                               \n");
      out.write("                                <form action=\"loginEmloyment\" method=\"post\">\n");
      out.write("                                    <div class=\"relative w-full mb-3\">\n");
      out.write("                                        <label class=\"block uppercase text-blueGray-600 text-xs font-bold mb-2\"\n");
      out.write("                                               for=\"grid-password\">Username</label><input type=\"text\" name=\"user\"\n");
      out.write("                                               class=\"border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150\"\n");
      out.write("                                               placeholder=\"Username\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"relative w-full mb-3\">\n");
      out.write("                                        <label class=\"block uppercase text-blueGray-600 text-xs font-bold mb-2\"\n");
      out.write("                                               for=\"grid-password\">Password</label><input type=\"password\" name=\"pass\"\n");
      out.write("                                               class=\"border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150\"\n");
      out.write("                                               placeholder=\"Password\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <label class=\"inline-flex items-center cursor-pointer\"><input id=\"customCheckLogin\" type=\"checkbox\"\n");
      out.write("                                                                                                      class=\"form-checkbox border-0 rounded text-blueGray-700 ml-1 w-5 h-5 ease-linear transition-all duration-150\" /><span\n");
      out.write("                                                                                                      class=\"ml-2 text-sm font-semibold text-blueGray-600\">Remember me</span></label>\n");
      out.write("                                    </div>   \n");
      out.write("                                    <div  class=\"text-center mt-6\" id=\"status1\" role=\"alert\" style=\"display: none\">\n");
      out.write("                                         <small class=\"text-blueGray-600\" style=\"color:red\" >Mật khẩu hoặc tên đăng nhập không đúng!!!</small>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text-center mt-6\">\n");
      out.write("                                        <button\n");
      out.write("                                            class=\"bg-blueGray-800 text-white active:bg-blueGray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none mr-1 mb-1 w-full ease-linear transition-all duration-150\"\n");
      out.write("                                            type=\"submit\">\n");
      out.write("                                            Sign In\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text-center mt-6\">\n");
      out.write("                                        <div>\n");
      out.write("                                            <a href=\"#\" ><small>Forgot password?</small></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div >\n");
      out.write("                                            <a href=\"#\" ><small>Create new account</small></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"absolute w-full bottom-0 bg-blueGray-800 pb-6\">\n");
      out.write("                <div class=\"container mx-auto px-4\">\n");
      out.write("                    <hr class=\"mb-6 border-b-1 border-blueGray-600\" />\n");
      out.write("                    <div class=\"flex flex-wrap items-center md:justify-between justify-center\">\n");
      out.write("                        <div class=\"w-full md:w-4/12 px-4\">\n");
      out.write("                            <div class=\"text-sm text-white font-semibold py-1 text-center md:text-left\">\n");
      out.write("                                Copyright © <span id=\"get-current-year\"></span>\n");
      out.write("                                <a href=\"https://www.creative-tim.com?ref=njs-login\"\n");
      out.write("                                   class=\"text-white hover:text-blueGray-300 text-sm font-semibold py-1\">pallgree.shop</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://unpkg.com/@popperjs/core@2/dist/umd/popper.js\"></script>\n");
      out.write("<script>\n");
      out.write("    if (");
      out.print(status);
      out.write(" == 1){\n");
      out.write("        document.getElementById(\"status1\").style.display=\"inline\";\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    /* Make dynamic date appear */\n");
      out.write("    (function () {\n");
      out.write("        if (document.getElementById(\"get-current-year\")) {\n");
      out.write("            document.getElementById(\n");
      out.write("                    \"get-current-year\"\n");
      out.write("                    ).innerHTML = new Date().getFullYear();\n");
      out.write("        }\n");
      out.write("    })();\n");
      out.write("    /* Function for opning navbar on mobile */\n");
      out.write("    function toggleNavbar(collapseID) {\n");
      out.write("        document.getElementById(collapseID).classList.toggle(\"hidden\");\n");
      out.write("        document.getElementById(collapseID).classList.toggle(\"block\");\n");
      out.write("    }\n");
      out.write("    /* Function for dropdowns */\n");
      out.write("    function openDropdown(event, dropdownID) {\n");
      out.write("        let element = event.target;\n");
      out.write("        while (element.nodeName !== \"A\") {\n");
      out.write("            element = element.parentNode;\n");
      out.write("        }\n");
      out.write("        Popper.createPopper(element, document.getElementById(dropdownID), {\n");
      out.write("            placement: \"bottom-start\",\n");
      out.write("        });\n");
      out.write("        document.getElementById(dropdownID).classList.toggle(\"hidden\");\n");
      out.write("        document.getElementById(dropdownID).classList.toggle(\"block\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
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
