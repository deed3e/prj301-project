/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.stores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOstores;

/**
 *
 * @author pallgree
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

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
       request.getRequestDispatcher("template/auth/register.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String name=request.getParameter("name");
        String add=request.getParameter("add");
        String city=request.getParameter("city");
        String state=request.getParameter("state");
        String zip=request.getParameter("zip");
        String id=request.getParameter("id");
        stores st = new stores(id,name,add,city,state,zip,user,pass);
        DAOstores dao= new DAOstores();
        if(dao.checkUsername(user)==0){
            request.setAttribute("status", "1");
            request.getRequestDispatcher("template/auth/register.jsp").forward(request, response);
        }
        if(dao.checkUsername(user)==1){
        int n=dao.addStores(st);
        if(n==0){
            request.setAttribute("status", "2");
            request.getRequestDispatcher("template/auth/register.jsp").forward(request, response);
        }
         if(n==1){
            request.setAttribute("status", "3");
            request.getRequestDispatcher("template/auth/loginEmloyment.jsp").forward(request, response);
        }
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
