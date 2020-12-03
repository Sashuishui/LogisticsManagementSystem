package com.Wuye.dao;

import com.BigBigBigBigBigBigBigProject.data.FruitItem;
import com.BigBigBigBigBigBigBigProject.tools.JDBCTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class adminDao {
    // 获取数据库所有信息
    public ArrayList<account> queryAllData() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<account> list = new ArrayList<account>();
        connection = JDBCTools.getConnection();  // 建立链接
        statement = connection.createStatement();  // 封装sql语句
        String sql = "select * from fruit";  // 展示表数据
        resultSet = statement.executeQuery(sql);  // 接收数据到字符数据集
        return (ArrayList<account>) resultSet;
    }
}