/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Carga;
import br.com.projetodigimon.model.Frete;
import br.com.projetodigimon.model.MotoristaPesquisaBean;
import br.com.projetodigimon.model.PessoaFisicaPesquisaBean;
import br.com.projetodigimon.model.PessoaJuridicaPesquisaBean;
import br.com.projetodigimon.model.ProdutoPesquisaBean;
import br.com.projetodigimon.model.TransportadorPesquisaBean;
import br.com.projetodigimon.model.VeiculoPesquisaBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sora
 */
@WebServlet(name = "ServletUI029", urlPatterns = {"/ServletUI029"})
public class ServletUI029 extends HttpServlet {

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
        String filtro = request.getParameter("filtro");

        //Veiculo
        VeiculoPesquisaBean veiculo = new VeiculoPesquisaBean();

        //Transportador & pessoa juridica
        TransportadorPesquisaBean transportador = new TransportadorPesquisaBean();
        PessoaJuridicaPesquisaBean pessoaj = new PessoaJuridicaPesquisaBean();

        //Pessoa fisica
        PessoaFisicaPesquisaBean pessoaf = new PessoaFisicaPesquisaBean();

        //Motorista
        MotoristaPesquisaBean motorista = new MotoristaPesquisaBean();

        //Carga (usei a entidade inteira)
        Carga carga = new Carga();
        
        //Produto 
        ProdutoPesquisaBean produto = new ProdutoPesquisaBean();
        
        //Frete  (usei a entidade inteira)
        Frete frete = new Frete();        

        if (filtro.equalsIgnoreCase("veiculo")) {
            veiculo.setPlaca(request.getParameter("placa"));
            //inserir dao.listar + try catch
        }

        if (filtro.equalsIgnoreCase("transportador")) {
            transportador.setRntrc(request.getParameter("rntrc"));
            pessoaj.setCnpj(request.getParameter("cnpj"));
            pessoaj.setNome(request.getParameter("nome"));  // conferir se é nome fantasia ou nome.
             //inserir dao.listar + try catch

        }

        if (filtro.equalsIgnoreCase("pessoaJuridica")) {
            pessoaj.setCnpj(request.getParameter("cnpj"));
            pessoaj.setNome(request.getParameter("nome"));
             //inserir dao.listar + try catch
        }

        if (filtro.equalsIgnoreCase("pessoaFisica")) {
            pessoaf.setCpf(request.getParameter("cpf"));
            pessoaf.setNome(request.getParameter("nome"));
             //inserir dao.listar + try catch
        }

        if (filtro.equalsIgnoreCase("motorista")) {
            motorista.setCnh(Integer.parseInt(request.getParameter("cnh")));
            pessoaf.setNome(request.getParameter("nome")); // Conferir de onde vai vir o nome
             //inserir dao.listar + try catch
        }

        if (filtro.equalsIgnoreCase("carga")) {
            carga.setTipo(request.getParameter("tipo"));
            carga.setRemetente(request.getParameter("remetente"));
            carga.setDestinatario(request.getParameter("destinatario"));
             //inserir dao.listar + try catch
        }
        
        if (filtro.equalsIgnoreCase("produto")){
            produto.setMercadoria(request.getParameter("mercadoria"));
             //inserir dao.listar + try catch
        }
        
        if (filtro.equalsIgnoreCase("frete")){
            frete.setTipo(request.getParameter("tipo"));
            
             //inserir dao.listar + try catch
            //Ver como vai ser o periodo
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
