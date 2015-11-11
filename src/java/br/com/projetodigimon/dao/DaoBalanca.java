/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Balanca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author erico_000
 */
public class DaoBalanca {

    private Balanca balanca = new Balanca();

    public void inserir(Balanca balanca) throws ClassNotFoundException {
        this.balanca = balanca;
        System.out.println("entrou no dao");

        String sql = "Insert into BAlANCA"
                + " (IDBALANCA, NUMSERIE, FABRICANTE, MODELO)"
                + " VALUES (?,?,?,?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, 44);
            stmt.setInt(2, this.balanca.getNumSerie());
            stmt.setString(3, this.balanca.getFabricante());
            stmt.setString(4, this.balanca.getModelo());
           

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void alterar(Balanca balanca) throws ClassNotFoundException {
        this.balanca = balanca;

        String sql = "update BALANCA set"
                + " NUMSERIE = ?, FABRICANTE = ?, MODELO = ?"
                + " where IDRODOVIA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.balanca.getNumSerie());
            stmt.setString(2, this.balanca.getFabricante());
            stmt.setString(3, this.balanca.getModelo());
            stmt.setInt(4, 5);
            

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void excluir(Balanca balanca) throws ClassNotFoundException {
        this.balanca = balanca;

        String sql = "delete from BALANCA"
                + " where IDBALANCA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, 26);

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

}
