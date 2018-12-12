/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author K00215515 Evan Grimes 10/12/2018
 */
public class AdminEG implements Serializable{
    private int userid;
    private String username;
    private String password;
    private String email;
    private String F_name;
    private String L_name;
    
    
    public AdminEG(){
    }
    
    public AdminEG(String username, String password, String email, String F_name, String L_name){
        this.username = username;
        this.password = password;
        this.email = email;
        this.F_name = F_name;
        this.L_name = L_name;
    }
    public AdminEG(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public AdminEG(int userid, String username, String password, String email, String F_name, String L_name) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.F_name = F_name;
        this.L_name = L_name;
    }
    
    public AdminEG(int userid){
        this.userid = userid;
    }
    
    public int getUserid() {
        return userid;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
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
    
    public void setUserid(int userid) {
        this.userid = userid;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
    
    public AdminEG Login(String username, String password) {
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        String query = "Select * from Users where username = ? AND password = ?";
        
        try{
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                this.userid = resultSet.getInt("user_id");
                this.username = resultSet.getString("username");
                this.password = resultSet.getString("password");
                this.email = resultSet.getString("email");
                this.F_name = resultSet.getString("F_name");
                this.L_name = resultSet.getString("L_name");
            }
            
            connection.close();
            
        }catch(SQLException ex){
            System.out.println(ex);
            return null;
        }
        return this;
    }

    public AdminEG saveToDatabase() {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO users (username,password, email, F_name, L_name) VALUES (?,?,?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            ps.setString(1, this.getUsername());
            ps.setString(2, this.getPassword());
            ps.setString(3, this.getEmail());
            ps.setString(4, this.getF_name());
            ps.setString(5, this.getL_name());
//            ps.setInt(4, this.getUserid());
            

            ps.executeUpdate();
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                this.userid = rs.getInt(1);
            }
               
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }
    public AdminEG getUserDetails(int userId) {
         AdminEG u = null; 
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        
        String query = "SELECT * FROM users WHERE user_id = ?;";
        
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
    public ArrayList<AdminEG> getAllUsers() {

        ArrayList allusers = new ArrayList<>();

        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from users";

        try {

            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                AdminEG u = new AdminEG();
                u.setUserid(resultSet.getInt("user_id"));
                u.setUsername(resultSet.getString("username"));
                u.setPassword(resultSet.getString("password"));
                u.setEmail(resultSet.getString("email"));
                u.setF_name(resultSet.getString("F_name"));
                u.setL_name(resultSet.getString("L_name"));
                allusers.add(u);
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return allusers;
    }
}
