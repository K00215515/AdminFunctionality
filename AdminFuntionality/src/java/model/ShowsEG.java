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
}
