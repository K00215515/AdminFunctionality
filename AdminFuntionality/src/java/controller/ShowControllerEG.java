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
import model.AdminEG;
import model.ShowsEG;

/**
 *
 * @author K00215515 Evan Grimes 10/12/2018
 */
@WebServlet(name = "ShowControllerEG", urlPatterns = {"/ShowControllerEG"})
public class ShowControllerEG extends HttpServlet {

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
        AdminEG admin = (AdminEG) session.getAttribute("admin");
        if (admin == null) {
            admin = new AdminEG();
            session.setAttribute("admin", admin);
        }
        String menu = "home";
        ShowsEG shows = (ShowsEG) session.getAttribute("shows");
        if (shows == null) {
            shows = new ShowsEG();
            session.setAttribute("shows", shows);
        }
        menu = request.getParameter("menu");
        if (menu == null) {
            menu = "home";
        }
        
        switch(menu){
            case "Add Show":
                gotoPage("/AddShow.jsp", request, response); 
                break;
                
            case "List Shows":
//                ProcessSave(request, session);
                gotoPage("/AllShows.jsp", request, response); 
                break;
            case "SaveShow":
                ProcessSave(request, session);
                gotoPage("/Admin.jsp", request, response); 
                break;
            case "home":
                ShowsEG show = new ShowsEG();
                ArrayList<ShowsEG> allshows = new ArrayList<>();
                allshows = show.getAllShows();
                session.setAttribute("allshows", allshows);
                gotoPage("/AllShows.jsp", request, response);
                break; 
            case "deleteShow":
                String showid1 = request.getParameter("show_id");
                int shows_id = Integer.parseInt(showid1);
                ShowsEG shows1 = new ShowsEG();
                boolean worked = shows1.deleteShow(shows_id);
                
                ArrayList<ShowsEG> allshows1 = new ArrayList<>();
                allshows1 = shows1.getAllShows();
                session.setAttribute("allshows", allshows1);
                gotoPage("/Admin.jsp", request, response);
                break;
            case "updateShow":
                gotoPage("/DetailedShowView.jsp", request, response);
                break;
            case "Update":
                System.out.println("Updating");
                ProcessUpdate(request, session, shows);
                gotoPage("/Admin.jsp", request, response);  
                break;
            case "Delete":
                ProcessDelete(request, session, shows);
                gotoPage("/Admin.jsp", request, response);
                break;    
            case "All Shows":
                gotoPage("/AllShows.jsp", request, response);
                break;
            case "getShowView":
                String showid = request.getParameter("show_id");
                int show_id = Integer.parseInt(showid);
                ShowsEG n = new ShowsEG();
                n = n.getShowDetails(show_id);
                
//                if (n != null) {
                    
                    session.setAttribute("shows", n);
//                    AdminEG u = new AdminEG();
//                    System.out.println("get show details " + n.getUserid());
//                    u = u.getUserDetails(u.getUserid());
//                    if(u!=null) {
//                        System.out.println("shows" + u.getUsername());
//                        session.setAttribute("showUser ", u);
//                }
//                else{
//                    System.out.println("show details null");
//                }
                    
//                }
                gotoPage("/DetailedShowView.jsp", request, response);
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
        String show_title = request.getParameter("show_title");
        String show_description = request.getParameter("show_description");
        String show_image = request.getParameter("show_image");
//        AdminEG user = (AdminEG) session.getAttribute("users");
//        System.out.println("user_id: " + user.getUserid());
        ShowsEG shows = new ShowsEG(show_title, show_description, show_image);
        shows = shows.saveToDatabase();
        
        session.setAttribute("shows", shows);
        System.out.println("show_id" + shows.getShow_id());
    }  
    private void ProcessUpdate(HttpServletRequest request, HttpSession session, ShowsEG shows) {
        String show_title = request.getParameter("show_title");
        String show_description = request.getParameter("show_description");
        String show_image = request.getParameter("show_image");
        System.out.println("show_id: " + shows.getShow_id());
        ShowsEG s = new ShowsEG(show_title, show_description, show_image);
        s = s.updateShow();
        session.setAttribute("shows", shows);
        System.out.println("show_id:" + shows.getShow_id());
    }   
    private void ProcessDelete(HttpServletRequest request, HttpSession session, ShowsEG shows) {
        ShowsEG show = new ShowsEG();
        show.deleteShow(show.getShow_id());
        session.setAttribute("shows", show);
        System.out.println("show_id" + show.getShow_id());  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
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
