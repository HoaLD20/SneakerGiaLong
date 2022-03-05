package com.sneaker.snakergialong.Model.Dao;

import com.mysql.cj.log.Log;
import com.sneaker.snakergialong.Model.Entities.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDao {
    private Connection connection;
    DBConnection dbConnection;
    ResultSet rs;
    ArrayList<Product> products;

    public ProductDao() {
        dbConnection = new DBConnection();
        connection = dbConnection.getConnect();
        products = new ArrayList<>();
        load();
    }

    public ArrayList<Product> getAll() {
        return products;
    }

    public void load() {
        try {
            String sql = "SELECT * FROM `products` WHERE pStatus !=0 ORDER BY pId DESC";
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            products.clear();
            while (rs.next()) {
                int pId = rs.getInt("pId");
                String pName = rs.getString("pName");
                double pPrice = rs.getDouble("pPrice");
                String pBrand = rs.getString("pBrand");
                String pDescription = rs.getString("pDescription");
                String pColor = rs.getString("pColor");
                int pSize = rs.getInt("pSize");
                int pQuantity = rs.getInt("pQuantity");
                String pImage1 = rs.getString("pImage1");
                String pImage2 = rs.getString("pImage2");
                String pImage3 = rs.getString("pImage3");
                String pImage4 = rs.getString("pImage4");
                int pInStock = rs.getInt("pInStock");
                int pOnOrder = rs.getInt("pOnOrder");
                int pStatus = rs.getInt("pStatus");
                products.add(new Product(pId, pName, pPrice, pBrand, pDescription, pColor, pSize, pQuantity, pImage1, pImage2, pImage3, pImage4, pInStock, pOnOrder, pStatus));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getAmount() {
        return products.size();
    }

    public ArrayList<Product> getInRange(int start, int end) {
        try {
            ArrayList<Product> productsInRange = new ArrayList<>();
            String sql = "SELECT * FROM `products` WHERE pStatus !=0 ORDER BY pId DESC LIMIT ?, ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, start);
            pst.setInt(2, end);
            rs = pst.executeQuery();
            productsInRange.clear();
            while (rs.next()) {
                int pId = rs.getInt("pId");
                String pName = rs.getString("pName");
                double pPrice = rs.getDouble("pPrice");
                String pBrand = rs.getString("pBrand");
                String pDescription = rs.getString("pDescription");
                String pColor = rs.getString("pColor");
                int pSize = rs.getInt("pSize");
                int pQuantity = rs.getInt("pQuantity");
                String pImage1 = rs.getString("pImage1");
                String pImage2 = rs.getString("pImage2");
                String pImage3 = rs.getString("pImage3");
                String pImage4 = rs.getString("pImage4");
                int pInStock = rs.getInt("pInStock");
                int pOnOrder = rs.getInt("pOnOrder");
                int pStatus = rs.getInt("pStatus");
                productsInRange.add(new Product(pId, pName, pPrice, pBrand, pDescription, pColor, pSize, pQuantity, pImage1, pImage2, pImage3, pImage4, pInStock, pOnOrder, pStatus));
            }
            return productsInRange;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Product getById(int id) {
        for (Product item : products) {
            if (item.getpId() == id) {
                return item;
            }
        }
        return null;
    }

    public int insert(
            int pId,
            String pName,
            double pPrice,
            String pBrand,
            String pDescription,
            String pColor,
            int pSize,
            int pQuantity,
            String pImage1,
            String pImage2,
            String pImage3,
            String pImage4,
            int pInStock,
            int pOnOrder,
            int pStatus
    ) {

        try {
            String sql = "INSERT INTO `products`(`pId`, `pName`, `pPrice`, `pBrand`, `pDescription`, `pColor`, `pSize`, `pQuantity`, `pImage1`, `pImage2`, `pImage3`, `pImage4`, `pInStock`, `pOnOrder`, `pStatus`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, pId);
            pst.setString(2, pName);
            pst.setDouble(3, pPrice);
            pst.setString(4, pBrand);
            pst.setString(5, pDescription);
            pst.setString(6, pColor);
            pst.setInt(7, pSize);
            pst.setInt(8, pQuantity);
            pst.setString(9, pImage1);
            pst.setString(10, pImage2);
            pst.setString(11, pImage3);
            pst.setString(12, pImage4);
            pst.setInt(13, pInStock);
            pst.setInt(14, pOnOrder);
            pst.setInt(15, pStatus);
            pst.execute();
            load();
            rs = pst.executeQuery("SELECT * FROM 'products'");
            if (rs.last()) {
                return rs.getInt("pId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public boolean update(
            int pId,
            String pName,
            double pPrice,
            String pBrand,
            String pDescription,
            String pColor,
            int pSize,
            int pQuantity,
            String pImage1,
            String pImage2,
            String pImage3,
            String pImage4,
            int pInStock,
            int pOnOrder,
            int pStatus
    ) {

        try {
            String sql = "UPDATE `products` SET ,`pName`=?,`pPrice`=?,`pBrand`=?,`pDescription`=?,`pColor`=?,`pSize`=?,`pQuantity`=?,`pImage1`=?,`pImage2`=?',`pImage3`=?',`pImage4`=?',`pInStock`=?',`pOnOrder`=?',`pStatus`=?' WHERE `pId`=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, pName);
            pst.setDouble(2, pPrice);
            pst.setString(3, pBrand);
            pst.setString(4, pDescription);
            pst.setString(5, pColor);
            pst.setInt(6, pSize);
            pst.setInt(7, pQuantity);
            pst.setString(8, pImage1);
            pst.setString(9, pImage2);
            pst.setString(10, pImage3);
            pst.setString(11, pImage4);
            pst.setInt(12, pInStock);
            pst.setInt(13, pOnOrder);
            pst.setInt(14, pStatus);
            pst.setInt(5, pId);
            pst.execute();
            load();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delete(int id) {
        try {
            String sql = "DELETE FROM `product` WHERE pId=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            load();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }

    public ArrayList<Product> getAll(int min, int max) {
        ArrayList<Product> pList = new ArrayList<>();

        for (Product p : products) {
            if (p.getpPrice() >= min && p.getpPrice() <= max) {
                pList.add(p);
            }
        }
        return pList;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
