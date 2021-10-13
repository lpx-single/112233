package com.smallhomework.controller;

import com.smallhomework.dao.GoodsDao;
import com.smallhomework.untity.Goods;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GoodAddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodNum;
        int length, width, height;
        int result = 0;
        GoodsDao dao = new GoodsDao();
        Goods good = null;
        PrintWriter out = null;
        goodNum = request.getParameter("goodNum");
        length = Integer.parseInt(request.getParameter("length"));
        width = Integer.parseInt(request.getParameter("width"));
        height = Integer.parseInt(request.getParameter("height"));
        good = new Goods(goodNum, length, width, height);
        result = dao.add(good);
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red;font-size:40'>货物信息注册成功</font>");
        } else {
            out.print("<font style='color:red;font-size:40'>货物信息注册失败</font>");
        }
    }
}
