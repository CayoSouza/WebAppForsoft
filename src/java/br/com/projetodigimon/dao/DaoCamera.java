package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Camera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DarkBox
 */
public class DaoCamera{
    private Camera camera = new Camera();
    
    
    public void inserir(Camera camera) throws ClassNotFoundException{
        this.camera = camera;    
        System.out.println("entrou no dao");

        String sql = "Insert into CAMERA" + 
                    " (FABRICANTE, MODELO, NUMSERIE, KM, LATITUDE, LONGITUDE)"
                    + " VALUES (?,?,?,?,?,?)";
       
         try{
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, 44);
                stmt.setString(2, this.camera.getFabricante());
                stmt.setString(3, this.camera.getModelo());
                stmt.setString(4, this.camera.getNumSerie());
                stmt.setInt(5, this.camera.getKm());
                stmt.setFloat(6, this.camera.getLatitude());
                stmt.setFloat(7, this.camera.getLongitude());
                stmt.setInt(8, 1);

                stmt.executeUpdate();
                stmt.close();
            }catch(SQLException e){
                throw new RuntimeException(e + "Erro na Conexão" );
            }
    }
    
     public void alterar (Camera camera) throws ClassNotFoundException{
        this.camera = camera;    


        String sql = "update CAMERAset" + 
                    "FABRICANTE  = ?, NUMSERIE = ?, MODELO = ?, KM = ?, LATITUDE = ?, LONGITUDE = ?, IDRODOVIA = ?"
                    + " where IDCAMERA = ?";
       
         try{
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
              
                stmt.setString(1, this.camera.getFabricante());
                stmt.setString(2, this.camera.getNumSerie());
                stmt.setString(3, this.camera.getModelo());
                stmt.setInt(4, this.camera.getKm());
                stmt.setFloat(5, this.camera.getLatitude());
                stmt.setFloat(6, this.camera.getLongitude());
                stmt.setInt(7, 0);
                stmt.setInt(8, 68);

                stmt.executeUpdate();
                stmt.close();
                
            }catch(SQLException e){
                throw new RuntimeException(e + "Erro na Conexão" );
            }
    }
     
     public void excluir (Camera camera) throws ClassNotFoundException{
        this.camera = camera;    


        String sql = "delete from CAMERA" + 
                   " where IDCAMERA = ?";
       
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