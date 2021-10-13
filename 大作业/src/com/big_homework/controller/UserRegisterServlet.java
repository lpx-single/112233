/**
 * 这块偏前端，我可能说的不清楚，只是偏重流程，写前端的同学最好看一下，使得自己写的html5等代码符合要求
 * 该类为动态文件，接受dao类的操作结果，并依据结果将需要需要反馈的信息以html5等语言反馈到网页上
 * 下面以小作业的例子为例：
 *  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 *         String userName;
 *         String password;
 *         UserDao dao = new UserDao();
 *         int result = 0;
 *         PrintWriter out = null;
 *         //读出网页以get方式传递的信息
 *         userName = request.getParameter("userName");
 *         password = request.getParameter("password");
 *         //调用dao中的对应操作，并得到返回结果
 *         result = dao.signIn(userName, password);
 *         System.out.println("YES");
 *         response.setContentType("text/html;charset=utf-8");
 *         out = response.getWriter();
 *         //依据反馈结果，分情况展示页面
 *         if (result == 1) {
 *             out.print("<font style='color:red;font-size:40'>登录成功</font>");
 *         } else {
 *             out.print("<font style='color:red;font-size:40'>登录失败</font>");
 *         }
 *
 *     }
 */
package com.big_homework.controller;

public class UserRegisterServlet {
}
