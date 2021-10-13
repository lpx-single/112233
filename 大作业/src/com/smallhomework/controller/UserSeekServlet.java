package com.smallhomework.controller;

import com.smallhomework.dao.UserDao;
import com.smallhomework.untity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserSeekServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        UserDao dao = new UserDao();
        PrintWriter out = null;
        //调用【Dao]将查询命令推送到数据库服务器上，得到所有用户信息【list】
        List<Users> users = dao.seek(userName);
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (users.size() == 0) {
            out.print("<font style='color:red;font-size:40'>没有该用户</font>");
            return;
        }

        out.print("<table border='2' align='center'>");
        out.print("<tr>");
        out.print("<td>用户编号</td>");
        out.print("<td>用户姓名</td>");
        out.print("<td>用户密码</td>");
        out.print("<td>用户性别</td>");
        out.print("<td>用户邮箱</td>");
        out.print("</tr>");
        for (Users user : users) {
            out.print("<tr>");
            out.print("<td>" + user.getUserId() + "</td>");
            out.print("<td>" + user.getUserName() + "</td>");
            out.print("<td>" + "******" + "</td>");
            out.print("<td>" + user.getSex() + "</td>");
            out.print("<td>" + user.getEmail() + "</td>");
            out.print("</tr>");
        }

    }
}
