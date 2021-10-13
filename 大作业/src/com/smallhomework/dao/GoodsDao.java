package com.smallhomework.dao;

import com.smallhomework.untity.Goods;
import com.smallhomework.untity.Users;
import com.smallhomework.util.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDao {
    private JdbcUtil util = new JdbcUtil();

    //添加数据行
    public int add(Goods good) {
        String sql = "insert into Goods (goodNum, length, width, height) values(?, ?, ?, ?)";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setString(1, good.getGoodNum());
            ps.setInt(2, good.getLength());
            ps.setInt(3, good.getWidth());
            ps.setInt(4, good.getHeight());
            result = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    public List<Goods> findAll() {
        String sql = "select * from Goods";
        PreparedStatement ps = util.createStatement(sql);
        ResultSet rs = null;
        List<Goods> goods = new ArrayList<>();
        try {
            rs = ps.executeQuery();
            while(rs.next()) {
                String goodNum = rs.getString("goodNum");
                int  length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                Goods good = new Goods(goodNum, length, width, height);
                goods.add(good);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return goods;
    }

    public int delete(String goodNum) {
        String sql = "delete from Goods where goodNum=?";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setString(1, goodNum);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    public int modify(String goodNum, int length) {
        String sql = "update Goods set length=? where goodNum=?";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setInt(1, length);
            ps.setString(2, goodNum);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }
}
