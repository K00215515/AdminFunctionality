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
    private String course_description;
    private int userid;
    
    public CourseEG(){
    }
    
    public CourseEG(String course_name, String course_description){
        this.course_name = course_name;
        this.course_description = course_description;
    }
    
    public CourseEG(int course_id, String course_name, String course_description){
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_description = course_description;
    }

    public CourseEG(String course_name, String course_description, int userid) {
        
        this.course_name = course_name;
        this.course_description = course_description;
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

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }
    private int getUserid() {
        return userid;
    }
    private void setUserid(int userid) {
        this.userid = userid;
    }

    public CourseEG saveToDatabase() {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO courses (course_name,course_description,user_id) VALUES (?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            ps.setString(1, this.getCourse_name());
            ps.setString(2, this.getCourse_description());
            ps.setInt(3, this.getUserid());

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
}
