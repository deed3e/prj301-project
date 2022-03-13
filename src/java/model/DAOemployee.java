/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pallgree
 */
public class DAOemployee extends ConnectDB {

    public int addEmployee(employee emp) {
        int n = 0;
        String sql = "INSERT INTO [employee]"
                + "           ([emp_id]"
                + "           ,[fname]"
                + "           ,[minit]"
                + "           ,[lname]"
                + "           ,[job_id]"
                + "           ,[job_lvl]"
                + "           ,[pub_id]"
                + "           ,[hire_date])"
                + "     VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, emp.getEmp_id());
            pre.setString(2, emp.getFname());
            pre.setString(3, emp.getMinit());
            pre.setString(4, emp.getLname());
            pre.setInt(5, emp.getJob_id());
            pre.setInt(6, emp.getJob_lvl());
            pre.setString(7, emp.getPub_id());
            pre.setString(8, emp.getHire_date());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public ResultSet checkAcc(String user){
        String sql="select password from employee where username='"+user+"'";
        ResultSet rs = getData(sql);   
        return rs;
    }
    public employee infor(String user) {
        employee emp1 = new employee();
        String sql="select emp_id,fname,minit,lname,job_id,job_id,pub_id,hire_date "
                + "from employee where username='"+user+"'";
        ResultSet rs = getData(sql);
        try {
            rs.absolute(1);
        } catch (SQLException ex) {
            Logger.getLogger(DAOemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        String emp_id;
        try {
            emp_id = rs.getString(1);
             String fname = rs.getString(2);
                String minit = rs.getString("minit");
                String lname = rs.getString("lname");
                int job_id = rs.getInt("job_id");
                int job_lvl = rs.getInt(6);
                String pub_id = rs.getString(7);
                String hire_date = rs.getString(8);
               employee emp = new employee(emp_id, fname, minit, lname, job_id, job_lvl, pub_id, hire_date);
               return emp;
        } catch (SQLException ex) {
            Logger.getLogger(DAOemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        return emp1;
    }

    public int updateEmployee(employee emp) {
        int n = 0;
        String sql = "update employee set "
                + "            [fname]=?"
                + "           ,[minit]=?"
                + "           ,[lname]=?"
                + "           ,[job_id]=?"
                + "           ,[job_lvl]=?"
                + "           ,[pub_id]=?"
                + "           ,[hire_date]=? "
                + " where emp_id = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, emp.getFname());
            pre.setString(2, emp.getMinit());
            pre.setString(3, emp.getLname());
            pre.setInt(4, emp.getJob_id());
            pre.setInt(5, emp.getJob_lvl());
            pre.setString(6, emp.getPub_id());
            pre.setString(7, emp.getHire_date());
            pre.setString(8, emp.getEmp_id());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public int removeEmployee(String id) {
        int n = 0;
        String sql = "delete from employee where emp_id ='" + id + "'";
        try {
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public Vector<employee> viewAll() {
        Vector<employee> vector = new Vector<>();
        String sql = "select * from employee";
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {
                String emp_id = rs.getString(1);
                String fname = rs.getString(2);
                String minit = rs.getString("minit");
                String lname = rs.getString("lname");
                int job_id = rs.getInt("job_id");
                int job_lvl = rs.getInt(6);
                String pub_id = rs.getString(7);
                String hire_date = rs.getString(8);
                employee emp = new employee(emp_id, fname, minit, lname, job_id, job_lvl, pub_id, hire_date);
                vector.add(emp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public Vector<employee> searchIDemp(String id) {
        Vector<employee> vector = new Vector<>();
        String sql = "Select * from employee where emp_id = '" + id + "'";
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {
                String emp_id = rs.getString(1);
                String fname = rs.getString(2);
                String minit = rs.getString("minit");
                String lname = rs.getString("lname");
                int job_id = rs.getInt("job_id");
                int job_lvl = rs.getInt(6);
                String pub_id = rs.getString(7);
                String hire_date = rs.getString(8);
                employee emp = new employee(emp_id, fname, minit, lname, job_id, job_lvl, pub_id, hire_date);
                vector.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
    }

    public static void main(String[] args)  {
        DAOemployee dao = new DAOemployee();
        ResultSet res = dao.checkAcc("admin");
        String res1 = "";
        try {
            res.absolute(1);
            res1 = (res.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(DAOemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.print(res1.trim());
    }
}
