/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOemployee;

/**
 *
 * @author pallgree
 */
@WebServlet(name = "EmployeeController", urlPatterns = {"/EmployeeController"})
public class EmployeeController extends HttpServlet {

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
        DAOemployee dao = new DAOemployee();
        if (service == null) {
            service = "listAllEmployee";
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if (service.equals("insertEmployee")) {
                String emp_id = request.getParameter("emp_id");
                String fname = request.getParameter("fname");
                String minit = request.getParameter("minit");
                String lname = request.getParameter("lname");
                String job_id = request.getParameter("job_id");
                String job_lvl = request.getParameter("job_lvl");
                String pub_id = request.getParameter("pub_id");
                String hire_date = request.getParameter("hire_date");
                if (emp_id == null || emp_id.equals("")) {
                    out.print("<h2>Employee ID is not null</h2>");
                    return;
                }
                if (fname == null || fname.equals("")) {
                    out.print("<h2>Fname is not null</h2>");
                    return;
                }
                if (lname == null || lname.equals("")) {
                    out.print("<h2>Lname is not null</h2>");
                    return;
                }
                if (job_id == null || job_id.equals("")) {
                    out.print("<h2>Jod ID is not null</h2>");
                    return;
                }
                if (pub_id == null || pub_id.equals("")) {
                    out.print("<h2>Pub Id is not null</h2>");
                    return;
                }
                if (hire_date == null || hire_date.equals("")) {
                    out.print("<h2>Hire date is not null</h2>");
                    return;
                }
                int job_id1 = Integer.parseInt(job_id);
                int job_lvl1 = Integer.parseInt(job_lvl);
                employee emp = new employee(emp_id, fname, minit, lname, job_id1, job_lvl1, pub_id, hire_date);
                dao.addEmployee(emp);
                response.sendRedirect("EmployeeController");
            }
            if (service.equals("listAllEmployee")) {
                Vector<employee> vector = dao.viewAll();
                // pre some other data
                String titlePage = "Employee manager";
                String titleTable = "List of employee";
                // set value for jsp by request.
                request.setAttribute("list", vector);
                request.setAttribute("titlepage", titlePage);
                request.setAttribute("titleTabale", titleTable);
                // select jsp
                RequestDispatcher dispath = request.getRequestDispatcher("/JSP/Display/DisplayEmployee.jsp");
                dispath.forward(request, response);
            
            }
            if (service.equals("updateEmployee")) {
                String submit = request.getParameter("submit");
                if (submit == null) {
                    String empId = request.getParameter("emp_id");
                    String sql = "select * from employee where emp_id = '" + empId + "'";
                    ResultSet rs = dao.getData(sql);
                    try {
                        if (rs.next()) {
                            out.print("<form action=\"EmployeeController\" method=\"post\">\n"
                                    + "            <input type=\"hidden\" name=\"go\" value=\"updateEmployee\">\n"
                                    + "            <table>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Employee ID</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"emp_id\" value=\"" + rs.getString(1) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>First Name</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"fname\" value=\"" + rs.getString(2) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Minit</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"minit\" value=\"" + rs.getString(3) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Last Name</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"text\" name =\"lname\" value=\"" + rs.getString(4) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td><label for=\"job_id\">Job ID</label></td>\n"
                                    + "                    <td>\n"
                                    + "                        <select name=\"job_id\" id=\"job_id\">\n");
                            ResultSet rs1 = dao.getData("select * from jobs");
                            while (rs1.next()) {
                                if (rs1.getString(1) == rs.getString(5)) {
                                    out.print("<option value=\"" + rs1.getString(1) + "\" checked>" + rs1.getString(1) + "</option>\n");
                                } else {
                                    out.print("<option value=\"" + rs1.getString(1) + "\">" + rs1.getString(1) + "</option>\n");
                                }
                            }
                            out.print(" </select>\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Job LVL</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"number\" name =\"job_lvl\" value=\"" + rs.getString(6) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td><label for=\"pub_id\">PubLisher</label></td>\n"
                                    + "                    <td>\n"
                                    + "                        <select name=\"pub_id\" id=\"pub_id\">\n");
                            ResultSet rs2 = dao.getData("select * from publishers");
                            while (rs2.next()) {
                                if (rs2.getString(1).equals(rs.getString(7))) {
                                    out.print("<option value=\"" + rs2.getString(1) + "\" checked>" + rs2.getString(2) + "</option>\n");
                                } else {
                                    out.print("<option value=\"" + rs2.getString(1) + "\">" + rs2.getString(2) + "</option>\n");
                                }
                            }
                            
                            out.print("                        </select>\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "                <tr>\n"
                                    + "                    <td>Hire Date</td>\n"
                                    + "                    <td>\n"
                                    + "                        <input type=\"date\" name =\"hire_date\" value=\"" + rs.getDate(8) + "\">\n"
                                    + "                    </td>\n"
                                    + "                </tr>\n"
                                    + "            </table>\n"
                                    + "            <p>\n"
                                    + "                <input type=\"submit\" value=\"update\" name =\"submit\">\n"
                                    + "                <input type=\"reset\" value=\"reset\"> \n"
                                    + "            </p>\n"
                                    + "        </form>");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    String emp_id = request.getParameter("emp_id");
                    String fname = request.getParameter("fname");
                    String minit = request.getParameter("minit");
                    String lname = request.getParameter("lname");
                    String job_id = request.getParameter("job_id");
                    String job_lvl = request.getParameter("job_lvl");
                    String pub_id = request.getParameter("pub_id");
                    String hire_date = request.getParameter("hire_date");
                    int job_id1 = Integer.parseInt(job_id);
                    int job_lvl1 = Integer.parseInt(job_lvl);
                    employee emp = new employee(emp_id, fname, minit, lname, job_id1, job_lvl1, pub_id, hire_date);
                    dao.updateEmployee(emp);
                    response.sendRedirect("EmployeeController");
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
