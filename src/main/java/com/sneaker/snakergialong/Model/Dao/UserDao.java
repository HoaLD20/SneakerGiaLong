package com.sneaker.snakergialong.Model.Dao;

import com.sneaker.snakergialong.Model.Entities.User;
import com.sneaker.snakergialong.Model.utilize.SHA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends DBConnection {
    public User bean = new User();
    public Connection con;
    public boolean b = false;

    public UserDao() {
        DBConnection db = new DBConnection();
        this.con = db.getConnect();
    }

    private boolean search(String userName) {

        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM `users` WHERE `uEmail` = ? ");
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                b = true;
            } else {
                b = false;
            }
            closeConnection();
        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        return b;
    }

    /**
     * @param username
     * @param password
     * @return
     */
    public User signIn(String username, String password) {

        User userSinIn = new User();
        userSinIn = null;
        try {
            if (search(username)) {
//                con = db.getConnect();
                String sql = "SELECT * FROM `users` WHERE `uEmail`=? AND `uPassword`=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, password);
//                pst.setString(2, SHA.encrypt(password));
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    userSinIn = new User(rs.getInt("uId"), rs.getString("uName"), rs.getString("uEmail"), rs.getString("uJob"), rs.getString("uPassword"), rs.getString("uRole"), rs.getString("uPhoto"), rs.getString("uAddress"));
                }

                System.out.println(userSinIn);
                return userSinIn;
            }
            closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) {
//        UserDao userDao = new UserDao();
//        System.out.println(userDao.signIn("leduchoa911@gmail.com", "hoa"));
//    }
}

