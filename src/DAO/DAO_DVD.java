/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Model.DVD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class DAO_DVD {
    Connection conexao = new ConexaoBanco().getConnectionFactory();
    
    public void adiciona(DVD dvd) {
        
        String sql = " INSERT INTO dvd(fk_id_filme) VALUES(?) ";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, dvd.getCodigo());
            stmt.execute();
            stmt.close();            
            
        } catch(SQLException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao adicionar o DVD! \n" + error.getMessage());
        }
    }
    
    public void altera(DVD dvd) {
        
        String sql = "update dvd set fk_id_filme = ? where id_dvd = ?  ";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, dvd.getFk_id_filme());
                stmt.setString(2, dvd.getCodigo());
                stmt.execute();
            }
            
            
        } catch(SQLException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar o DVD! \n" + error.getMessage() );
        }
        
    }
    
    public void aluga(DVD dvd) {
        
        String sql = " UPDATE dvd SET status_dvd = 'Alugado' WHERE id_dvd = ? ";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, dvd.getCodigo());
            stmt.execute();
            stmt.close();
            
        } catch(SQLException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar o DVD! \n" + error.getMessage() );
        }
        
    }
    
    public void devolve(DVD dvd) {
        
        String sql = " UPDATE dvd SET status_dvd = '' WHERE id_dvd = ? ";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, dvd.getCodigo());
                stmt.execute();
            }
            
        } catch(SQLException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar o DVD! \n" + error.getMessage() );
        }
        
    }
    
    public void exclui(DVD dvd) {
        
        String sql = " UPDATE dvd SET status_delete = 'D' WHERE id_dvd = ? ";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, dvd.getCodigo());
            stmt.execute();
            stmt.close();
            
        } catch(SQLException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar o DVD! \n" + error.getMessage() );
        }
        
    }
    
    public ResultSet listaDvd() {
        
        String sql = "select id_dvd, fk_id_filme, nome_filme  from dvd join filme on fk_id_filme = id_filme where status_dvd = ' ' and status_delete = '' order by nome_filme";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet consulta;
            
            consulta = stmt.executeQuery();
            
            return consulta;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
    public ResultSet pesquisaDvd(String campoPesquisa) {
        
        String sql = "select id_dvd, fk_id_filme, nome_filme  from dvd join filme on fk_id_filme = id_filme where status_dvd = '' and status_delete = '' and nome_filme like '%" + campoPesquisa + "%' order by nome_filme";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet consulta;
            
            consulta = stmt.executeQuery();
            
            return consulta;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
    public ResultSet listaComboDvd() {
        
        String sql = "select id_dvd, fk_id_filme, nome_filme  from dvd join filme on fk_id_filme = id_filme order by nome_filme";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet consulta;
            
            consulta = stmt.executeQuery();
            
            return consulta;
            
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
}
