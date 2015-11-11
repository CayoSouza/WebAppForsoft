/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DarkBox
 */
public class ConnectionFactory {
    
    public Connection getConnection() throws ClassNotFoundException{

        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/digimon", "alan", "L@nes169268");
        }catch(SQLException e){
           throw new RuntimeException(e);
        }
    }
}
