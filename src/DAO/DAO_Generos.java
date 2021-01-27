/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Model.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Pichau
 */
public class DAO_Generos {
    
    Connection conexao = new ConexaoBanco().getConnectionFactory();
        
        public void adiciona(Genero genero){
            
            String sql = " insert into genero (nome_genero) values(?) ";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, genero.getNome_genero());
                    stmt.execute();
                }
                
            } catch(SQLException error) {
                 throw new RuntimeException(error.getMessage());
            }
            
        }
        
        public void altera(Genero genero) {
            
            String sql = "update genero set nome_genero = ? where id_genero = ?";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, genero.getNome_genero());
                    stmt.setString(2, genero.getCodigo());
                    stmt.execute();
                }
                
                        
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
            
        }
        
        public void exclui(String Id) {
            
            String sql = " UPDATE genero SET status_genero = 'D' WHERE id_genero = ? ";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, Id);
                    stmt.execute();
                }
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
            
        }
        
        public ResultSet listar() {
            
            String sql = "select * from genero where status_genero = '' ";
            ResultSet consultar;
        
            try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar =  stmt.executeQuery();
            
            return consultar;
            
            } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
            
            }
            
        }
        
        public ResultSet listaPesquisa(String pesquisa) {
            
            String sql = "select * from genero where status_genero = '' and nome_genero like '%" + pesquisa + "%'";
            ResultSet consultar;
        
            try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar =  stmt.executeQuery();
            
            return consultar;
            
            } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
            
            }
            
        }
        
    
}
