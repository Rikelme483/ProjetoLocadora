/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Model.Emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class DAO_Emprestimo {
    Connection conexao = new ConexaoBanco().getConnectionFactory();
    
    public void adiciona(Emprestimo emprestimo) {
        String sql = " insert into filme_alugado(fk_id_dvd, fk_id_usuario) values (?, ?) ";
        
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, emprestimo.getFk_id_dvd());
                stmt.setString(2, emprestimo.getFk_id_usuario());
                stmt.execute();
            }
            
        } catch(SQLException error) {
            throw new RuntimeException("Houve um erro ao alterar o DVD! \n" + error.getMessage() );
        }
    }
    
    public void altera(Emprestimo emprestimo) {
        
        String sql = " UPDATE tbl_emprestimo SET id_emp_dvd = ?, id_emp_usuario = ? ";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, emprestimo.getFk_id_dvd());
            stmt.setString(2, emprestimo.getFk_id_usuario());
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alteração de emprestimo bem sucedida");
            
            
        } catch(SQLException error) {
            throw new RuntimeException("Houve um erro ao alterar o DVD! \n" + error.getMessage() );
        }
        
    }
    
    public void exclui(Emprestimo emp) {
        
        String sql = " UPDATE filme_alugado SET status_emprestimo = 'D' WHERE id_aluguel = ? ";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, emp.getCodigo());
            stmt.execute();
            stmt.close();
            
        } catch(SQLException error) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar o DVD! \n" + error.getMessage() );
        }
        
    }
    
    public ResultSet listaEmprestimo() {
        
        String sql = " select id_aluguel ,dt_aluguel, dt_devolucao, fk_id_dvd, nome_filme, nome from filme_alugado join dvd join usuarios join filme on fk_id_filme = id_filme and fk_id_dvd = id_dvd and fk_id_usuario = id_usuario where status_emprestimo = '' ";
        ResultSet consultar;
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            consultar = stmt.executeQuery();
            
            return consultar;
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
    public ResultSet pesquisaEmprestimo(String campoPesquisa) {
        
        String sql = " select id_aluguel ,dt_aluguel, dt_devolucao, fk_id_dvd, nome_filme, nome from filme_alugado join dvd join usuarios join filme on fk_id_filme = id_filme and fk_id_dvd = id_dvd and fk_id_usuario = id_usuario where status_emprestimo = '' and nome like '%" + campoPesquisa + "%' ";
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
