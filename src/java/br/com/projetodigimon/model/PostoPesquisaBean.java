
package br.com.projetodigimon.model;

public class PostoPesquisaBean {
    
    private int idPosto;

    public int getIdPosto() {
        return idPosto;
    }

    public void setIdPosto(int idPosto) {
        this.idPosto = idPosto;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    private int km;
    private String longitude;
    private String latitude;

    
}
