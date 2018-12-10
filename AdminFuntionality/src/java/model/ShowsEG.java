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

/**
 *
 * @author K00215515
 */
public class ShowsEG {
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

    public String getshow_title() {
        return show_title;
    }

    public void setShow_title(String show_title) {
        this.show_title = show_title;
    }

    public String getShow_description() {
        return show_description;
    }

    public void setCourse_Description(String show_description) {
        this.show_description = show_description;
    }
    public String getShow_image() {
        return show_image;
    }

    public void setShow_image(String show_image) {
        this.show_image = show_image;
    }

    public ShowsEG saveToDatabase() {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO Shows (show_title,show_description,show_image) VALUES (?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            ps.setString(1, this.getshow_title());
            ps.setString(2, this.getShow_description());
            ps.setString(2, this.getShow_image());

            ps.executeUpdate();
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
