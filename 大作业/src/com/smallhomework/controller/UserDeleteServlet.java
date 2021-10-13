package com.smallhomework.controller;

import com.smallhomework.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId;
        UserDao dao = new UserDao();
        int result = 0;
        PrintWriter out = null;
        //1. 读取【请求头】参数
        userId = request.getParameter("userId");
        //2. 调用Dao并发送delete指令到服务器
        result = dao.delete(userId);
        //3. 蒋处理结果以二进制形式写入到相应体
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red;font-size:40'>用户信息删除成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40'>用户信息删除失败</font>");
        }
    }
}
