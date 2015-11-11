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
public class Rodovia {
    private int idRodovia;
    private String nome;
    private int extensaoKm;
    private String cidadeInicial;
    private String ufInicial;
    private String cidadeFinal;
    private String ufFinal;
    private String situacao;

    public int getIdRodovia() {
        return idRodovia;
    }

    public void setIdRodovia(int idRodovia) {
        this.idRodovia = idRodovia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExtensaoKm() {
        return extensaoKm;
    }

    public void setExtensaoKm(int extensaoKm) {
        this.extensaoKm = extensaoKm;
    }

    public String getCidadeInicial() {
        return cidadeInicial;
    }

    public void setCidadeInicial(String cidadeInicial) {
        this.cidadeInicial = cidadeInicial;
    }

    public String getUfInicial() {
        return ufInicial;
    }

    public void setUfInicial(String ufInicial) {
        this.ufInicial = ufInicial;
    }

    public String getCidadeFinal() {
        return cidadeFinal;
    }

    public void setCidadeFinal(String cidadeFinal) {
        this.cidadeFinal = cidadeFinal;
    }

    public String getUfFinal() {
        return ufFinal;
    }

    public void setUfFinal(String ufFinal) {
        this.ufFinal = ufFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
    
    
}
