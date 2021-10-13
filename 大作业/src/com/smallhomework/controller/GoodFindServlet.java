package com.smallhomework.controller;

import com.smallhomework.dao.GoodsDao;
import com.smallhomework.untity.Goods;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GoodFindServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GoodsDao dao = new GoodsDao();
        PrintWriter out = null;
        List<Goods> goods = dao.findAll();
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        out.print("<table border='2' align='center'>");
        out.print("<tr>");
        out.print("<td>货物编号</td>");
        out.print("<td>货物长度(m)</td>");
        out.print("<td>货物宽度(m)</td>");
        out.print("<td>货物高度(m)</td>");
        out.print("<td>删除货物</td>");
        out.print("</tr>");
        for (Goods good : goods) {
            out.print("<tr>");
            out.print("<td>" + good.getGoodNum() + "</td>");
            out.print("<td>" + good.getLength() + "</td>");
            out.print("<td>" + good.getWidth() + "</td>");
            out.print("<td>" + good.getHeight() + "</td>");
            out.print("<td><a href='/myWeb/good/delete?goodNum=" + good.getGoodNum() + "'>删除货物</a></td>");
            out.print("</tr>");
        }
    }
}
