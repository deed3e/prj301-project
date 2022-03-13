package org.apache.jsp.template.Update;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UpdateStore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");

         String titlePage = (String) request.getAttribute("titlePage");
        
      out.write("\n");
      out.write("        <title>");
      out.print(titlePage);
      out.write("</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ResultSet rs = (ResultSet) request.getAttribute("vector");
            String titlTable = (String) request.getAttribute("titleTable");
        
      out.write("\n");
      out.write("        <h2>");
      out.print(titlTable);
      out.write("</h2>\n");
      out.write("        ");

            if (rs.next()) {
        
      out.write("\n");
      out.write("        <form action=\"StoresController\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"go\" value=\"updateStore\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Stor ID</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name = \"stor_id\" value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Store Name</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name = \"stor_name\" value=\"");
      out.print(rs.getString(2));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Store Address</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name = \"stor_address\" value=\"");
      out.print(rs.getString(3));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"city\" value=\"");
      out.print(rs.getString(4));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>State</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name = \"state\" value=\"");
      out.print(rs.getString(5));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Zip</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name =\"zip\" ");
      out.print(rs.getString(6));
      out.write(">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <p>\n");
      out.write("                <input type=\"submit\" value=\"update\" name=\"submit\">\n");
      out.write("                <input type=\"reset\" value=\"reset\">\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("        ");
}
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
