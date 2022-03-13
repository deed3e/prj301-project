/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOstores;
import model.mail;

/**
 *
 * @author pallgree
 */
@WebServlet(name = "forgotPass", urlPatterns = {"/forgotPass"})
public class forgotPass extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            response.setContentType("text/html;charset=UTF-8");
            request.getRequestDispatcher("template/auth/forgotPass.jsp").forward(request, response);
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
        //processRequest(request, response);
        String gmail = request.getParameter("gmail");
        DAOstores dao = new DAOstores();
        ResultSet res = dao.checkPassword(gmail);
        try {
            res.absolute(1);
            String gmail1=res.getString(1);
            mail ma=new mail();
            int n= ma.sendMail(gmail, gmail1);
            request.setAttribute("status", "1");
            request.getRequestDispatcher("template/auth/forgotPass.jsp").forward(request, response);
        } catch (SQLException ex) {
            request.setAttribute("status", "2");
            request.getRequestDispatcher("template/auth/forgotPass.jsp").forward(request, response);
        } catch (MessagingException ex) {
            request.setAttribute("status", "3");
            request.getRequestDispatcher("template/auth/forgotPass.jsp").forward(request, response);
        } catch (UnsupportedEncodingException ex) {
            request.setAttribute("status", "3");
            request.getRequestDispatcher("template/auth/forgotPass.jsp").forward(request, response);
        }

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
