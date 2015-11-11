package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.PostoPesagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.projetodigimon.model.PostoPesagem;

/**
 *
 * @author DarkBox
 */
public class DaoPosto{
    private PostoPesagem postopesagem = new PostoPesagem();
    
    
    public void inserir(PostoPesagem postoPesagem) throws ClassNotFoundException{
        this.postopesagem = postoPesagem;    
        System.out.println("entrou no dao");

        String sql = "Insert into POSTO" + 
                    " (KM, LATITUDE, LONGITUDE)"
                    + " VALUES (?,?,?)";
       
         try{
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, 44);
                stmt.setInt(2, this.postopesagem.getKm());
                stmt.setString(3, this.postopesagem.getLatitude());
                stmt.setString(4, this.postopesagem.getLongitude());
                stmt.setInt(5, 1);

                stmt.executeUpdate();
                stmt.close();
            }catch(SQLException e){
                throw new RuntimeException(e + "Erro na Conexão" );
            }
    }
    
     public void alterar (PostoPesagem postoPesagem) throws ClassNotFoundException{
        this.postopesagem = postoPesagem;    


        String sql = "update POSTOPESAGEM set" + 
                    " KM = ?, LATITUDE = ?, LONGITUDE = ?"
                    + " where IDPOSTO = ?";
       
         try{
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
              
                stmt.setInt(1, this.postopesagem.getKm());
                stmt.setString(2, this.postopesagem.getLatitude());
                stmt.setString(3, this.postopesagem.getLongitude());
                stmt.setInt(4, 0);
                stmt.setInt(5, 68);

                stmt.executeUpdate();
                stmt.close();
                
            }catch(SQLException e){
                throw new RuntimeException(e + "Erro na Conexão" );
            }
    }
     
     public void excluir (PostoPesagem postoPesagem) throws ClassNotFoundException{
        this.postopesagem = postoPesagem;    


        String sql = "delete from POSTOPESAGEM" + 
                   " where IDPOSTOPESAGEM = ?";
       
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