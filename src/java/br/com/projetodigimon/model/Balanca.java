/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.model;

/**
 *
 * @author Javapos
 */
public class Balanca {
    private int idBalanca;
    private PostoPesagem postoPesagem;
    private int numSerie;
    private String fabricante;
    private String modelo;
    private String situacao;
   

    public int getIdBalanca() {
        return idBalanca;
    }

    public void setIdBalanca(int idBalanca) {
        this.idBalanca = idBalanca;
    }

    public PostoPesagem getPostoPesagem() {
        return postoPesagem;
    }

    public void setPostoPesagem(PostoPesagem postoPesagem) {
        this.postoPesagem = postoPesagem;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
