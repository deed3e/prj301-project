/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.discounts;
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
import model.DAOdiscounts;

/**
 *
 * @author pallgree
 */
@WebServlet(name = "DiscountsController", urlPatterns = {"/DiscountsController"})
public class DiscountsController extends HttpServlet {

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
        DAOdiscounts dao = new DAOdiscounts();
        String service = request.getParameter("go");
        if (service == null) {
            service = "listAllDicsount";
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if (service.equals("insertDiscounts")) {
                String dicounttype = request.getParameter("discounttype");
                String stor_id = request.getParameter("stor_id");
                String lowqty = request.getParameter("lowqty");
                String hightqty = request.getParameter("hightqty");
                String discount = request.getParameter("discount");
                if (dicounttype == null || dicounttype.equals("")) {
                    out.print("<h2>Discounttype is not null!</h2>");
                    return;
                }
                if (discount == null || discount.equals("")) {
                    out.print("<h2>Discount is not null</h2>");
                    return;
                }
                int lowqty1 = Integer.parseInt(lowqty);
                int hightqty1 = Integer.parseInt(hightqty);
                double discount1 = Double.parseDouble(discount);
                discounts dis = new discounts(dicounttype, stor_id, lowqty1, hightqty1, discount1);
                dao.addDiscounts(dis);
                response.sendRedirect("DiscountsController");
            }
            if (service.equals("listAllDicsount")) {
                Vector<discounts> vector = dao.viewAll();
                 // pre some other data
                String titlePage = "Discounts manager";
                String titleTable = "List of discounts";
                // set value for jsp by request.
                request.setAttribute("list", vector);
                request.setAttribute("titlepage", titlePage);
                request.setAttribute("titleTabale", titleTable);
                // select jsp
                RequestDispatcher dispath = request.getRequestDispatcher("/JSP/Display/DisplayDiscounts.jsp");
                dispath.forward(request, response);
            }

            if (service.equals("updateDicount")) {
                String submit = request.getParameter("submit");
                if (submit == null) {
                    String stor_id = request.getParameter("storid");
                    String sql;
                    if (stor_id.equals("null")) {
                        sql = "select * from discounts where stor_id is null";
                    } else {
                        sql = "select * from discounts where stor_id = '" + stor_id + "'";
                    }
                    ResultSet rs = dao.getData(sql);
                    try {
                        if (rs.next()) {
                            out.print("<form action=\"DiscountsController\" method=\"post\">\n"
                                    + "            <input type=\"hidden\" name=\"go\" value=\"updateDicount\">\n"
                                    + "            <table>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Discounttype</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name=\"discounttype\" value=\"" + rs.getString(1) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td><label for=\"stor_id\">Stores</label></td>\n"
                                    + "                    <td>\n"
                                    + " <select name=\"stor_id\" id=\"stor_id\">\n");

                            ResultSet rs1 = dao.getData("select * from stores");
                            while (rs1.next()) {
                                if (rs1.getString(1).equals(rs.getString(2))) {
                                    out.print("<option value=\"" + rs1.getString(1) + "\" selected>" + rs1.getString(2) + "</option>\n");
                                }
                                else{
                                    out.print("<option value=\"" + rs1.getString(1) + "\">" + rs1.getString(2) + "</option>\n");
                                }
                            }
                            out.print(" </select>\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Low Quantity</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"number\" name =\"lowqty\" value=\"" + rs.getString(3) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Hight Quantity</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"number\" name =\"hightqty\" value=\"" + rs.getString(4) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Dicount</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"number\" name=\"discount\" value=\"" + rs.getString(5) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "            </table>\n"
                                    + "            <p>\n"
                                    + "                <input type=\"submit\" value=\"update\" name=\"submit\">\n"
                                    + "                <input type=\"reset\" value=\"reset\">\n"
                                    + "            </p>\n"
                                    + "        </form>");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    String dicounttype = request.getParameter("discounttype");
                    String stor_id = request.getParameter("stor_id");
                    String lowqty = request.getParameter("lowqty");
                    String hightqty = request.getParameter("hightqty");
                    String discount = request.getParameter("discount");
                    int lowqty1 = Integer.parseInt(lowqty);
                    int hightqty1 = Integer.parseInt(hightqty);
                    double discount1 = Double.parseDouble(discount);
                    discounts dis = new discounts(dicounttype, stor_id, lowqty1, hightqty1, discount1);
                    int n = dao.updateDiscount(dis);
                    response.sendRedirect("DiscountsController");
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
