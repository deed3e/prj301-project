package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> Workshop|Pallgree.shop</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/flowbite@1.3.4/dist/flowbite.min.css\" />\n");
      out.write("        <link rel=\"styleshhet\" href=\"../assets/styles/css.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"bg-red border-gray-200 px-2 sm:px-4 py-2.5 rounded dark:bg-red-800\">\n");
      out.write("                <div class=\"container flex flex-wrap justify-between items-center mx-auto\">\n");
      out.write("                    <a href=\"#\" class=\"flex items-center\">\n");
      out.write("                        <img src=\"../assets/img/avatar.jpg\" class=\"mr-3 h-6 sm:h-10\" alt=\"Flowbite Logo\" />\n");
      out.write("                        <span class=\"self-center text-xl font-semibold whitespace-nowrap dark:text-white\">Pallgree.shop</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"flex items-center md:order-2\">\n");
      out.write("                        <button type=\"button\" class=\"flex mr-3 text-sm bg-gray-800 rounded-full md:mr-0 focus:ring-4 focus:ring-gray-300 dark:focus:ring-gray-600\" id=\"user-menu-button\" aria-expanded=\"false\" type=\"button\" data-dropdown-toggle=\"dropdown\">\n");
      out.write("                            <span class=\"sr-only\">Open user menu</span>\n");
      out.write("                            <img class=\"w-8 h-8 rounded-full\" src=\"/docs/images/people/profile-picture-3.jpg\" alt=\"user photo\">\n");
      out.write("                        </button>\n");
      out.write("                        <!-- Dropdown menu -->\n");
      out.write("                        <div class=\"hidden z-50 my-4 text-base list-none bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700 dark:divide-gray-600\" id=\"dropdown\">\n");
      out.write("                            <div class=\"py-3 px-4\">\n");
      out.write("                                <span class=\"block text-sm text-gray-900 dark:text-white\">Bonnie Green</span>\n");
      out.write("                                <span class=\"block text-sm font-medium text-gray-500 truncate dark:text-gray-400\">name@flowbite.com</span>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"py-1\" aria-labelledby=\"dropdown\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white\">Dashboard</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white\">Settings</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white\">Earnings</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white\">Sign out</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <button data-collapse-toggle=\"mobile-menu-2\" type=\"button\" class=\"inline-flex items-center p-2 ml-1 text-sm text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600\" aria-controls=\"mobile-menu-2\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\">Open main menu</span>\n");
      out.write("                            <svg class=\"w-6 h-6\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                            <svg class=\"hidden w-6 h-6\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"hidden justify-between items-center w-full md:flex md:w-auto md:order-1\" id=\"mobile-menu-2\">\n");
      out.write("                        <ul class=\"flex flex-col mt-4 md:flex-row md:space-x-8 md:mt-0 md:text-sm md:font-medium\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"block py-2 pr-4 pl-3 text-white bg-blue-700 rounded md:bg-transparent md:text-blue-700 md:p-0 dark:text-white\" aria-current=\"page\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">About</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Services</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Pricing</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700\">Contact</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <menu>\n");
      out.write("              <aside class=\"w-64\" aria-label=\"Sidebar\">\n");
      out.write("   <div class=\"overflow-y-auto py-4 px-3 bg-gray-50 rounded dark:bg-gray-800\">\n");
      out.write("      <ul class=\"space-y-2\">\n");
      out.write("         <li>\n");
      out.write("            <a href=\"#\" class=\"flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700\">\n");
      out.write("               <svg class=\"w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M2 10a8 8 0 018-8v8h8a8 8 0 11-16 0z\"></path><path d=\"M12 2.252A8.014 8.014 0 0117.748 8H12V2.252z\"></path></svg>\n");
      out.write("               <span class=\"ml-3\">Dashboard</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li>\n");
      out.write("            <a href=\"#\" class=\"flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700\">\n");
      out.write("               <svg class=\"flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M5 3a2 2 0 00-2 2v2a2 2 0 002 2h2a2 2 0 002-2V5a2 2 0 00-2-2H5zM5 11a2 2 0 00-2 2v2a2 2 0 002 2h2a2 2 0 002-2v-2a2 2 0 00-2-2H5zM11 5a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2V5zM11 13a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2v-2z\"></path></svg>\n");
      out.write("               <span class=\"flex-1 ml-3 whitespace-nowrap\">Kanban</span>\n");
      out.write("               <span class=\"inline-flex justify-center items-center px-2 ml-3 text-sm font-medium text-gray-800 bg-gray-200 rounded-full dark:bg-gray-700 dark:text-gray-300\">Pro</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li>\n");
      out.write("            <a href=\"#\" class=\"flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700\">\n");
      out.write("               <svg class=\"flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M8.707 7.293a1 1 0 00-1.414 1.414l2 2a1 1 0 001.414 0l2-2a1 1 0 00-1.414-1.414L11 7.586V3a1 1 0 10-2 0v4.586l-.293-.293z\"></path><path d=\"M3 5a2 2 0 012-2h1a1 1 0 010 2H5v7h2l1 2h4l1-2h2V5h-1a1 1 0 110-2h1a2 2 0 012 2v10a2 2 0 01-2 2H5a2 2 0 01-2-2V5z\"></path></svg>\n");
      out.write("               <span class=\"flex-1 ml-3 whitespace-nowrap\">Inbox</span>\n");
      out.write("               <span class=\"inline-flex justify-center items-center p-3 ml-3 w-3 h-3 text-sm font-medium text-blue-600 bg-blue-200 rounded-full dark:bg-blue-900 dark:text-blue-200\">3</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li>\n");
      out.write("            <a href=\"#\" class=\"flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700\">\n");
      out.write("               <svg class=\"flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M10 9a3 3 0 100-6 3 3 0 000 6zm-7 9a7 7 0 1114 0H3z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("               <span class=\"flex-1 ml-3 whitespace-nowrap\">Users</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li>\n");
      out.write("            <a href=\"#\" class=\"flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700\">\n");
      out.write("               <svg class=\"flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M10 2a4 4 0 00-4 4v1H5a1 1 0 00-.994.89l-1 9A1 1 0 004 18h12a1 1 0 00.994-1.11l-1-9A1 1 0 0015 7h-1V6a4 4 0 00-4-4zm2 5V6a2 2 0 10-4 0v1h4zm-6 3a1 1 0 112 0 1 1 0 01-2 0zm7-1a1 1 0 100 2 1 1 0 000-2z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("               <span class=\"flex-1 ml-3 whitespace-nowrap\">Products</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li>\n");
      out.write("            <a href=\"#\" class=\"flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700\">\n");
      out.write("               <svg class=\"flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M3 3a1 1 0 00-1 1v12a1 1 0 102 0V4a1 1 0 00-1-1zm10.293 9.293a1 1 0 001.414 1.414l3-3a1 1 0 000-1.414l-3-3a1 1 0 10-1.414 1.414L14.586 9H7a1 1 0 100 2h7.586l-1.293 1.293z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("               <span class=\"flex-1 ml-3 whitespace-nowrap\">Sign In</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li>\n");
      out.write("            <a href=\"#\" class=\"flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700\">\n");
      out.write("               <svg class=\"flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M5 4a3 3 0 00-3 3v6a3 3 0 003 3h10a3 3 0 003-3V7a3 3 0 00-3-3H5zm-1 9v-1h5v2H5a1 1 0 01-1-1zm7 1h4a1 1 0 001-1v-1h-5v2zm0-4h5V8h-5v2zM9 8H4v2h5V8z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("               <span class=\"flex-1 ml-3 whitespace-nowrap\">Sign Up</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("      </ul>\n");
      out.write("   </div>\n");
      out.write("</aside>\n");
      out.write("        </menu>    \n");
      out.write("        <footer>\n");
      out.write("        </footer>    \n");
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/flowbite@1.3.4/dist/flowbite.js\"></script>    \n");
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
