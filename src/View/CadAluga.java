/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.DAO_DVD;
import DAO.DAO_Emprestimo;
import DAO.DAO_Filmes;
import DAO.DAO_Usuario;
import Model.DVD;
import Model.Emprestimo;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class CadAluga extends javax.swing.JFrame {

    /**
     * Creates new form CadAluga
     */
    public CadAluga() {
        initComponents();
        comboUsuarios();
    }
    
    String codigoGlobal;
    
    public void resgate(String codigoDVD) {
        codigoGlobal = codigoDVD;
        campoDvd.setText(codigoDVD);
    }
    
    private void comboUsuarios() {
        DAO.DAO_Usuario objUsuario = new DAO_Usuario();
        ResultSet lista = objUsuario.listaUsuarioAluga();
        
        try {
            while(lista.next()) {
                comboUser.addItem(lista.getString(2));
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

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btAluga = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoDvd = new javax.swing.JTextField();
        btSelecionaAtor = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(25, 25, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DVD:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario:");

        btAluga.setBackground(new java.awt.Color(85, 0, 0));
        btAluga.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btAluga.setForeground(new java.awt.Color(255, 255, 255));
        btAluga.setText("Alugar");
        btAluga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlugaActionPerformed(evt);
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
        jLabel10.setText("Alugar DVD:");

        campoDvd.setEditable(false);

        btSelecionaAtor.setBackground(new java.awt.Color(85, 0, 0));
        btSelecionaAtor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btSelecionaAtor.setForeground(new java.awt.Color(255, 255, 255));
        btSelecionaAtor.setText("...");
        btSelecionaAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionaAtorActionPerformed(evt);
            }
        });

        comboUser.setBackground(new java.awt.Color(85, 0, 0));
        comboUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btAluga)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar))
                    .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(campoDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelecionaAtor)))
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(415, 415, 415))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoDvd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionaAtor))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAluga)
                    .addComponent(btCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlugaActionPerformed
        // TODO add your handling code here:
        String usuario = Integer.toString(comboUser.getSelectedIndex() + 1);
        String dvd  = campoDvd.getText();

        if(dvd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo não pode estar vazio!");
        } else {

            DAO.DAO_Emprestimo objAluga = new DAO_Emprestimo();
            Model.Emprestimo emp = new Emprestimo(dvd, usuario);
            
            DAO_DVD objDvd = new DAO_DVD();
            Model.DVD dvdModel = new DVD(dvd);

            try {
                objAluga.adiciona(emp);
                objDvd.aluga(dvdModel);
                System.out.println(dvd);
                campoDvd.setText("");
                comboUser.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "Alugado com sucesso!");

            } catch(HeadlessException error) {
                throw new RuntimeException(error.getMessage());
            }

        }

    }//GEN-LAST:event_btAlugaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
        ConsultaEmprestimo emp = new ConsultaEmprestimo();
        emp.setVisible(true);

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSelecionaAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionaAtorActionPerformed
        // TODO add your handling code here:
        ConsultaDvd consulta = new ConsultaDvd();
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
            java.util.logging.Logger.getLogger(CadAluga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAluga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAluga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAluga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAluga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAluga;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSelecionaAtor;
    private javax.swing.JTextField campoDvd;
    private javax.swing.JComboBox<String> comboUser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
