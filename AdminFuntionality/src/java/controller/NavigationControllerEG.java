/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import model.AdminEG;
//import model.ShowsEG;

/**
 *
 * @author K00215515 Evan Grimes 16/01/2019
 */
@WebServlet(name = "NavigationControllerEG", urlPatterns = {"/NavigationControllerEG"})
public class NavigationControllerEG extends HttpServlet {

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
//            AdminEG admin = (AdminEG) session.getAttribute("admin");
//            if (admin == null) {
//                admin = new AdminEG();
//                session.setAttribute("admin", admin);
//            }
            String menu = "home";
//            ShowsEG shows = (ShowsEG) session.getAttribute("shows");
//            if (shows == null) {
//                shows = new ShowsEG();
//                session.setAttribute("shows", shows);
//            }
            menu = request.getParameter("menu");
            if (menu == null) {
                menu = "home";
            }
            
            switch(menu){
                case "home":
                    gotoPage("/Home.jsp", request, response);
                    break;
                case "gallery":
                    gotoPage("/Gallery.jsp", request, response);
                    break;
                case "shows":
                    gotoPage("/Shows.jsp", request, response);
                    break;
                case "admin":
                    gotoPage("/Admin.jsp", request, response);
                    break;
                case "profile":
                    gotoPage("/Profile.jsp", request, response);
                    break;
                case "logout":
                    gotoPage("/LogIn.jsp", request, response);
                    break;
                case "signUp":
                    gotoPage("/SignUp.jsp", request, response);
                    break;
                case "logIn":
                    gotoPage("/LogIn.jsp", request, response);
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
//    }

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

//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
