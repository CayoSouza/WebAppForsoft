package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Acesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAcesso {

    public static Acesso getUsuario(String usuario, String senha) throws SQLException, ClassNotFoundException {
        Connection con = new ConnectionFactory().getConnection();
        try {
            String sql = "select id, usuario, senha, tipousuario from acesso "
                    + "where usuario = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Acesso user = new Acesso();
                String pusuario = rs.getString("usuario");
                String psenha = rs.getString("senha");
                user.setUsuario(pusuario);
                user.setSenha(psenha);
                user.setIdAcesso(rs.getInt("idacesso"));
                //user.setTipoUsuario(rs.getInt("tipousuario"));
                user.setTipoUsuario(rs.getString("tipousuario"));
                if (usuario.equals(pusuario) && senha.equals(psenha)) {
                    System.out.println("Usuario Encontrado");
                    stmt.close();
                    con.close();
                    rs.close();
                    return user;
                } else {
                    System.out.println("Usuario não encontrado");
                }
            }
            stmt.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
