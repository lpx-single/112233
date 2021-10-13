package com.smallhomework.controller;

import com.smallhomework.dao.UserDao;
import com.smallhomework.untity.Users;
import com.smallhomework.util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserFindServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        PrintWriter out = null;
        //调用【Dao]将查询命令推送到数据库服务器上，得到所有用户信息【list】
        List<Users> users = dao.findAll();
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();

        out.print("<center>\n" +
                "    <form action=\"/myWeb/user/seek\", method=\"get\">\n" +
                "        <table border=\"2\">\n" +
                "            <tr>\n" +
                "                <td>带查找用户姓名</td>\n" +
                "                <td><input type=\"text\" name=\"userName\"/></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td><input type=\"submit\" value=\"用户查找\"/></td>\n" +
                "                <td><input type=\"reset\"/></td>\n" +
                "            </tr>\n" +
                "        </table>\n" +
                "    </form>\n" +
                "</center>");


        out.print("<table border='2' align='center'>");
        out.print("<tr>");
        out.print("<td>用户编号</td>");
        out.print("<td>用户姓名</td>");
        out.print("<td>用户密码</td>");
        out.print("<td>用户性别</td>");
        out.print("<td>用户邮箱</td>");
        out.print("<td>修改邮箱</td>");
        out.print("<td>删除用户</td>");
        out.print("</tr>");
        for (Users user : users) {
            out.print("<tr>");
            out.print("<td>" + user.getUserId() + "</td>");
            out.print("<td>" + user.getUserName() + "</td>");
            out.print("<td>" + "******" + "</td>");
            out.print("<td>" + user.getSex() + "</td>");
            out.print("<td>" + user.getEmail() + "</td>");
            out.print("<td><a href='/myWeb/user_email.html'>修改邮箱</a></td>");
            out.print("<td><a href='/myWeb/user/delete?userId=" + user.getUserId() + "'>删除用户</a></td>");
            out.print("</tr>");
        }
    }
}
