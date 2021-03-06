/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.DAO_Filmes;
import Model.Filmes;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erikv
 */
public class ConsultaFilme extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaFilmes
     */
    public ConsultaFilme() {
        initComponents();
        listaFilmes();
    }

    private void listaFilmes() {
        DefaultTableModel tabelaFilme = (DefaultTableModel) tblFilmes.getModel();
        tabelaFilme.setNumRows(0);
        
        DAO.DAO_Filmes objFilmes = new DAO_Filmes();
        
        ResultSet dados = objFilmes.listar();
        
        try {
            while(dados.next()) {
                tabelaFilme.addRow( new Object[] {
                   dados.getString(1),
                   dados.getString(2),
                   dados.getString(3),
                   dados.getString(4),
                   dados.getString(5),
                   dados.getString(6),
                   dados.getString(7),
                });
            }
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    
    
    private void pesquisaFilme() {
        
        String Pesquisa = campoPesquisa.getText() ;
        DefaultTableModel tabela = (DefaultTableModel) tblFilmes.getModel();
        tabela.setNumRows(0);
        
        DAO.DAO_Filmes objListaAutores = new DAO_Filmes();
        
        ResultSet dados = objListaAutores.listarPesquisa(Pesquisa);
        
        try {
            while (dados.next()) {                
                tabela.addRow(new Object[] {
                    dados.getString(1),
                    dados.getString(2),
                    dados.getString(3),
                    dados.getString(4),
                    dados.getString(5),
                    dados.getString(6),
                    dados.getString(7),
                });
            }
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        campoPesquisa = new javax.swing.JTextField();
        btSeleciona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoucaDora - Consultar Filmes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 25, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Títulos Cadastrados:");

        tblFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Ano de Lançamento", "Duração", "Classificação", "Diretor", "Gênero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFilmes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblFilmes);

        btCadastrar.setBackground(new java.awt.Color(85, 0, 0));
        btCadastrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(85, 0, 0));
        btAlterar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(85, 0, 0));
        btExcluir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btPesquisar.setBackground(new java.awt.Color(85, 0, 0));
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/magnifying-glass.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(85, 0, 0));
        btCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSeleciona.setBackground(new java.awt.Color(85, 0, 0));
        btSeleciona.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btSeleciona.setForeground(new java.awt.Color(255, 255, 255));
        btSeleciona.setText("Selecionar");
        btSeleciona.setEnabled(false);
        btSeleciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 592, Short.MAX_VALUE)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSeleciona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPesquisar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar)
                    .addComponent(btSeleciona))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        
        
        String codigo, nome_filme,  ano_lancamento, duracao, classificacao, cod_diretor, cod_genero;
        
        if(tblFilmes.getSelectedRow() < 0 ) {
            JOptionPane.showMessageDialog(null, "Selecione um campo para alterar!");
        } else {
            
            int linha = tblFilmes.getSelectedRow();
            
            codigo = (String) tblFilmes.getValueAt(linha, 0);
            nome_filme = (String) tblFilmes.getValueAt(linha, 1);
            ano_lancamento = (String) tblFilmes.getValueAt(linha, 2);
            duracao = (String) tblFilmes.getValueAt(linha, 3);
            classificacao = (String) tblFilmes.getValueAt(linha, 4);
            cod_diretor = (String) tblFilmes.getValueAt(linha, 5);
            cod_genero = (String) tblFilmes.getValueAt(linha, 6);
            
            AltFilme alt_filme = new AltFilme();
            alt_filme.setVisible(true);
            
            alt_filme.resgate(nome_filme, ano_lancamento, duracao, classificacao, cod_diretor, cod_genero, codigo);
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        this.dispose();
        CadFilme cad_filme = new CadFilme();
        cad_filme.setVisible(true);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        
        if(tblFilmes.getSelectedRow() < 0 ) {
            JOptionPane.showMessageDialog(this, "Selecione um campo para excluir");
        } else {
            int linha = tblFilmes.getSelectedRow();
            String id = (String) tblFilmes.getValueAt(linha, 0);
            
            DAO.DAO_Filmes objFilme = new DAO_Filmes();
            Model.Filmes filme = new Filmes(id);
            
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este filme?");
            
            if(confirm == JOptionPane.YES_OPTION) {
                try {
                    objFilme.excluir(filme);
                    JOptionPane.showMessageDialog(this, "Filme excluido");
                } catch(HeadlessException error) {
                    JOptionPane.showMessageDialog(this, "Houve um erro ao excluir filme" + error.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Dado não excluido");
            }
        }
        
        listaFilmes();
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisaFilme();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionaActionPerformed
        // TODO add your handling code here:
        
        String nome_filme, codigo;
        
        if(tblFilmes.getSelectedRow() < 0 ) {
            JOptionPane.showMessageDialog(this, "Selecione um campo!");
        } else {
            int linha = tblFilmes.getSelectedRow();
            
            codigo = (String) tblFilmes.getValueAt(linha, 0);
            nome_filme = (String) tblFilmes.getValueAt(linha, 1);
            
            CadDvd test = new CadDvd();
            test.resgate(nome_filme, codigo);
            test.setVisible(true);
            
            this.dispose();
        }
        
    }//GEN-LAST:event_btSelecionaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ConsultaFilme().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    public javax.swing.JButton btSeleciona;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFilmes;
    // End of variables declaration//GEN-END:variables
}
