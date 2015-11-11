/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.controller;

import br.com.projetodigimon.dao.DaoAcesso;
import br.com.projetodigimon.model.Acesso;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
        PrintWriter out = response.getWriter();
        Acesso a = new Acesso();
        DaoAcesso daoA = new DaoAcesso();
        
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        a.setUsuario(usuario);

        boolean existe = daoA.existe(a);
        
        out.println("EOQQQQQ");
        out.println(existe);

        if (existe) {
            out.println("Usuario " + a.getUsuario() + " Existe!");
        } else {
            out.println("Usuario " + a.getUsuario() + " Não Existe!");
        }

        /*if(usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("123")){
         Acesso acesso = new Acesso();
         acesso.setUsuario(usuario);
         acesso.setSenha(senha);
         acesso.setTipoUsuario("4");
         acesso.setIdAcesso(1);
            
         String userId = String.valueOf(acesso.getIdAcesso());
         Cookie cookie = new Cookie("userId", userId);
         cookie.setMaxAge(7 * 60);
         response.addCookie(cookie);
            
         HttpSession session = request.getSession();
         session.setAttribute("user", acesso);
            
         response.sendRedirect("home");
         }*/
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
