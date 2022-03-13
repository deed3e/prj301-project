/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.sales;
import entity.tiltes;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOsales;
import model.DAOtiltes;

/**
 *
 * @author pallgree
 */
@WebServlet(name = "checkOut", urlPatterns = {"/checkOut"})
public class checkOut extends HttpServlet {

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
        DAOsales dao = new DAOsales();
        HttpSession session = request.getSession();
        java.util.Enumeration em = session.getAttributeNames();
        String key = "";
        DAOtiltes dao1 = new DAOtiltes();
        while (em.hasMoreElements()) {
            key = em.nextElement().toString();
            if (!key.equals("count_cart") && !key.equals("user")){
                System.out.println(key);              
                String stor_id = "6380";
                String ord_num = "N914008";
                //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                //LocalDateTime now = LocalDateTime.now();
                //String ord_date = String.valueOf(dtf.format(now));
                String ord_date="1994-09-14 00:00:00.000";
                String qty = (String) session.getAttribute(key);
                String payterms = "Net 66";
                String title_id = key;
                String status = "1";
                int qty1 = Integer.parseInt(qty);
                int status1 = Integer.parseInt(status);
                sales sa = new sales(stor_id, ord_num, ord_date, qty1, payterms, title_id, status1);
                System.out.println(sa.toString());
                int n=dao.addSales(sa);
                System.out.println(n);
                session.removeAttribute(key);

            }
            session.setAttribute("count_cart", "0"); 

        }
        request.setAttribute("status", "1");
        request.getRequestDispatcher("template/showCart.jsp").forward(request, response);
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
