package org.apache.jsp.template.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.stores;
import entity.Cart;
import entity.tiltes;

public final class showCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");

            java.util.Enumeration em = session.getAttributeNames();
            //String key1 = em.nextElement().toString();
           stores em1 = (stores) session.getAttribute("tienhung");
          String name = em1.getStor_name();
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
      out.print(name);
      out.write("\n");
      out.write("        <h1>Shopping Cart Details</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>                   \n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Remove</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");


                    double sum = 0, total = 0;
                    String key = "";
                    String count = "";
                    while (em.hasMoreElements()){

                        try {
                            key = em.nextElement().toString();
                           if (!key.contains("tienhung")) {
                                
                                count = (String) session.getAttribute(key);

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(key);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("                    <td>remove</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
                        } catch (Exception e) {
                            continue;
                        }
                    }
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("            <tfoot>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Total</th>\n");
      out.write("                    <td>");
      out.print( total);
      out.write("</td>\n");
      out.write("                    <td>Remove All</td>\n");
      out.write("                </tr>\n");
      out.write("            </tfoot>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2><a href=\"JSP/checkOut.jsp\">Check-out</h2>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
