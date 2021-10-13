package com.smallhomework.controller;

import com.smallhomework.dao.UserDao;
import com.smallhomework.untity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName, password, sex, email;
        UserDao dao = new UserDao();
        Users user = null;
        int result = 0;
        PrintWriter out = null;
        //1. 调用请求对象读参，读取【请求头】的用户注册信息
        userName = request.getParameter("userName");
        password = request.getParameter("password");
        sex = request.getParameter("sex");
        email = request.getParameter("email");

        //2. 调用【UserDao】，将用户信息填充到INSERT命令并借助JDBC规范发送到数据库服务器
        user = new Users(null, userName, password, sex, email);
        result = dao.add(user);

        //3. 【调用响应对象】将【处理结果】以二进制形式写入到相应体中
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red;font-size:40'>用户信息注册成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40'>用户信息注册失败</font>");
        }

        //4. 浏览器根据响应头content-type制定编译器对相应体二进制内容编辑

    }

}
