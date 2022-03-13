/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.authors;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOauthors;

/**
 *
 * @author pallgree
 */
@WebServlet(name = "AuthorsController", urlPatterns = {"/AuthorsController"})
public class AuthorsController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String service = request.getParameter("go");
        DAOauthors dao = new DAOauthors();
        if (service == null) {
            service = "listAllAuthors";
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //get data
            if (service.equals("insertAuthors")) {
                String au_id = request.getParameter("au_id");
                String au_lname = request.getParameter("au_lname");
                String au_fname = request.getParameter("au_fname");
                String phone = request.getParameter("phone");
                String address = request.getParameter("address");
                String City = request.getParameter("city");
                String state = request.getParameter("state");
                String zip = request.getParameter("zip");
                String contract = request.getParameter("contract");
                //check data
                if (au_id == null || au_id.equals("")) {
                    out.print("<h2> Author Id is not empty!</h2>");
                    return;
                }
                if (au_lname == null || au_lname.equals("")) {
                    out.print("<h2>Last Name is not empty!</h2>");
                    return;
                }
                if (au_fname == null || au_fname.equals("")) {
                    out.print("<h2> First Name is not empty</h2>");
                    return;
                }
                if (phone == null || phone.equals("")) {
                    out.print("<h2>Phone is not empty!</h2>");
                    return;
                }
                if (contract == null || contract.equals("")) {
                    out.print("<h2> Contract is not empty</h2>");
                    return;
                }
                int contra = Integer.parseInt(contract);
                authors au = new authors(au_id, au_lname, au_fname, phone, address, City, state, zip, contra);
                int n = dao.addAuthor(au);
                response.sendRedirect("AuthorsController");
            }
            if (service.equals("listAllAuthors")) {
                Vector<authors> vector = dao.viewAll();
                 // pre some other data
                String titlePage = "Author manager";
                String titleTable = "List of Author";
                // set value for jsp by request.
                request.setAttribute("list", vector);
                request.setAttribute("titlepage", titlePage);
                request.setAttribute("titleTabale", titleTable);
                // select jsp
                RequestDispatcher dispath = request.getRequestDispatcher("/JSP/Display/DisplayAuthor.jsp");
                dispath.forward(request, response);
            }
            if (service.equals("updateAuthor")) {
                String submit = request.getParameter("submit");
                if (submit == null) {
                    String au_id = request.getParameter("au_id");
                    String sql = "select * from authors where au_id ='" + au_id + "'";
                    ResultSet rs = dao.getData(sql);
                    try {
                        if (rs.next()) {
                            out.print("<form action=\"AuthorsController\" method=\"post\">\n"
                                    + "            <input type=\"hidden\" name=\"go\" value=\"updateAuthor\">\n"
                                    + "            <table>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Author ID</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name = \"au_id\" value=\"" + rs.getString(1) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Last Name</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"au_lname\" value=\"" + rs.getString(2) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>First Name</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name=\"au_fname\" value=\"" + rs.getString(3) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Phone</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"phone\" value=\"" + rs.getString(4) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Address</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"address\" value=\"" + rs.getString(5) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>City</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"city\" value=\"" + rs.getString(6) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>State</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"state\" value=\"" + rs.getString(7) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Zip</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"zip\" value=\"" + rs.getString(8) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Contract</td>\n"
                                    + "                    <td>\n");
                            if (rs.getString(9).equals("1")) {
                                out.print(" <input type=\"radio\" name =\"contract\" value=\"0\"> 0\n"
                                        + " <input type=\"radio\" name =\"contract\" value =\"1\" checked> 1");
                            } else {
                                out.print(" <input type=\"radio\" name =\"contract\" value=\"0\" checked> 0\n"
                                        + "<input type=\"radio\" name =\"contract\" value =\"1\"> 1");
                            }
                            out.print("</td>\n"
                                    + "                </tr>\n"
                                    + "            </table>\n"
                                    + "            <p>\n"
                                    + "                <input type=\"submit\" value=\"update\" name=\"submit\">\n"
                                    + "                <input type=\"reset\" value=\"clear\">\n"
                                    + "            </p>\n"
                                    + "        </form>");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    String au_id1 = request.getParameter("au_id");
                    String au_lname = request.getParameter("au_lname");
                    String au_fname = request.getParameter("au_fname");
                    String phone = request.getParameter("phone");
                    String address = request.getParameter("address");
                    String City = request.getParameter("city");
                    String state = request.getParameter("state");
                    String zip = request.getParameter("zip");
                    String contract = request.getParameter("contract");
                    int contra = Integer.parseInt(contract);
                    authors au = new authors(au_id1, au_lname, au_fname, phone, address, City, state, zip, contra);
                    int n = dao.updateAuthor(au);
                    response.sendRedirect("AuthorsController");
                }
            }
        }
    }
        public void dispath(HttpServletRequest request,
            HttpServletResponse response, String page)
            throws IOException, ServletException {
        RequestDispatcher dispath = request.getRequestDispatcher(page);
        dispath.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
