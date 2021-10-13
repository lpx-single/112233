package com.smallhomework.dao;

import com.smallhomework.untity.Users;
import com.smallhomework.util.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private JdbcUtil util = new JdbcUtil();

    //添加数据行
    public int add(Users user) {
        System.out.println(user.getUserName());
        String sql = "insert into Users (userName, password, sex, email) values(?, ?, ?, ?)";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getSex());
            ps.setString(4, user.getEmail());
            result = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    public List<Users> findAll() {
        String sql = "select * from users";
        PreparedStatement ps = util.createStatement(sql);
        ResultSet rs = null;
        List<Users> users = new ArrayList<>();
        try {
            rs = ps.executeQuery();
            while(rs.next()) {
                Integer userId = rs.getInt("userId");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                String email = rs.getString("email");
                Users user = new Users(userId, userName, password, sex, email);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return users;
    }

    public int delete(String userId) {
        String sql = "delete from users where userId=?";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setInt(1, Integer.valueOf(userId));
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    public int modify(String password, String email) {
        String sql = "update users set email=? where password=?";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setString(1, email);
            ps.setString(2, password);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    public int signIn(String userName, String password) {
        String sql = "select * from users where userName = ? and password = ?";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        ResultSet rs = null;
        try {
            ps.setString(1, userName);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while(rs.next()) {
                ++result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return result;
    }

    public List<Users> seek(String userName) {
        String sql = "select * from users where userName = ?";
        PreparedStatement ps = util.createStatement(sql);
        ResultSet rs = null;
        List<Users> lists = new ArrayList<>();
        try {
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("userId");
                String name = rs.getString("userName");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                String email = rs.getString("email");
                Users user = new Users(id, name, password, sex, email);
                lists.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs);
        }
        return lists;
    }
}
