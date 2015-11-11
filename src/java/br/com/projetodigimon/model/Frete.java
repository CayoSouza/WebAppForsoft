

package br.com.projetodigimon.model;


public class Frete {
    private int idFrete;
    private Motorista motorista;
    private Transportador transportador;
    private Veiculo veiculo;
    private String tipo;
    private String situacao;

    public int getIdFrete() {
        return idFrete;
    }

    public void setIdFrete(int idFrete) {
        this.idFrete = idFrete;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Transportador getTransportador() {
        return transportador;
    }

    public void setTransportador(Transportador transportador) {
        this.transportador = transportador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
