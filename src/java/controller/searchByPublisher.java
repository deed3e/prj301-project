/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.tiltes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOtiltes;

/**
 *
 * @author pallgree
 */
@WebServlet(name = "searchByPublisher", urlPatterns = {"/searchByPublisher"})
public class searchByPublisher extends HttpServlet {

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
        String query=request.getParameter("query");
        DAOtiltes dao=new DAOtiltes();
        Vector<tiltes> list= dao.searchByPublisher(query);
        try (PrintWriter out = response.getWriter()){
          for(tiltes item:list){ 
              String date=item.getPubdate().substring(0, 10);
            out.println("<tr> <td class=\"product__cart__item\">\n" +
"                                                            <div class=\"product__cart__item__pic\">\n" +
"                                                                <img src=\"assets/img/shopping-cart/cart-1.jpg\" class=\"rounded-circle\" width=\"90px\" height=\"90px\"  alt=\"\">\n" +
"                                                            </div>\n" +
"                                                            <div class=\"product__cart__item__text\">\n" +
"                                                                <h6>"+item.getTitle()+"</h6>\n" +
"                                                                <h5>$"+item.getPrice()+"</h5>\n" +
"                                                            </div>\n" +
"                                                        </td>\n" +
"                                                        <td class=\"quantity__item\">\n" +
"                                                            <h6>"+item.getNotes()+"</h6> \n" +
"                                                            </div>\n" +
"                                                        </td>\n" +
"                                                        <th></th>\n" +
"                                                        <td><h6>"+date+"</h6></td>\n" +
"                                                        <td class=\"cart__add\"><img onclick=\"addtocart('"+item.getTitle_id()+"')\" src=\"assets/img/icon/add_cart.png\"></a></td></tr>");
           
          }
        }
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
