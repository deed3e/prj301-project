/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.employee;
import entity.stores;
import java.io.UnsupportedEncodingException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author pallgree
 */
public class DAOstores extends ConnectDB {

    public int addStores(stores sto) {
        int n = 0;
        String sql = "INSERT INTO [stores]"
                + "           ([stor_id]"
                + "           ,[stor_name]"
                + "           ,[stor_address]"
                + "           ,[city]"
                + "           ,[state]"
                + "           ,[zip]"
                + "           ,[username]"
                + "           ,[password])"
                + "     VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, sto.getStor_id());
            pre.setString(2, sto.getStor_name());
            pre.setString(3, sto.getStor_address());
            pre.setString(4, sto.getCity());
            pre.setString(5, sto.getState());
            pre.setString(6, sto.getZip());
            pre.setString(7, sto.getUsername());
            pre.setString(8, sto.getPassword());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public int addStores1(stores sto) {
        int n = 0;
        String sql = "INSERT INTO [stores]"
                + "           ([stor_id]"
                + "           ,[stor_name]"
                + "           ,[stor_address]"
                + "           ,[city]"
                + "           ,[state]"
                + "           ,[zip])"
                + "     VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, sto.getStor_id());
            pre.setString(2, sto.getStor_name());
            pre.setString(3, sto.getStor_address());
            pre.setString(4, sto.getCity());
            pre.setString(5, sto.getState());
            pre.setString(6, sto.getZip());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public ResultSet checkAcc(String user) {
        String sql = "select password from stores where username='" + user + "'";
        ResultSet rs = getData(sql);
        return rs;
    }

    public stores infor(String user) {
        stores st1 = new stores();
        String sql = "select stor_id,stor_name,stor_address,city,state,zip from stores where username='" + user + "'";
        ResultSet rs = getData(sql);
        try {
            rs.absolute(1);
        } catch (SQLException ex) {
            Logger.getLogger(DAOemployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String stor_id = rs.getString(1);
            String stor_name = rs.getString(2);
            String stor_address = rs.getString("stor_address");
            String city = rs.getString(4);
            String state = rs.getString(5);
            String zip = rs.getString(6);
            stores sto = new stores(stor_id, stor_name, stor_address, city, state, zip);
            return sto;
        } catch (SQLException ex) {
            Logger.getLogger(DAOemployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        return st1;
    }

    public int updateStore(stores sto) {
        int n = 0;
        String sql = "update stores set"
                + "            [stor_name]=?"
                + "           ,[stor_address]=?"
                + "           ,[city]=?"
                + "           ,[state]=?"
                + "           ,[zip]=?"
                + " where   [stor_id]=?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, sto.getStor_name());
            pre.setString(2, sto.getStor_address());
            pre.setString(3, sto.getCity());
            pre.setString(4, sto.getState());
            pre.setString(5, sto.getZip());
            pre.setString(6, sto.getStor_id());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
        }
        return n;
    }

    public int checkUsername(String user){
        int n = 1;
        String sql = "select username from stores where username='" + user + "'";
        Statement state;
        ResultSet rs = getData(sql);
       
        try {
            if (rs.next())n=0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
        

        return n;
    }
      public ResultSet checkPassword(String gmail){
        ResultSet rs1;
        String sql = "select password from stores where gmail='" + gmail + "'";
        rs1 = getData(sql);

        return rs1;
        //return null;
    }

    public int deleteStor(String id) {
        int n = 0;
        String sql = "delete from stores where stor_id ='" + id + "'";
        try {
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return n;
    }

    public Vector<stores> viewAll() {
        Vector<stores> vector = new Vector<>();
        String sql = "select * from stores";
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {
                String stor_id = rs.getString(1);
                String stor_name = rs.getString(2);
                String stor_address = rs.getString("stor_address");
                String city = rs.getString(4);
                String state = rs.getString(5);
                String zip = rs.getString(6);
                stores sto = new stores(stor_id, stor_name, stor_address, city, state, zip);
                vector.add(sto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public Vector<stores> searchIdStor(String id) {
        Vector<stores> vector = new Vector<stores>();
        String sql = "select * from stores where stor_id like '%" + id + "%'";
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {
                String stor_id = rs.getString(1);
                String stor_name = rs.getString(2);
                String stor_address = rs.getString("stor_address");
                String city = rs.getString(4);
                String state = rs.getString(5);
                String zip = rs.getString(6);
                stores sto = new stores(stor_id, stor_name, stor_address, city, state, zip);
                vector.add(sto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }
    
    public Vector<stores> searchByName(String name) {
        Vector<stores> vector = new Vector<stores>();
        String sql = "select * from stores where stor_name like '%" + name + "%'";
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {
                String stor_id = rs.getString(1);
                String stor_name = rs.getString(2);
                String stor_address = rs.getString("stor_address");
                String city = rs.getString(4);
                String state = rs.getString(5);
                String zip = rs.getString(6);
                stores sto = new stores(stor_id, stor_name, stor_address, city, state, zip);
                vector.add(sto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }
    
    public Vector<String> viewOrderDetail() {
        Vector<String> vector = new Vector<>();
        String sql = "select * from stores sto inner join sales sa "
                + "on sto.stor_id = sa.stor_id inner join titles til "
                + "on sa.title_id = til.title_id inner join publishers pu "
                + "on pu.pub_id = til.pub_id";
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {
                // Sale
                String stor_id = rs.getString("stor_id");
                String ord_num = rs.getString("ord_num");
                String ord_dat = rs.getString("ord_date");
                int qty = rs.getInt("qty");
                String payterms = rs.getString("payterms");
                String title_id = rs.getString("title_id");
                // Store
                String stor_name = rs.getString("stor_name");
                String stor_address = rs.getString("stor_address");
                String city = rs.getString("city");
                String state = rs.getString("state");
                String zip = rs.getString("zip");
                // titles
                String tile_id = rs.getString("title_id"); // rs.getString(1);
                String title = rs.getString("title");
                String type = rs.getString("type");
                String pub_id = rs.getString("pub_id");
                double pricers = rs.getDouble("price");
                double advance = rs.getDouble("advance");
                int royalty = rs.getInt("royalty");
                int ytd_sales = rs.getInt("ytd_sales");
                String notes = rs.getString("notes");
                String pubdate = rs.getString("pubdate");

                // publisher 
                String pub_name = rs.getString("pub_name");
                String City = rs.getString(25);
                String country = rs.getString(27);

                String result = "" + stor_id + "\t" + stor_name + "\t" + stor_address + "\t" + City + "\t" + state + "\t" + zip + "\t" + ord_dat + "\t" + ord_num + "\t" + pub_name + "\t" + pubdate + "\t" + qty;
                vector.add(result);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public static void main(String[] args) {
        DAOstores dao = new DAOstores();

//      ResultSet res = dao.checkAcc("tienhung");
//      String res1 = "";
//        try {
//            res.absolute(1);
//            res1 = (res.getString(1));
//            System.out.print(res1);
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOemployee.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //stores st = new stores("Iot1", "pallgree", "tan xa", "ha noi", "GM", "1000", "pallgree", "111");
        Vector<stores> vector = dao.searchByName("the");  
        
    }
}
