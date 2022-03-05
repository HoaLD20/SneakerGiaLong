package com.sneaker.snakergialong.Model.Dao;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {

    public Connection conn = null;

    public DBConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sneaker", "root", "");
            System.out.println("Connect successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnect() {
        return conn;
    }

    public boolean closeConnection() {
        try {

            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }

    /**
     * Test connection
     * @param args
     */
//    public static void main(String[] args) {
//        DBConnection connection = new DBConnection();
//        System.out.println(connection.getConnect());
//    }

}
