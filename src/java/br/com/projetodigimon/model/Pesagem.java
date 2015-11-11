/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.model;


/**
 *
 * @author Luiz
 */
public class Pesagem {
    
    private int idPesagem;
    private PostoPesagem postoPesagem;
    private Veiculo veiculo;    
    private float pbt;
    private float pesoEixo;
    private String dataHora;
    private String transbordo;
    private String remanejamento;

    public int getIdPesagem() {
        return idPesagem;
    }

    public void setIdPesagem(int idPesagem) {
        this.idPesagem = idPesagem;
    }

    public PostoPesagem getPostoPesagem() {
        return postoPesagem;
    }

    public void setPostoPesagem(PostoPesagem postoPesagem) {
        this.postoPesagem = postoPesagem;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public float getPbt() {
        return pbt;
    }

    public void setPbt(float pbt) {
        this.pbt = pbt;
    }

    public float getPesoEixo() {
        return pesoEixo;
    }

    public void setPesoEixo(float pesoEixo) {
        this.pesoEixo = pesoEixo;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getTransbordo() {
        return transbordo;
    }

    public void setTransbordo(String transbordo) {
        this.transbordo = transbordo;
    }

    public String getRemanejamento() {
        return remanejamento;
    }

    public void setRemanejamento(String remanejamento) {
        this.remanejamento = remanejamento;
    }

    

    
}
