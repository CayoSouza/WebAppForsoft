package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Acesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAcesso {
    private Connection con;
    
    
    public DaoAcesso() throws ClassNotFoundException{
        this.con = new ConnectionFactory().getConnection();
    }

    
    public boolean existe(Acesso a){
        try{
            String sql = "SELECT usuario FROM acesso WHERE usuario = ?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, a.getUsuario());
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
                return true;
            
            st.close();
            rs.close();
            con.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }   
       return false; 
    }
}