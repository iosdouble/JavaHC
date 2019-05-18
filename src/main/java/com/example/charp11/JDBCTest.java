package com.example.charp11;

import java.sql.*;

/**
 * @ClassName JDBCTest
 * @Author nihui
 * @Date 2019/5/18 16:59
 * @Version 1.0
 * @Description TODO
 */
public class JDBCTest {
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("null","null","null");
            preparedStatement.execute("SELECT * FROM student");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+resultSet.getInt(2));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
