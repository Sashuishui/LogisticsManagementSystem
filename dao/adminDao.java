package com.Wuye.dao;

import com.BigBigBigBigBigBigBigProject.data.FruitItem;
import com.BigBigBigBigBigBigBigProject.tools.JDBCTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class adminDao {
    // ��ȡ���ݿ�������Ϣ
    public ArrayList<account> queryAllData() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<account> list = new ArrayList<account>();
        connection = JDBCTools.getConnection();  // ��������
        statement = connection.createStatement();  // ��װsql���
        String sql = "select * from fruit";  // չʾ������
        resultSet = statement.executeQuery(sql);  // �������ݵ��ַ����ݼ�
        return (ArrayList<account>) resultSet;
    }
}