package br.com.projetodigimon.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.projetodigimon.dao.DaoBalanca;
import br.com.projetodigimon.model.Balanca;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Patrick
 */
@WebServlet(name = "ServletUI016", urlPatterns = {"/web/ServletUI016"})
public class ServletUI016 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Balanca balanca = new Balanca();
        balanca.setNumSerie(Integer.parseInt(request.getParameter("numSerie")));
        String fabricante = request.getParameter("fabricante");
        String modelo = request.getParameter("modelo");

        //balanca.setNumSerie(numSerie);
        balanca.setFabricante(fabricante);
        balanca.setModelo(modelo);

        DaoBalanca db = new DaoBalanca();
        
        try {
            System.out.println("entrou no try");
            db.inserir(balanca);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletUI016.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            out.println("Número de Série: " + balanca.getNumSerie() + "<br>");
            out.println("Fabricante: " + balanca.getFabricante() + "<br>");
            out.println("Modelo: " + balanca.getModelo() + "<br>");

    
    
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
