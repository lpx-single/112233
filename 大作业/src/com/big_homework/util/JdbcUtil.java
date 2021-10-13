/**
 * 该类将jdbc类的访问必须创建和销毁的对象封装成对应的方法，方便后续开发
 * 这里仅给出方法名，以及每个方法对应的用处，具体实现因为已经写好，不予展示，只要会调用方法即可,该方法的调用出现在dao类中
 */

/**
 *  将JDBC规范下相关对象【创建】与【销毁】功能封装到方法
 *  一. JDBC开发步骤
 *      1. 注册数据库服务器提供的Driver接口实现类
 *      2. 创建一个连接通道交给Connection接口的实例对象【JDBC4Connection】管理
 *      3. 创建一个交通工具交给PrepareStatement接口的实例对象【JDBC4PreparedStatement】管理
 *      4. 由交通工具在Java工程与数据库服务器之间进行传输，推送SQL命令并带回执行结果
 *      5. 在交易结束后，销毁相关资源，销毁相关资源【Connection, PreparedStatement, ResultSet】
 */

package com.big_homework.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
    private Connection con = null;
    private PreparedStatement ps = null;

    //静态语句块static{}，在当前类文件第一次加载到JVM时，JVM会自动调用当前类文件静态语句块，且只会执行一次
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Driver接口实现类被注册了！");
    }

    //封装Connection对象创建细节
    public Connection createCon() {

    }

    public PreparedStatement createStatement(String sql) {

    }

    //封装PreparedStatement对象和Connection对象销毁细节
    public void close() {

    }

    //封装PreparedStatement对象和Connection对象和ResultSet对象销毁细节
    public void close(ResultSet rs) {

    }
}
