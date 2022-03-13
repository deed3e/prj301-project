/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.tiltes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.rsa.RSACore;

/**
 *
 * @author pallgree
 */
public class DAOtiltes extends ConnectDB {

    public int addTiles(tiltes til) {
        int n = 0;
        String sql = "INSERT INTO [titles]"
                + "           ([title_id]"
                + "           ,[title]"
                + "           ,[type]"
                + "           ,[pub_id]"
                + "           ,[price]"
                + "           ,[advance]"
                + "           ,[royalty]"
                + "           ,[ytd_sales]"
                + "           ,[notes]"
                + "           ,[pubdate])"
                + "     VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, til.getTitle_id());
            pre.setString(2, til.getTitle());
            pre.setString(3, til.getType());
            pre.setString(4, til.getPub_id());
            pre.setDouble(5, til.getPrice());
            pre.setDouble(6, til.getAdvance());
            pre.setInt(7, til.getRoyalty());
            pre.setInt(8, til.getYtd_sales());
            pre.setString(9, til.getNotes());
            pre.setString(10, til.getPubdate());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public Vector<tiltes> seachPrice(double from, double to) {
        Vector<tiltes> vector = new Vector<>();
        String sql = "select * from titles where price between " + from + " and " + to;
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {

                String tile_id = rs.getString("title_id"); // rs.getString(1);
                String title = rs.getString(2);
                String type = rs.getString(3);
                String pub_id = rs.getString(4);
                double pricers = rs.getDouble("price");
                double advance = rs.getDouble(6);
                int royalty = rs.getInt("royalty");
                int ytd_sales = rs.getInt(8);
                String notes = rs.getString(9);
                String pubdate = rs.getString(10);
                tiltes obj = new tiltes(tile_id, title, type, pub_id, pricers, advance, royalty, ytd_sales, notes, pubdate);
                vector.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public Vector<tiltes> searchName(String titleNAme) {
        Vector<tiltes> vector = new Vector<tiltes>();
        String sql = "Select * from titles where title like'%" + titleNAme + "%'";
        ResultSet rs = getData(sql);
        try {
            while (rs.next()) {
                //Tu tren xuong duoi
                //dataType varName = rs.getDataType(fileNAme,index = 1);
                String tile_id = rs.getString("title_id"); // rs.getString(1);
                String title = rs.getString(2);
                String type = rs.getString(3);
                String pub_id = rs.getString(4);
                double pricers = rs.getDouble("price");
                double advance = rs.getDouble(6);
                int royalty = rs.getInt("royalty");
                int ytd_sales = rs.getInt(8);
                String notes = rs.getString(9);
                String pubdate = rs.getString(10);
                String path = rs.getString(11);
                tiltes obj = new tiltes(tile_id, title, type, pub_id, pricers, advance, royalty, ytd_sales, notes, pubdate, path);
                vector.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public Vector<tiltes> searchByPublisher(String publisher) {
        Vector<tiltes> vector = new Vector<tiltes>();
        String sql = "select a.title_id,a.title,a.type,a.pub_id,a.price,a.advance,a.royalty,a.ytd_sales,a.notes,a.pubdate from titles a,publishers b \n"
                + "where a.pub_id=b.pub_id and b.pub_name = '" + publisher + "'";
        ResultSet rs = getData(sql);
        System.out.print(publisher);
        try {
            while (rs.next()) {
                //Tu tren xuong duoi
                //dataType varName = rs.getDataType(fileNAme,index = 1);
                String tile_id = rs.getString("title_id"); // rs.getString(1);
                String title = rs.getString(2);
                String type = rs.getString(3);
                String pub_id = rs.getString(4);
                double pricers = rs.getDouble("price");
                double advance = rs.getDouble(6);
                int royalty = rs.getInt("royalty");
                int ytd_sales = rs.getInt(8);
                String notes = rs.getString(9);
                String pubdate = rs.getString(10);
                tiltes obj = new tiltes(tile_id, title, type, pub_id, pricers, advance, royalty, ytd_sales, notes, pubdate);
                vector.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public Vector<tiltes> viewAllTiles() {
        Vector vector = new Vector<>();
        String sql = "Select * from titles";
        try {
            ResultSet rs = getData(sql);
            while (rs.next()) {
                //Tu tren xuong duoi
                //dataType varName = rs.getDataType(fileNAme,index = 1);
                String tile_id = rs.getString("title_id"); // rs.getString(1);
                String title = rs.getString(2);
                String type = rs.getString(3);
                String pub_id = rs.getString(4);
                double pricers = rs.getDouble("price");
                double advance = rs.getDouble(6);
                int royalty = rs.getInt("royalty");
                int ytd_sales = rs.getInt(8);
                String notes = rs.getString(9);
                String pubdate = rs.getString(10);
                String path = rs.getString(11);
                tiltes obj = new tiltes(tile_id, title, type, pub_id, pricers, advance, royalty, ytd_sales, notes, pubdate, path);
                vector.add(obj);
            }
//            while (rs.previous()){
//                //Tu duoi len tren
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public Vector<tiltes> view5Tiles(int num) {
        Vector vector = new Vector<>();
        String sql = "SELECT * \n"
                + "FROM titles a\n"
                + "ORDER BY a.title\n"
                + "OFFSET "+num+" ROWS\n"
                + "fetch next 4 rows only";
        try {
            ResultSet rs = getData(sql);
            while (rs.next()) {
                //Tu tren xuong duoi
                //dataType varName = rs.getDataType(fileNAme,index = 1);
                String tile_id = rs.getString("title_id"); // rs.getString(1);
                String title = rs.getString(2);
                String type = rs.getString(3);
                String pub_id = rs.getString(4);
                double pricers = rs.getDouble("price");
                double advance = rs.getDouble(6);
                int royalty = rs.getInt("royalty");
                int ytd_sales = rs.getInt(8);
                String notes = rs.getString(9);
                String pubdate = rs.getString(10);
                String path = rs.getString(11);
                tiltes obj = new tiltes(tile_id, title, type, pub_id, pricers, advance, royalty, ytd_sales, notes, pubdate, path);
                vector.add(obj);
            }
//            while (rs.previous()){
//                //Tu duoi len tren
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vector;
    }

    public tiltes view1Title(String id) {
        tiltes t1 = new tiltes();
        String sql = "Select * from titles where title_id='" + id + "'";
        try {
            ResultSet rs = getData(sql);
            rs.absolute(1);
            String tile_id = rs.getString("title_id"); // rs.getString(1);
            String title = rs.getString(2);
            String type = rs.getString(3);
            String pub_id = rs.getString(4);
            double pricers = rs.getDouble(5);
            double advance = rs.getDouble(6);
            int royalty = rs.getInt(7);
            int ytd_sales = rs.getInt(8);
            String notes = rs.getString(9);
            String pubdate = rs.getString(10);
            String path = rs.getString(11);
            tiltes obj = new tiltes(tile_id, title, type, pub_id, pricers, advance, royalty, ytd_sales, notes, pubdate, path);
            return obj;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t1;
    }

    public int updateTitle(tiltes til) {
        int n = 0;
        String sql = "update titles set "
                + "            [title]=?"
                + "           ,[type]=?"
                + "           ,[pub_id]=?"
                + "           ,[price]=?"
                + "           ,[advance]=?"
                + "           ,[royalty]=?"
                + "           ,[ytd_sales]=?"
                + "           ,[notes]=?"
                + "           ,[pubdate]=?"
                + "           ,[img]=?"
                + " where [title_id] =?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, til.getTitle());
            pre.setString(2, til.getType());
            pre.setString(3, til.getPub_id());
            pre.setDouble(4, til.getPrice());
            pre.setDouble(5, til.getAdvance());
            pre.setInt(6, til.getRoyalty());
            pre.setInt(7, til.getYtd_sales());
            pre.setString(8, til.getNotes());
            pre.setString(9, til.getPubdate());
            pre.setString(10, til.getPath());
            pre.setString(11, til.getTitle_id());
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return n;
    }

    public int deleteTile(String id) {
        int n = 0;
        String sql = "delete from titles where title_id ='" + id + "'";
        try {
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }

    public static void main(String[] args) {
        DAOtiltes dao = new DAOtiltes();
        Vector<tiltes> list = dao.viewAllTiles()
        );
       for (tiltes item : list) {
            System.out.println(item.getTitle());
        }

    }
}
