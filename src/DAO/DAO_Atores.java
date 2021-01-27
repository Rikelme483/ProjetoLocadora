/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Model.Atores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class DAO_Atores {
        Connection conexao = new ConexaoBanco().getConnectionFactory();
        
        public void adiciona(Atores ator){
            
            String sql = " insert into atores_principais(nome_ator, sexo, dt_nascimento) values(?, ?, ?) ";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, ator.getNome_ator());
                    stmt.setString(2, ator.getSexo());
                    stmt.setString(3, ator.getData_nascimento());
                    stmt.execute();
                }
                
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
            
        }
        
        public void altera(Atores ator) {
            
            String sql = " UPDATE atores_principais SET nome_ator = ?, sexo = ?, dt_nascimento = ? WHERE id_ator = ? ";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, ator.getNome_ator());
                    stmt.setString(2, ator.getSexo());
                    stmt.setString(3, ator.getData_nascimento());
                    stmt.setString(4, ator.getCodigo());
                    stmt.execute();
                }
                
                JOptionPane.showMessageDialog(null, "Ator alterado com sucesso!");
                        
            } catch(SQLException error) {
                 throw new RuntimeException(error.getMessage());
            }
            
        }
        
        public void excluir(Atores ator) {
            
            String sql = " UPDATE atores_principais SET status_ator = 'D' WHERE id_ator = ? ";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, ator.getCodigo());
                    stmt.execute();
                }
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
            
        }
        
        public ResultSet listar() {
            
            String sql = "select * from atores_principais where status_ator = '' order by nome_ator ";
             ResultSet consultar;
        
            try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar =  stmt.executeQuery();
            
            return consultar;
            
            } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
            
            }
            
        }
        
        public ResultSet listarAtorFilme() {
            
            String sql = "select * from atores_principais where status_ator = ''";
             ResultSet consultar;
        
            try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar =  stmt.executeQuery();
            
            return consultar;
            
            } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
            
            }
            
        }
        
        public ResultSet pesquisarAtor(String campoPesquisa) {
            
            String sql = "select * from atores_principais where status_ator = '' and nome_ator like '%" + campoPesquisa + "%' order by nome_ator ";
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
