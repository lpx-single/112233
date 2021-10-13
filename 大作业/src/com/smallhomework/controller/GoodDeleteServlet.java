package com.smallhomework.controller;

import com.smallhomework.dao.GoodsDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GoodDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodNum;
        GoodsDao dao = new GoodsDao();
        int result = 0;
        PrintWriter out = null;
        goodNum = request.getParameter("goodNum");

        result = dao.delete(goodNum);
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red;font-size:40'>货物信息删除成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40'>货物信息删除失败</font>");
        }
    }
}
