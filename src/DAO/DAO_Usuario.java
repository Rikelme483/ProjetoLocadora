/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class DAO_Usuario {
    Connection conexao = new ConexaoBanco().getConnectionFactory();
    
    public boolean validaLogin(Usuario usuario) {
        
        String sql = " SELECT nome, senha FROM tbl_usuarios WHERE nome = ? AND senha = ? ";
        boolean autenticado;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            
            ResultSet dados;
            dados = stmt.executeQuery();
            
            if(dados.next()) {
                autenticado = true;
                JOptionPane.showMessageDialog(null, "Login efetuado");
            } else {
                autenticado = false;
                JOptionPane.showMessageDialog(null, "ERRO!");
            }
            
            
        } catch(SQLException error) {
            throw new RuntimeException("Houve um erro no login" + error.getMessage());
        }
        
        return autenticado;
    }
    
    public void adiciona(Usuario usuario ) {
        String sql = " INSERT INTO usuarios(nome, sexo, telefone, dt_nascimento) VALUES(?, ?, ?, ?) ";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getSexo());
                stmt.setString(3, usuario.getTelefone());
                stmt.setString(4, usuario.getDt_nascimento());
                stmt.execute();
                stmt.close();
            }
        } catch (SQLException error) {
             throw new RuntimeException(error.getMessage());
        }
    }
    
    public void altera(Usuario usuario) {
        
        String sql = "UPDATE usuarios SET nome = ?, sexo = ?, telefone = ?, dt_nascimento = ? where id_usuario = ?";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getSexo());
                stmt.setString(3, usuario.getTelefone());
                stmt.setString(4, usuario.getDt_nascimento());
                stmt.setString(5, usuario.getCodigo());
                stmt.execute();
            }
            
        } catch(SQLException error) {
             throw new RuntimeException(error.getMessage());
        }
    }
    
    public void excluir(Usuario usuario) {
        
        String sql = " UPDATE usuarios SET status_user = 'D' WHERE id_usuario = ? ";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario.getCodigo());
                stmt.execute();
            }
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
    public ResultSet listaUsuario() {
        
        String sql = " SELECT * FROM usuarios WHERE status_user = '' ";
        ResultSet consultar;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            consultar = stmt.executeQuery();
            
            return consultar;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
        
    }
    
    public ResultSet listaUsuarioAluga() {
        
        String sql = " SELECT * FROM usuarios";
        ResultSet consultar;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            consultar = stmt.executeQuery();
            
            return consultar;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
        
    }
    
    public ResultSet pesquisaUsuario(String campoPesquisa) {
        
        String sql = " SELECT * FROM usuarios WHERE status_user = '' and nome like '%" + campoPesquisa + "%' ";
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
