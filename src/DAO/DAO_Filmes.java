/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Model.Filmes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau 
 */
public class DAO_Filmes {
    Connection conexao = new ConexaoBanco().getConnectionFactory();
    
    public void adiciona(Filmes filme ) {
        String sql = " insert into filme (nome_filme, ano_lancamento ,duracao ,classificacao, fk_id_diretor, fk_id_genero) values(?, ?, ?, ?, ?, ?) ";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, filme.getNome_filme());
                stmt.setString(2, filme.getAno_lancamento());
                stmt.setString(3, filme.getDuracao());
                stmt.setString(4, filme.getClassificacao());
                stmt.setString(5, filme.getCod_diretor());
                stmt.setString(6, filme.getCod_genero());
                stmt.execute();
            }
        } catch (SQLException error) {
             throw new RuntimeException(error.getMessage());
        }
    }
    
    public void altera(Filmes filme) {
        
        String sql = "update filme set nome_filme = ? , ano_lancamento = ? , duracao = ?, classificacao = ?, fk_id_diretor = ?, fk_id_genero = ? where id_filme = ?";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, filme.getNome_filme());
                stmt.setString(2, filme.getAno_lancamento());
                stmt.setString(3, filme.getDuracao());
                stmt.setString(4, filme.getClassificacao());
                stmt.setString(5, filme.getCod_diretor());
                stmt.setString(6, filme.getCod_genero());
                stmt.setString(7, filme.getCodigo());
                stmt.execute();
            }            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
    public void excluir(Filmes filme) {
        
        String sql = " UPDATE filme SET status_filme = 'D' WHERE id_filme = ? ";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, filme.getCodigo());
            stmt.execute();
            stmt.close();            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
    public ResultSet listar() {
        String sql = "SELECT id_filme ,nome_filme, ano_lancamento, duracao, classificacao, nome_diretor, nome_genero FROM filme join diretor join genero on fk_id_diretor = id_diretor and fk_id_genero = id_genero where status_filme = ''  order by nome_filme";
        ResultSet consultar;
        
        try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar =  stmt.executeQuery();
            
            return consultar;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
    public ResultSet listarFilmeAtor() {
        String sql = "SELECT * FROM filme";
        ResultSet consultar;
        
        try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar =  stmt.executeQuery();
            
            return consultar;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
    public ResultSet listarPesquisa(String campoPesquisa) {
        
        String sql = "SELECT id_filme ,nome_filme, ano_lancamento, duracao, classificacao, nome_diretor, nome_genero FROM filme join diretor join genero on fk_id_diretor = id_diretor and fk_id_genero = id_genero where nome_filme LIKE '%" + campoPesquisa + "%' and status_filme = '' order by nome_filme";
        ResultSet pesquisar;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            pesquisar = stmt.executeQuery();
            
            return pesquisar;
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        } 
    }
    
}
