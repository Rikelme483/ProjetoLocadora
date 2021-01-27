/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Model.Diretor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Pichau
 */
public class DAO_Diretores {
    
    Connection conexao = new ConexaoBanco().getConnectionFactory();
    
    public void adiciona(Diretor diretor){
            
            String sql = " insert into diretor (nome_diretor,sexo,nacionalidade) values (?, ?, ?) ";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, diretor.getNome_diretor());
                    stmt.setString(2, diretor.getSexo());
                    stmt.setString(3, diretor.getNacionalidade());
                    stmt.execute();
                }
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
            
       }
    
    public void altera(Diretor diretor) {
            
            String sql = " update diretor set nome_diretor = ? , sexo = ? , nacionalidade = ? where id_diretor = ? ";
            
            try {
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    stmt.setString(1, diretor.getNome_diretor());
                    stmt.setString(2, diretor.getSexo());
                    stmt.setString(3, diretor.getNacionalidade());
                    stmt.setString(4, diretor.getCodigo());
                    stmt.execute();
                }
                
            } catch(SQLException error) {
                throw new RuntimeException(error.getMessage());
            }
            
            
            
    }
    
    public void excluir(Diretor diretor) {
        
        String sql = " update diretor set status_diretor = 'D' where id_diretor = ? ";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, diretor.getCodigo());
            stmt.execute();
            stmt.close();
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
    public ResultSet listar() {
        
        String sql = " select id_diretor ,nome_diretor, sexo, nacionalidade from diretor where status_diretor = '' order by nacionalidade ";
        ResultSet consultar;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar = stmt.executeQuery();
            
            return consultar;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
        
    }
    
    public ResultSet listaCadastrarAlterar() {
        
        String sql = " select id_diretor ,nome_diretor, sexo, nacionalidade from diretor";
        ResultSet consultar;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar = stmt.executeQuery();
            
            return consultar;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
        
    }
    
    public ResultSet pesquisaDiretor(String campoPesquisa) {
        
        String sql = "select id_diretor ,nome_diretor, sexo, nacionalidade from diretor where status_diretor = '' and nome_diretor like '%" + campoPesquisa + "%' order by nacionalidade";
        ResultSet consultar;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar = stmt.executeQuery();
            
            return consultar;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
}
