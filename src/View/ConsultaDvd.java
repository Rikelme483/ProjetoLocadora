/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.DAO_DVD;
import Model.DVD;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erikv
 */
public class ConsultaDvd extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaDvd
     */
    public ConsultaDvd() {
        initComponents();
        ListaDVD();
    }
    
    private void ListaDVD() {
        
        DefaultTableModel tabela = (DefaultTableModel) tblDvds.getModel();
        tabela.setNumRows(0);
        
        DAO.DAO_DVD objListaAutores = new DAO_DVD();
        
        ResultSet dados =  objListaAutores.listaDvd();
        
        try {
            while (dados.next()) {                
                tabela.addRow(new Object[] {
                    dados.getString(1),
                    dados.getString(2),
                    dados.getString(3),
                });
            }
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
    private void pesquisaDvd() {
        
        String pesquisaDiretor = campoPesquisa.getText();
        DefaultTableModel tabela = (DefaultTableModel) tblDvds.getModel();
        tabela.setNumRows(0);
        
        DAO.DAO_DVD objListaAutores = new DAO_DVD();
        
        ResultSet dados =  objListaAutores.pesquisaDvd(pesquisaDiretor);
        
        try {
            while (dados.next()) {                
                tabela.addRow(new Object[] {
                    dados.getString(1),
                    dados.getString(2),
                    dados.getString(3),
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
        tblDvds = new javax.swing.JTable();
        btFilmeAlugado = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        campoPesquisa = new javax.swing.JTextField();
        btSeleciona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoucaDora - Consultar DVD's");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 25, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DVD's Disponíveis:");

        tblDvds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DVD", "Código Filme", "Filme"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDvds.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDvds);

        btFilmeAlugado.setBackground(new java.awt.Color(85, 0, 0));
        btFilmeAlugado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btFilmeAlugado.setForeground(new java.awt.Color(255, 255, 255));
        btFilmeAlugado.setText("Filmes Alugados");
        btFilmeAlugado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFilmeAlugadoActionPerformed(evt);
            }
        });

        btCadastrar.setBackground(new java.awt.Color(85, 0, 0));
        btCadastrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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

        btPesquisar.setBackground(new java.awt.Color(85, 0, 0));
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/magnifying-glass.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSeleciona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFilmeAlugado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btPesquisar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btSeleciona)
                    .addComponent(btFilmeAlugado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        CadDvd cad_dvd = new CadDvd();
        cad_dvd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
       
        
        String DVD, codigo_filme, nome_filme;
        
        if(tblDvds.getSelectedRow() < 0 ) {
            JOptionPane.showMessageDialog(this, "Selecione um campo para alterar!");
        } else {
            
            int linha = tblDvds.getSelectedRow();
            
            DVD = (String) tblDvds.getValueAt(linha, 0);
            codigo_filme = (String) tblDvds.getValueAt(linha, 1);
            nome_filme = (String) tblDvds.getValueAt(linha, 2);
            
            AltDvd alt_dvd = new AltDvd();
            alt_dvd.setVisible(true);
            this.dispose();
            
            alt_dvd.resgate(codigo_filme, nome_filme, DVD);
        }
        
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisaDvd();
        
        
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        
        if(tblDvds.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um campo para excluir!");
        } else {
            
            int linha = tblDvds.getSelectedRow();
            String id = (String) tblDvds.getValueAt(linha, 0);
            
            DAO.DAO_DVD objDvd = new DAO_DVD();
            Model.DVD dvd = new DVD(id);
            
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este DVD?");
            
            if(confirm == JOptionPane.YES_OPTION) {
                
               try {
                    objDvd.exclui(dvd);
                    JOptionPane.showMessageDialog(this, "DVD excluido com sucesso!");
               } catch(HeadlessException error) {
                   JOptionPane.showMessageDialog(this, "Houve um erro \n" + error.getMessage() );
               }
                
            } else {
                JOptionPane.showMessageDialog(this, "Dado não excluido");
            }   
        }
        
        ListaDVD();
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btFilmeAlugadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFilmeAlugadoActionPerformed
        // TODO add your handling code here:
        ConsultaEmprestimo consulta = new ConsultaEmprestimo();
        consulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btFilmeAlugadoActionPerformed

    private void btSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionaActionPerformed
        // TODO add your handling code here:
        
        String codigo;
        
        if(tblDvds.getSelectedRow() < 0 ) {
            JOptionPane.showMessageDialog(this, "Selecione um campo!");
        } else {
            int linha = tblDvds.getSelectedRow();
            
            codigo = (String) tblDvds.getValueAt(linha, 0);
            
            CadAluga envia = new CadAluga();
            envia.resgate(codigo);
            envia.setVisible(true);
            
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
            java.util.logging.Logger.getLogger(ConsultaDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaDvd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFilmeAlugado;
    private javax.swing.JButton btPesquisar;
    public javax.swing.JButton btSeleciona;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDvds;
    // End of variables declaration//GEN-END:variables
}
