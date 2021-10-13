/**
 * Stu表的Dao类，理论上实现应安装jdbc包，但不安装也可，只需保证sql语句在本地测试可以得出正确结果
 * 在今后开发过程中，每对Stu表有新的操作，就建立一个对应的方法。例如第一个模块为登录模块，该操作必须需要对
 * 借助JdbcUtil中的方法，将对应的sql语言发送到mysql服务器，取回数据或结果，返回。
 * 改类的开发主要有后端程序员负责
 * 每一张表对应一张实体类
 * 下面给出小作业其中一个人员添加功能，可供参考，其用到的util.xxx的方法均来自JdbcUtil类中：
 *  public int add(Users user) {
 *         System.out.println(user.getUserName());
 *         //改类的核心，实现改类功能的sql语句
 *         String sql = "insert into Users (userName, password, sex, email) values(?, ?, ?, ?)";
 *         PreparedStatement ps = util.createStatement(sql);
 *         int result = 0;
 *         try {
 *             ps.setString(1, user.getUserName());
 *             ps.setString(2, user.getPassword());
 *             ps.setString(3, user.getSex());
 *             ps.setString(4, user.getEmail());
 *             result = ps.executeUpdate();
 *         } catch (SQLException throwables) {
 *             throwables.printStackTrace();
 *         } finally {
 *             util.close();
 *         }
 *         return result;
 *     }
 */
package com.big_homework.dao;

public class StuDao {
    //用户注册
    public boolean register(String userId, String userPassword) {
        //code
        return false;
    }

    //......
}
