/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.model;

/**
 *
 * @author Higor
 */
public class CameraPesquisaBean {
    private String fabricante;
    private String modelo;
    private Long idRodovia;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getIdRodovia() {
        return idRodovia;
    }

    public void setIdRodovia(Long idRodovia) {
        this.idRodovia = idRodovia;
    } 
    
    
}
