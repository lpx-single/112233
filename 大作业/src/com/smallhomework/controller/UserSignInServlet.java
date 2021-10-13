package com.smallhomework.controller;

import com.smallhomework.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserSignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName;
        String password;
        UserDao dao = new UserDao();
        int result = 0;
        PrintWriter out = null;
        userName = request.getParameter("userName");
        password = request.getParameter("password");
        result = dao.signIn(userName, password);
        System.out.println("YES");
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red;font-size:40'>登录成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40'>登录失败</font>");
        }

    }
}
