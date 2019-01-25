/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EntriesEG;

/**
 *
 * @author evang
 */
@WebServlet(name = "EntryControllerEG", urlPatterns = {"/EntryControllerEG"})
public class EntryControllerEG extends HttpServlet {

//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        HttpSession session = request.getSession();
//        AdminEG admin = (AdminEG) session.getAttribute("admin");
//        if (admin == null) {
//            admin = new AdminEG();
//            session.setAttribute("admin", admin);
//        }
        String menu = "home";
        EntriesEG pieces = (EntriesEG) session.getAttribute("pieces");
        if (pieces == null) {
            pieces = new EntriesEG();
            session.setAttribute("pieces", pieces);
        }
        menu = request.getParameter("menu");
        if (menu == null) {
            menu = "home";
        }
        
        switch(menu){
            case "Manage Pieces":
                System.out.println("manage pieces");
                gotoPage("/ManagePieces.jsp", request, response); 
                break;
            case "Add Piece":
                gotoPage("/AddPiece.jsp", request, response); 
                break;
            case "Order Piece":
                ProcessOrder(request, session);
                gotoPage("/ManagePieces.jsp", request, response); 
                break; 
            case "Save Piece":
               ProcessSave(request, session);
               gotoPage("/Admin.jsp", request, response);
               break;
            case "Update":
                System.out.println("Updating");
                ProcessUpdate(request, session, pieces);
                gotoPage("/Admin.jsp", request, response);
                break;
            case "Delete":
                ProcessDelete(request, session, pieces);
                gotoPage("/Admin.jsp", request, response);
                break;
            case "home":
                EntriesEG e2 = new EntriesEG();
                ArrayList<EntriesEG> allpieces = new ArrayList<>();
                allpieces = e2.getAllPieces();
                session.setAttribute("allpieces",allpieces);
                gotoPage("/ManagePieces.jsp", request, response);
                break;
            case "deletePiece":
                String entryid1 = request.getParameter("show_id");
                int entry_id1 = Integer.parseInt(entryid1);
                EntriesEG e1 = new EntriesEG();
                boolean worked = e1.deletePiece(entry_id1);
                
                ArrayList<EntriesEG> allpieces2 = new ArrayList<>();
                allpieces2 = e1.getAllPieces();
                session.setAttribute("allpieces", allpieces2);
                gotoPage("/Admin.jsp", request, response);
                break;
            case "List Pieces":
//                ProcessSave(request, session);
                gotoPage("/ManagePieces.jsp", request, response); 
                break;
            case "All Pieces":
                gotoPage("/AllPieces.jsp", request, response); 
                break;
                
                
            case "getPieceView":
                String entryid = request.getParameter("entry_id");
                int entry_id;
                entry_id = Integer.parseInt(entryid);
                EntriesEG e = new EntriesEG();
                e = e.getPieceDetails(entry_id);
                
                if(e != null){
                    session.setAttribute("pieces", e);
//                    EntriesEG en = new EntriesEG();
//                    System.out.println("get piece details " + e.getEntry_id());
//                    if(en != null){
//                        System.out.println("pieces" + en.getEntry_description());
//                        session.setAttribute("pieces", en);
//                    }else{
//                        System.out.println("piece details null");
//                    }
                }
                gotoPage("/DetailedPieceView.jsp", request, response);
                break;    
            default:
                gotoPage("/invalid.jsp", request, response);
                break;
        }
    }
    private void gotoPage(String url,
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    private void ProcessSave(HttpServletRequest request, HttpSession session) {
        String entry_title = request.getParameter("entry_title");
        String entry_description = request.getParameter("entry_description");
        String price = request.getParameter("price");
//        Double price = Double.parseDouble(prices);
//        String price = request.getParameter("price");
//        AdminEG user = (AdminEG) session.getAttribute("users");
//        System.out.println("user_id: " + user.getUserid());
        EntriesEG entry = new EntriesEG(entry_title, entry_description, price);
        entry = entry.saveToDatabase();
        
        session.setAttribute("entries", entry);
        System.out.println("entry_id" + entry.getEntry_id());
    } 
    private void ProcessUpdate(HttpServletRequest request, HttpSession session, EntriesEG pieces) {
        String entry_title = request.getParameter("entry_title");
        String entry_description = request.getParameter("entry_description");
        String price = request.getParameter("price");
//        Double price = Double.parseDouble(prices);
        
        System.out.println("entry_id: " + pieces.getEntry_id());
        EntriesEG e = new EntriesEG(pieces.getEntry_id(), entry_title,entry_description, price);
        
        e = e.update();
        session.setAttribute("pieces", pieces);
        System.out.println("entry_id");
    }

    private void ProcessDelete(HttpServletRequest request, HttpSession session, EntriesEG pieces) {
        EntriesEG piece = new EntriesEG();
        piece.deletePiece(pieces.getEntry_id());
        session.setAttribute("pieces", piece);
        System.out.println("entry_id" + piece.getEntry_id());  
    }
    private void ProcessOrder(HttpServletRequest request, HttpSession session) {
        EntriesEG e = new EntriesEG();
        e = e.order();
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

    

}
