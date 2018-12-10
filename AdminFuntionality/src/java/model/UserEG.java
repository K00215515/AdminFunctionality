/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.registry.infomodel.User;

/**
 *
 * @author K00215515 Evan Grimes
 */
public class UserEG {
    private int userid;
    private String username;
    private String password;
    private String email;
    private String F_name;
    private String L_name;
    
    public UserEG() {
    }
    public UserEG(String username, String password, String email, String F_name, String L_name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.F_name = F_name;
        this.L_name = L_name;
    }
    public UserEG(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public UserEG(int userid, String username, String password, String email, String F_name, String L_name) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.F_name = F_name;
        this.L_name = L_name;
    }
    public UserEG(int userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public String getF_name() {
        return F_name;
    }

    public String getL_name() {
        return L_name;
    }

    public String getPassword() {
        return password;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setF_name(String F_name) {
        this.F_name = F_name;
    }

    public void setL_name(String L_name) {
        this.L_name = L_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public UserEG getUserDetails(int userId) {
        UserEG u = null; 
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        
        String query = "SELECT * FROM Users WHERE user_id = ?;";
        
        try{
            ps = connection.prepareStatement(query);
            ps.setString(1, this.getUsername());
            ps.setString(2, this.getPassword());
            ps.setString(3, this.getEmail());
            ps.setString(4, this.getF_name());
            ps.setString(5, this.getL_name());
            ps.setInt(6, this.getUserid());
            
            
            while (resultSet.next()) {
                this.userid = resultSet.getInt("user_id");
                this.username = resultSet.getString("username");
                this.password = resultSet.getString("password");
                this.email = resultSet.getString("email");
                this.F_name = resultSet.getString("F_name");
                this.L_name = resultSet.getString("L_name");
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
}
