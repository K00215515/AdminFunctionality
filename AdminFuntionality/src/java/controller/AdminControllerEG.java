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

/**
 *
 * @author K00215515 Evan Grimes 10/12/2018
 */
@WebServlet(name = "AdminControllerEG", urlPatterns = {"/AdminControllerEG"})
public class AdminControllerEG extends HttpServlet {

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
        String menu = "home";
        HttpSession session = request.getSession();
        AdminEG admin = (AdminEG) session.getAttribute("admin");
        if (admin == null) {
            admin = new AdminEG();
            session.setAttribute("admin", admin);
        }
//        AdminEG admin = (AdminEG) session.getAttribute("admin");
//        if (admin == null) {
//            admin = new AdminEG();
//            session.setAttribute("admin", admin);
//        }

        menu = request.getParameter("menu");
        if (menu == null) {
            menu = "home";
        }
        
        switch(menu){
            case "LogIn":
                gotoPage("/Admin.jsp", request, response);
                break;
            case "SignUp":
                ProcessSave(request, session);
                gotoPage("/Home.jsp", request, response);
                break;
            case "logout":
                gotoPage("/Home.jsp", request, response);
                break;
            case "Manage Users":
                gotoPage("/ManageUsers.jsp", request, response);
                break;           
            case "Process Login":
                boolean validLogin = ProcessLogin(request, session);
                if (!validLogin) {
                    String message = "invalid logon details.. try again";
                    session.setAttribute("message", message);
                    gotoPage("/LogIn.jsp", request, response);
                } else {

                    gotoPage("/Home.jsp", request, response);
                }
                break;
            case "home":

                AdminEG users = new AdminEG();
                ArrayList<AdminEG> allusers = new ArrayList<>();
                allusers = users.getAllUsers();
                session.setAttribute("allusers", allusers);
                gotoPage("/Admin.jsp", request, response);
                break;
            case "getUsersView":
                String suserid = request.getParameter("user_id");
                int userid = Integer.parseInt(suserid);
                AdminEG n = new AdminEG();
                n = n.getUserDetails(userid);
                
                if (n != null) {
                    
                    session.setAttribute("admin", n);
                    AdminEG u = new AdminEG();
                    System.out.println("get user details " + n.getUserid());
                    u = u.getUserDetails(n.getUserid());
                    if(u!=null) {
                        System.out.println("admin" + u.getUsername());
                        session.setAttribute("admin", u);
                    }
                    else{
                        System.out.println("user details null");
                    }
                }
                gotoPage("/ManageUsers.jsp", request, response);
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
    private boolean ProcessLogin(HttpServletRequest request, HttpSession session) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        AdminEG admin = new AdminEG(username, password);
        admin.Login(username, password);
        session.setAttribute("users", admin);
       
        if (admin.getUserid()!=0) {
            return true;
        } else {
            return false;
        }
    }
    private void ProcessSave(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String F_name = request.getParameter("F_name");
        String L_name = request.getParameter("L_name");
        
        AdminEG admin = new AdminEG(username, password, email, F_name, L_name);
        admin = admin.saveToDatabase();

        session.setAttribute("users", admin);
        System.out.println("user_id" + admin.getUserid());
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

//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
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
