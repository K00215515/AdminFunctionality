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
        AdminEG users = (AdminEG) session.getAttribute("users");
        if (users == null) {
            users = new AdminEG();
            session.setAttribute("users", users);
        }

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
//                    AdminEG a = new AdminEG();
//                    boolean admin = false;
//                    admin = UserLocalServiceUtil.hasRoleUser(admin, a.getUser_id());
//                    if(admin){
//                        gotoPage("/Admin.jsp", request, response);
//                    }
//                    else{
//                        gotoPage("/Home.jsp", request, response);
//                    }
//                    String account_type = request.getParameter("account_type");
//                    if(account_type = "admin")
                    session.setAttribute("message", message);
                    gotoPage("/LogIn.jsp", request, response);
                } else {

                    gotoPage("/Home.jsp", request, response);
                }
                break;
            case "home":
                AdminEG user = new AdminEG();
                ArrayList<AdminEG> allusers = new ArrayList<>();
                allusers = user.getAllUsers();
                session.setAttribute("allusers", allusers);
                gotoPage("/ManageUsers.jsp", request, response);
                break;
            
            case "deleteUser":
                String user1 = request.getParameter("user_id");
                int users_id = Integer.parseInt(user1);
                AdminEG users1 = new AdminEG();
                boolean worked = users1.deleteUser(users_id);
                
                ArrayList<AdminEG> allusers1 = new ArrayList<>();
                allusers1 = users1.getAllUsers();
                session.setAttribute("allusers", allusers1);
                gotoPage("/Admin.jsp", request, response);
                break;
            case "updateUser":
                gotoPage("/DetailedUserView.jsp", request, response);
                break;
            case "Update":
                System.out.println("Updating");
                ProcessUpdate(request, session, users);
                gotoPage("/Admin.jsp", request, response);  
                break;
            case "Delete":
                ProcessDelete(request, session, users);
                gotoPage("/Admin.jsp", request, response);
                break;
            
            case "getUserView":
                String userid = request.getParameter("user_id");
                int user_id;
                user_id = Integer.parseInt(userid);
                AdminEG n = new AdminEG();
                n = n.getUserDetails(user_id);
                
                if (n != null) {
                    
                    session.setAttribute("users", n);
                    AdminEG u = new AdminEG();
                    System.out.println("get user details " + n.getUser_id());
                    u = u.getUserDetails(n.getUser_id());
                    if(u!=null) {
                        System.out.println("users" + u.getUsername());
                        session.setAttribute("users", u);
                    }
                    else{
                        System.out.println("user details null");
                    }
                }
                gotoPage("/DetailedUserView.jsp", request, response);
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
        String account_type = request.getParameter("account_type");
        AdminEG admin = new AdminEG(username, password, account_type); //account_type
        admin.Login(username, password, account_type);
        session.setAttribute("users", admin);
       
        if (admin.getUser_id()!=0) {
            return true;
        } else {
            return false;
        }
    }
    private void ProcessSave(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String f_name = request.getParameter("F_name");
        String L_name = request.getParameter("L_name");
        String account_type = request.getParameter("account_type");
        
        AdminEG admin = new AdminEG(username, password, email, f_name, L_name, account_type);
        admin = admin.saveToDatabase();

        session.setAttribute("users", admin);
        System.out.println("user_id" + admin.getUser_id());
    }
    private void ProcessUpdate(HttpServletRequest request, HttpSession session, AdminEG users) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String f_name = request.getParameter("F_name");
        String L_name = request.getParameter("L_name");
        String account_type = request.getParameter("account_type");
        
        System.out.println("user_id: " + users.getUser_id());
        AdminEG u = new AdminEG(users.getUser_id(), username, password, email, f_name, L_name, account_type);
        
        u = u.updateUser();
        session.setAttribute("users", users);
        System.out.println("user_id: " + users.getUser_id());
        
    }
    private void ProcessDelete(HttpServletRequest request, HttpSession session, AdminEG users) {
        AdminEG user = new AdminEG();
        user.deleteUser(user.getUser_id());
        session.setAttribute("users", user);
        System.out.println("user_id: " + user.getUser_id());
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

//    private static class UserLocalServiceUtil {
//
//        private static boolean hasRoleUser(boolean admin, int user_id, HttpServletRequest request,
//            HttpServletResponse response) throws ServletException, IOException {
//            if(admin){
//                
//                    gotoPage("/Admin.jsp", request, response);
//                }
//                else{
//                    gotoPage("/Home.jsp", request, response);
//                }
//            return false;
//        }
//
//        public UserLocalServiceUtil() {
//        }
//    }

    
}
