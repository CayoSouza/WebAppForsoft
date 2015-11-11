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
public class Veiculo {
    private long idVeiculo;
    private String uf;
    private String placa;
    private String renavam;
    private String tipo;
    private String modelo;
    private String marca;
    private String anoDeFabricacao;
    private int numEixos;
    private float tara;
    private float cmt;
    private float pbt;
    private float pesoPorEixo;
    private Transportador transportador;

    public float getPesoPorEixo() {
        return pesoPorEixo;
    }

    public void setPesoPorEixo(float pesoPorEixo) {
        this.pesoPorEixo = pesoPorEixo;
    }

    public long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        String letras=placa.substring(0, 3);
        String numeros = placa.substring(4, 8);
        placa = (letras.toUpperCase()+"-"+numeros);
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

    public float getCmt() {
        return cmt;
    }

    public void setCmt(float cmt) {
        this.cmt = cmt;
    }

    public float getPbt() {
        return pbt;
    }

    public void setPbt(float pbt) {
        this.pbt = pbt;
    }

    public Transportador getTransportador() {
        return transportador;
    }

    public void setTransportador(Transportador transportador) {
        this.transportador = transportador;
    }
    
    
}
