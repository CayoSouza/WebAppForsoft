/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.controller;

import br.com.projetodigimon.dao.DaoPesagem;
import br.com.projetodigimon.model.Pesagem;
import br.com.projetodigimon.model.PostoPesagem;
import br.com.projetodigimon.model.Veiculo;
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
 * @author erico_000
 */
@WebServlet(name = "ServletUI024", urlPatterns = {"/web/ServletUI024"})
public class ServletUI024 extends HttpServlet {

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
        
        Pesagem pesa = new Pesagem();
        PostoPesagem pospe = new PostoPesagem();
        Veiculo veic = new Veiculo();
        
        
        //pesa.setIdPesagem(Integer.parseInt(request.getParameter("idPesagem")));
       // pesa.getPostoPesagem().setIdPosto(Integer.parseInt(request.getParameter("idPostoPesagem")));
        //pesa.getVeiculo().setPlaca(request.getParameter("placa"));
        veic.setPlaca(request.getParameter("placa"));
        pesa.setPbt(Float.parseFloat(request.getParameter("pbt")));
        pesa.setPesoEixo(Float.parseFloat(request.getParameter("pesoEixo")));
        pesa.setPesoEixo(Float.parseFloat(request.getParameter("pesoEixo2")));
        //pesa.setDataHora(request.getParameter("dataHora"));
        //pesa.setTransbordo(request.getParameter("transbordo"));
        //pesa.setRemanejamento(request.getParameter("remanejamento"));
            
        DaoPesagem dp = new DaoPesagem();
        
        try {
            System.out.println("entrou no try");
            dp.inserir(pesa);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletUI024.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        out.println("idPesagem: "+ pesa.getIdPesagem() +"<br>");
        out.println("idPostoPesagem: "+ pesa.getPostoPesagem()+"<br>");
        out.println("idVeiculo: "+ pesa.getVeiculo()+"<br>");
        out.println("pbt: "+ pesa.getPbt()+"<br>");
        out.println("pesoEixo: "+ pesa.getPesoEixo()+"<br>");
        out.println("dataHora: "+ pesa.getDataHora()+"<br>");
        out.println("Transbordo: "+ pesa.getTransbordo()+"<br>");
        out.println("idRemanejamento: "+ pesa.getRemanejamento()+"<br>");
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
