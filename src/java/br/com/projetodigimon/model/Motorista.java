
package br.com.projetodigimon.model;


public class Motorista {
    private int cnh;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private Transportador transpotador;
    private Motorista motorista;

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public Transportador getTranspotador() {
        return transpotador;
    }

    public void setTranspotador(Transportador transpotador) {
        this.transpotador = transpotador;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
    
    
}
