/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.controller;

import br.com.projetodigimon.dao.DaoCamera;
import br.com.projetodigimon.model.Camera;
import br.com.projetodigimon.model.Rodovia;
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
 * @author EliasL
 */
@WebServlet(name = "ServletUI026", urlPatterns = {"/web/ServletUI026"})
public class ServletUI026 extends HttpServlet {

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

        Camera camera = new Camera();
    //    Passagem passagem = new Passagem();
        Rodovia rodovia = new Rodovia();
        
        /** Ver nescessidade desse método
        String idCamera = request.getParameter(idCamera)
        **/
        //String idRodovia = request.getParameter("idRodovia");
        String numSerie = request.getParameter("numserie");
        String fabricante = request.getParameter("fabricante");
        String modelo = request.getParameter("modelo");
        String latitude = request.getParameter("latitude");
        String longitude = request.getParameter("longitude");
        String km = request.getParameter("km");
        
        /* Verificar Nescessidade 
        String situacao = request.getParameter("situacao");
        */
        
        //rodovia.setIdRodovia(Integer.parseInt("idRodovia"));
        camera.setNumSerie(numSerie);
        camera.setFabricante(fabricante);
        camera.setModelo(modelo);
        camera.setLatitude(Float.parseFloat(latitude));
        camera.setLongitude(Float.parseFloat(longitude));
        camera.setKm(Integer.parseInt(km));
        
        
        DaoCamera dc = new DaoCamera();
        
        try {
            System.out.println("entrou no try");
            dc.inserir(camera);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletUI026.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        out.println("<html><body>");
        out.println("Id Rodovia: "+rodovia.getIdRodovia()+"<br>");
        out.println("Numero de Série: "+camera.getNumSerie()+"<br>");
        out.println("Fabricante : "+camera.getFabricante()+"<br>");
        out.println("Modelo : "+camera.getModelo()+"<br>");
        out.println("Latitude : "+camera.getLatitude()+"<br>");
        out.println("Longitude : "+camera.getLongitude()+"<br>");
        out.println("Km : "+camera.getKm()+"<br>");
        out.println("</body></html>");
    
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
