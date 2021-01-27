/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Factory.ConexaoBanco;
import Model.AtorFilme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Pichau
 */
public class DAO_AtorFilme {
    Connection conexao = new ConexaoBanco().getConnectionFactory();
    
    public void adiciona(AtorFilme atorFilme) {
        
        String sql = " insert into ator_filme (fk_id_ator, fk_id_filme) values(?, ?) ";
        
        try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, atorFilme.getFk_id_ator());
                    stmt.setString(2, atorFilme.getFk_id_filme());
                    stmt.execute();
                }
                
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
        
    }
    
    public void exclui(AtorFilme atorFilme) {
        
        String sql = " UPDATE ator_filme SET status_ator_filme = 'D' WHERE id_ator_filme = ? ";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, atorFilme.getCodigo());
                stmt.execute();
            }            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
    public void altera(AtorFilme atorFilme) {
        
        String sql = " UPDATE ator_filme SET fk_id_ator = ?, fk_id_filme = ? where id_ator_filme = ? ";
        
        try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, atorFilme.getFk_id_ator());
                    stmt.setString(2, atorFilme.getFk_id_filme());
                    stmt.setString(3, atorFilme.getCodigo());
                    stmt.execute();
                }
                
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
        
    }
    
    public ResultSet listaAtorFilme() {
        
        String sql = "select id_ator_filme, fk_id_ator, fk_id_filme ,nome_ator, nome_filme from filme join atores_principais join ator_filme on fk_id_ator = id_ator and fk_id_filme = id_filme where status_ator_filme = '' order by nome_ator";
        ResultSet consultar;
        
            try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar =  stmt.executeQuery();
            
            return consultar;
            
            } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
            
            }
        
    }
    
     public ResultSet pesquisaAtorFilme(String campoPesquisa) {
        
        String sql = "select  id_ator_filme, fk_id_ator, fk_id_filme , nome_ator, nome_filme from filme join atores_principais join ator_filme on fk_id_ator = id_ator and fk_id_filme = id_filme where status_ator_filme = '' and nome_ator like '%" + campoPesquisa + "%' order by nome_ator";
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
