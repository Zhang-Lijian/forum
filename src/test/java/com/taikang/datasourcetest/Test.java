package com.taikang.datasourcetest;

import java.sql.DriverManager;

public class Test {
    private static String url = "jdbc:mysql://localhost:3306/df?&useSSL=false&serverTimezone=GMT&characterEncoding=utf8";//数据库服务地址
    private static String driver = "com.mysql.cj.jdbc.Driver";//驱动路径
    private static String username = "root";
    private static String passworld = "1234";
    
    public static void main(String[] args) throws Exception {
        Class.forName(driver);

        //如果能连接成功，则打印连接
        System.out.println(DriverManager.getConnection(url, username, passworld));
        
    }
}