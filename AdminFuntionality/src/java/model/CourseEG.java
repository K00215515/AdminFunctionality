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
 * @author K00215515 Evan Grimes 10/12/2018
 */
public class CourseEG {
    private int course_id;
    private String course_name;
    private String course_Description;
    private int userid;
    
    public CourseEG(){
    }
    
    public CourseEG(String course_name, String course_Description){
        this.course_name = course_name;
        this.course_Description = course_Description;
    }
    
    public CourseEG(int course_id, String course_name, String course_Description){
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_Description = course_Description;
    }

    public CourseEG(String course_name, String course_Description, int userid) {
        
        this.course_name = course_name;
        this.course_Description = course_Description;
        this.userid = userid;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_Description() {
        return course_Description;
    }

    public void setCourse_Description(String course_Description) {
        this.course_Description = course_Description;
    }

    public CourseEG saveToDatabase() {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO courses (course_name,course_description,user_id) VALUES (?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            ps.setString(1, this.getCourse_name());
            ps.setString(2, this.getCourse_Description());
            ps.setInt(4, this.getUserid());

            ps.executeUpdate();
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                this.course_id = rs.getInt(1);
            }
               
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    private int getUserid() {
        return userid;
    }
    
    
    
}
