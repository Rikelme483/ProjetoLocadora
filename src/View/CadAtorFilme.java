/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.DAO_AtorFilme;
import DAO.DAO_Atores;
import DAO.DAO_Filmes;
import Model.AtorFilme;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class CadAtorFilme extends javax.swing.JFrame {

    /**
     * Creates new form CadAtorFilme
     */
    public CadAtorFilme() {
        initComponents();
        comboFilme();
    }
    
    String cod_global_ator;
    
    public void resgateAtor(String nome_ator, String codigo_ator) {
        campoNome.setText(nome_ator);
        cod_global_ator =  codigo_ator;
    }
    
    
    private void comboFilme() {
        DAO.DAO_Filmes objFilme = new DAO_Filmes();
        ResultSet lista = objFilme.listarFilmeAtor();
        
        try {
            while(lista.next()) {
                comboFilme.addItem(lista.getString(2));
            }
        } catch(SQLException error) {
            throw new RuntimeException(error.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btVincular = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        btSelecionaAtor = new javax.swing.JButton();
        comboFilme = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(25, 25, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ator:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Filme:");

        btVincular.setBackground(new java.awt.Color(85, 0, 0));
        btVincular.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btVincular.setForeground(new java.awt.Color(255, 255, 255));
        btVincular.setText("Vincular");
        btVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVincularActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vincular Ator/Filme:");

        campoNome.setEditable(false);

        btSelecionaAtor.setBackground(new java.awt.Color(85, 0, 0));
        btSelecionaAtor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btSelecionaAtor.setForeground(new java.awt.Color(255, 255, 255));
        btSelecionaAtor.setText("...");
        btSelecionaAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionaAtorActionPerformed(evt);
            }
        });

        comboFilme.setBackground(new java.awt.Color(85, 0, 0));
        comboFilme.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(btVincular)
                            .addGap(18, 18, 18)
                            .addComponent(btCancelar)
                            .addGap(146, 146, 146))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(jLabel10)))
                            .addGap(85, 85, 85)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelecionaAtor)
                        .addGap(72, 72, 72))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionaAtor))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVincular)
                    .addComponent(btCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVincularActionPerformed
        // TODO add your handling code here:
        String filme = Integer.toString(comboFilme.getSelectedIndex() + 1);
        String ator  = campoNome.getText();
        
        
            if(ator.isEmpty()) {
                JOptionPane.showMessageDialog(this, "O campo não pode estar vazio!");
            } else {
                
                DAO.DAO_AtorFilme objAtorFilme = new DAO_AtorFilme();
                Model.AtorFilme atorFilme = new AtorFilme(cod_global_ator, filme);
        
                try {
                    objAtorFilme.adiciona(atorFilme);
                    System.out.println(filme);
                    campoNome.setText("");
                    comboFilme.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(this, "Vinculo bem sucedido!");

                } catch(HeadlessException error) {
                    throw new RuntimeException(error.getMessage());
                }
                
            }
        
        
    }//GEN-LAST:event_btVincularActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
        ConsultaAtorFilme consulta = new ConsultaAtorFilme();
        
        consulta.setVisible(true);
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSelecionaAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionaAtorActionPerformed
        // TODO add your handling code here:
        ConsultaAtor consulta = new ConsultaAtor();
        consulta.setVisible(true);
        consulta.btSeleciona.setEnabled(true);
        
        this.dispose();
        
    }//GEN-LAST:event_btSelecionaAtorActionPerformed

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
            java.util.logging.Logger.getLogger(CadAtorFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAtorFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAtorFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAtorFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAtorFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSelecionaAtor;
    private javax.swing.JButton btVincular;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox<String> comboFilme;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
