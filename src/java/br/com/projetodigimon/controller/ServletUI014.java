/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.controller;

import br.com.projetodigimon.dao.DaoRodovia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.projetodigimon.model.Rodovia;
import br.com.projetodigimon.model.Validacao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luiz
 */
@WebServlet(name = "ServletUI014", urlPatterns = {"/web/ServletUI014"})
public class ServletUI014 extends HttpServlet {

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

        Validacao valid = new Validacao();
        Rodovia rodovia = new Rodovia();

        String nome = request.getParameter("nome");
        String extensaoKm = request.getParameter("extensaoKm");
        String ufInicial = request.getParameter("ufInicial");
        String cidadeInicial = request.getParameter("cidadeInicial");
        String ufFinal = request.getParameter("ufFinal");
        String cidadeFinal = request.getParameter("cidadeFinal");

        boolean existeErro = false;
        
        String reportErro;
        reportErro = "<p><s>!</s></p><br>";
        if (!valid.ApNumeros(extensaoKm)){
            reportErro+= "<p>Campo extenção não pode conter leras</p><br>";
            existeErro = true;
        }
        
        if (nome.trim().equals("")){
            reportErro+= "<p>Campo nome nao pode estar vazio</p><br>";
            existeErro = true;
        }
        
        if (extensaoKm.trim().equals("")){
            reportErro+= "<p>Campo extensão nao pode estar vazio</p><br>";
            existeErro = true;
        }
        
        if (ufInicial.trim().equals("")){
            reportErro+= "<p>Campo UF Inicial nao pode estar vazio</p><br>";
            existeErro = true;
        }
        
        if (cidadeInicial.trim().equals("")){
            reportErro+= "<p>Campo cidade inicial nao pode estar vazio</p><br>";
            existeErro = true;
        }
        
        if (ufFinal.trim().equals("")){
            reportErro+= "<p>Campo UF Final final nao pode estar vazio</p><br>";
            existeErro = true;
        } 
        
        if (cidadeFinal.trim().equals("")){
            reportErro+= "<p>Campo cidade final nao pode estar vazio</p><br>";
            existeErro = true;
        }
        
            
       
        
        
        if (!existeErro) {
        
            rodovia.setNome(nome);
            rodovia.setExtensaoKm(Integer.parseInt(extensaoKm));
            rodovia.setUfInicial(ufInicial);
            rodovia.setCidadeInicial(cidadeInicial);
            rodovia.setUfFinal(ufFinal);
            rodovia.setCidadeFinal(cidadeFinal);

            DaoRodovia dr = new DaoRodovia();

            try {
                System.out.println("entrou no try");
                dr.inserir(rodovia);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ServletUI014.class.getName()).log(Level.SEVERE, null, ex);
            }

            out.println("<html><body>");
            out.println("Nome: " + rodovia.getNome() + "<br>");
            out.println("Extensão: " + rodovia.getExtensaoKm() + "<br>");
            out.println("Cidade Inicial: " + rodovia.getCidadeInicial() + "<br>");
            out.println("UF Inicial: " + rodovia.getUfInicial() + "<br>");
            out.println("Cidade Final: " + rodovia.getCidadeFinal() + "<br>");
            out.println("UF Final: " + rodovia.getUfFinal() + "<br>");
            out.println("</body></html>");
        }
        else{
            System.out.println("aqui vai abrir a pagina de erro");
            System.out.println(reportErro);
            out.println(reportErro);
        }
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
