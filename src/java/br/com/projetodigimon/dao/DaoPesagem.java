/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Pesagem;
import br.com.projetodigimon.model.Rodovia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author erico_000
 */
public class DaoPesagem {

    private Pesagem pesagem = new Pesagem();

    public void inserir(Pesagem pesagem) throws ClassNotFoundException {
        this.pesagem = pesagem;
        System.out.println("entrou no dao");

        String sql = "Insert into PESAGEM"
                + " (IDPESAGEM, PBT, PESOEIXO, DATAHORA, TRANSBORDO, REMANEJAMENTO)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, 44);
            stmt.setFloat(2, this.pesagem.getPbt());
            stmt.setFloat(3, this.pesagem.getPesoEixo());
            stmt.setString(4, "01/12/1992");
            stmt.setString(5, "1");
            stmt.setString(6, "1");
            
            

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void alterar(Pesagem pesagem) throws ClassNotFoundException {
        this.pesagem = pesagem;

        String sql = "update PESAGEM set"
                + "PBT = ?, PESOEIXO = ?, DATAHORA = ?, TRANSBORDO = ? , REMANEJAMENTO = ?"
                + " where IDPESAGEM = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setFloat(1, this.pesagem.getPbt());
            stmt.setFloat(2, this.pesagem.getPesoEixo());
            stmt.setString(3, "01/12/1992");
            stmt.setString(4, "1");
            stmt.setString(5, "1");
            stmt.setInt(5, 44);

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void excluir(Pesagem pesagem) throws ClassNotFoundException {
        this.pesagem = pesagem;

        String sql = "delete from PESAGEM"
                + " where IDPESAGEM = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, 44);

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

}
