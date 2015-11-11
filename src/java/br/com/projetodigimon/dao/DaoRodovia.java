package br.com.projetodigimon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.projetodigimon.model.Rodovia;

/**
 *
 * @author DarkBox
 */
public class DaoRodovia{
    private Rodovia rodovia = new Rodovia();
    
    
    public void inserir(Rodovia rodovia) throws ClassNotFoundException{
        this.rodovia = rodovia;    
        System.out.println("entrou no dao");

        String sql = "Insert into RODOVIA" + 
                    " (IDRODOVIA, NOME, EXTENSAOKM, CIDADEINICIAL, UFINICIAL, CIDADEFINAL, UFFINAL, SITUACAO)"
                    + " VALUES (?,?,?,?,?,?,?,?)";
       
         try{
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, 44);
                stmt.setString(2, this.rodovia.getNome());
                stmt.setFloat(3, this.rodovia.getExtensaoKm());
                stmt.setString(4, this.rodovia.getCidadeInicial());
                stmt.setString(5, this.rodovia.getUfInicial());
                stmt.setString(6, this.rodovia.getCidadeFinal());
                stmt.setString(7, this.rodovia.getUfFinal());
                stmt.setInt(8, 1);

                stmt.executeUpdate();
                stmt.close();
            }catch(SQLException e){
                throw new RuntimeException(e + "Erro na Conexão" );
            }
    }
    
     public void alterar (Rodovia rodovia) throws ClassNotFoundException{
        this.rodovia = rodovia;    


        String sql = "update RODOVIA set" + 
                    " NOME = ?, EXTENSAOKM = ?, CIDADEINICIAL = ?, UFINICIAL = ?, CIDADEFINAL = ?, UFFINAL = ?, SITUACAO = ?"
                    + " where IDRODOVIA = ?";
       
         try{
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
              
                stmt.setString(1, this.rodovia.getNome());
                stmt.setFloat(2, this.rodovia.getExtensaoKm());
                stmt.setString(3, this.rodovia.getCidadeInicial());
                stmt.setString(4, this.rodovia.getUfInicial());
                stmt.setString(5, this.rodovia.getCidadeFinal());
                stmt.setString(6, this.rodovia.getUfFinal());
                stmt.setInt(7, 0);
                stmt.setInt(8, 68);

                stmt.executeUpdate();
                stmt.close();
                
            }catch(SQLException e){
                throw new RuntimeException(e + "Erro na Conexão" );
            }
    }
     
     public void excluir (Rodovia rodovia) throws ClassNotFoundException{
        this.rodovia = rodovia;    


        String sql = "delete from RODOVIA" + 
                   " where IDRODOVIA = ?";
       
         try{
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
              
                stmt.setInt(1, 26);

                stmt.executeUpdate();
                stmt.close();
            }catch(SQLException e){
                throw new RuntimeException(e + "Erro na Conexão" );
            }
    }
    
    
}