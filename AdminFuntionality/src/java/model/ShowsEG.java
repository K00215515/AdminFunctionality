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
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author K00215515 Evan Grimes 10/12/2018
 */
public class ShowsEG implements Serializable{
    private int show_id;
    private String show_title;
    private String show_description;
    private String show_image;
    private int userid;
    
    public ShowsEG(){
    }
    
    public ShowsEG(String show_title, String show_description, String show_image){
        this.show_title = show_title;
        this.show_description = show_description;
        this.show_image = show_image;
    }
    
    public ShowsEG(int show_id, String show_title, String show_description, String show_image){
        this.show_id = show_id;
        this.show_title = show_title;
        this.show_description = show_description;
        this.show_image = show_image;
    }

    public ShowsEG(String show_title, String show_description, String show_image, int userid) {
        this.show_id = show_id;
        this.show_title = show_title;
        this.show_description = show_description;
        this.show_image = show_image;
        this.userid = userid;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getShow_title() {
        return show_title;
    }

    public void setShow_title(String show_title) {
        this.show_title = show_title;
    }

    public String getShow_description() {
        return show_description;
    }

    public void setShow_description(String show_description) {
        this.show_description = show_description;
    }
    public String getShow_image() {
        return show_image;   
    }

    public void setShow_image(String show_image) {
        this.show_image = show_image;
    }
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public ShowsEG saveToDatabase() {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO shows(show_title,show_description,show_image) VALUES (?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            ps.setString(1, this.getShow_title());
            ps.setString(2, this.getShow_description());
            ps.setString(3, this.getShow_image());
//            ps.setInt(4, this.getUserid());
            
            ps.executeUpdate();
            System.out.println(ps.toString());
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                this.show_id = rs.getInt(1);
            }
               
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    public ShowsEG getShowDetails(int show_id) {
        ShowsEG n = null;
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from Shows where show_id = ?";

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, show_id);
            
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                n = new ShowsEG();
                n.setShow_id(resultSet.getInt("show_id"));
                n.setShow_title(resultSet.getString("show_title"));
                n.setShow_description(resultSet.getString("show_description"));
                n.setShow_image(resultSet.getString("show_image"));
//                n.setUserId(resultSet.getInt("UserId"));
                return n;
            }

            connection.close();
            

        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        

        return n;
    }

    public ArrayList<ShowsEG> getAllShows() {
        ArrayList allshows = new ArrayList<>();

        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from Shows";

        try {

            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                ShowsEG n = new ShowsEG();
                n.setShow_id(resultSet.getInt("show_id"));
                n.setShow_title(resultSet.getString("show_title"));
                n.setShow_description(resultSet.getString("show_description"));
                n.setShow_image(resultSet.getString("show_image"));
                
                
//                n.setUserId(resultSet.getInt("userId"));
                allshows.add(n);
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return allshows;
    }

    public ShowsEG updateShow() {
        Connection connection = DatabaseUtilityClass.getConnection();
        String sql = "UPDATE shows SET show_title = ?, show_description = ?, show_image = ? WHERE show_id = ?;";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
          
            ps.setString(1, this.getShow_title());
            ps.setString(2, this.getShow_description());
            ps.setString(3, this.getShow_image());
            ps.setInt(4, this.getShow_id());
            
            ps.executeUpdate();
            System.out.println(ps.toString());
            connection.close();
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return this;
    }
    public boolean deleteShow(int show_id){
        ShowsEG s = null;
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        
        String sql = "DELETE FROM shows WHERE show_id = ?";
        
        try{
            ps = connection.prepareStatement(sql);
            ps.setInt(1, show_id);
            
            int i = ps.executeUpdate();
            if(i == 0) return false;
            connection.close();
        
        }catch(SQLException ex){
            System.out.println(ex);
            return false;
        }
        return true;
    }
}
