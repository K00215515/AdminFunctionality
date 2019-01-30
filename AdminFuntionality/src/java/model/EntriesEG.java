/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author K00215515 Evan Grimes 18/01/2019
 */
public class EntriesEG {
    private int entry_id;
    private String entry_title;
    private String entry_description;
    private String price;
    private int show_id;
    
    public EntriesEG(){
    }
    
    public EntriesEG(int entry_id, String entry_title, String entry_description, String price){
        this.entry_title = entry_title;
        this.entry_id = entry_id;
        this.entry_description = entry_description;
        this.price = price;
    }

    public EntriesEG(String entry_title, String entry_description, String price) {
        this.entry_title = entry_title;
        this.entry_description = entry_description;
        this.price = price;
        
    }

    public EntriesEG(String entry_title, String entry_description, String price, int show_id) {
        this.entry_title = entry_title;
        this.entry_id = entry_id;
        this.entry_description = entry_description;
        this.price = price;
        this.show_id = show_id;
    }

    public String getEntry_description() {
        return entry_description;
    }
    public String getEntry_title() {
        return entry_title;
    }

    public int getEntry_id() {
        return entry_id;
    }

    public String getPrice() {
        return price;
    }
    public int getShow_id() {
        return show_id;
    }
    

    public void setEntry_description(String entry_description) {
        this.entry_description = entry_description;
    }
    
    public void setEntry_title(String entry_title) {
        this.entry_title = entry_title;
    }

    public void setEntry_id(int entry_id) {
        this.entry_id = entry_id;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }
    
    public EntriesEG saveToDatabase(){
        Connection connection = DatabaseUtilityClass.getConnection();
        
        String sql = "INSERT INTO entries(entry_title, entry_description, price, show_id) VALUES(?,?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            ps.setString(1, this.getEntry_title());
            ps.setString(2, this.getEntry_description());
            ps.setString(3, this.getPrice());
            ps.setInt(4, this.getShow_id());
            ps.executeUpdate();
            System.out.println(ps.toString());
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                this.entry_id = rs.getInt(1);
            }
            
            connection.close();
        
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return this;   
    }
    
    public EntriesEG update() {
        Connection connection = DatabaseUtilityClass.getConnection();
        String sql = "UPDATE entries SET entry_title = ? AND entry_description = ? AND price = ? WHERE entry_id = ?;";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, this.getEntry_title());
            ps.setString(2, this.getEntry_description());
            ps.setString(3, this.getPrice());   
            ps.setInt(4, this.getEntry_id());
            
            ps.executeUpdate();
            System.out.println(ps.toString());
            connection.close();
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return this;
    }
    
    public EntriesEG getPieceDetails(int entry_id){
        EntriesEG e = null;
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        
        String query = "Select * from entries where entry_id = ?";
        
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, entry_id);
            System.out.println("DETAILED PIECE VIEW");
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                e = new EntriesEG();
                e.setEntry_id(resultSet.getInt("entry_id"));
                e.setEntry_title(resultSet.getString("entry_title"));
                e.setEntry_description(resultSet.getString("entry_description"));
                e.setPrice(resultSet.getString("price"));
                e.setShow_id(resultSet.getInt("show_id"));
                return e;
            }
            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return e;
    }
    
    public ArrayList<EntriesEG> piecesInShow(){
        ArrayList piecesInShow = new ArrayList<>();
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        String query = "Select * from entries ORDER BY entry_id";
        try{
            ps = connection.prepareStatement(query);
        }catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return piecesInShow;
    }
    
    
    
    public ArrayList<EntriesEG> getAllPieces() {
        ArrayList allpieces = new ArrayList<>();

        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from entries ORDER BY entry_id";

        try {

            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                EntriesEG e = new EntriesEG();
                e.setEntry_id(resultSet.getInt("entry_id"));
                e.setEntry_title(resultSet.getString("entry_title"));
                e.setEntry_description(resultSet.getString("entry_description"));
                e.setPrice(resultSet.getString("price"));
                e.setShow_id(resultSet.getInt("show_id"));
//                n.setUserId(resultSet.getInt("userId"));
                allpieces.add(e);
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return allpieces;
    }
    
    public boolean deletePiece(int entry_id){
        EntriesEG s = null;
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        
        String sql = "DELETE FROM entries WHERE entry_id = ?";
        
        try{
            ps = connection.prepareStatement(sql);
            ps.setInt(1, entry_id);
            
            int i = ps.executeUpdate();
            if(i == 0) return false;
            connection.close();
        
        }catch(SQLException ex){
            System.out.println(ex);
            return false;
        }
        return true;
    }

    public EntriesEG order() {
        Connection connection = DatabaseUtilityClass.getConnection();
        String sql = "SELECT * FROM entries ORDER BY entry_id DESC";
        return null;
    }
}