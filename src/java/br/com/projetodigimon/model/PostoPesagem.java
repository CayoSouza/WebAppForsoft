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
public class PostoPesagem {
    private int idPosto;
    private int km;
    private String latitude;
    private String longitude;

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getIdPosto() {
        return idPosto;
    }

    public void setIdPosto(int idPosto) {
        this.idPosto = idPosto;
    }

    public void inserir(PostoPesagem pp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
