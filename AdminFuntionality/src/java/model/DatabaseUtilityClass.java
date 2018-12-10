/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author K00215515 Evan Grimes 10/12/2018
 */
public class DatabaseUtilityClass {
    public static Connection getConnection() {

        try {

            String host = "localhost";
            String dbName = "gallerydatabase";
            int port = 3306;

            String mySqlUrl = "jdbc:mysql://" + host + ":" + port + "/" + dbName;

            Properties userInfo = new Properties();
            userInfo.put("user", "root");
            userInfo.put("password", "");

            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(mySqlUrl, userInfo);
            return connection;
        } catch (Exception ex) {
            System.out.println("error on db connection" + ex.getMessage());
        }
        return null;
    }
}
