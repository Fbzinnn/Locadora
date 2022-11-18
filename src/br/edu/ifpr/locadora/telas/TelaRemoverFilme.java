/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.locadora.telas;

import br.edu.ifpr.locadora.DAOs.FilmeDAO;
import br.edu.ifpr.locadora.entities.Filme;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fabri
 */
public class TelaRemoverFilme extends javax.swing.JFrame {

    /**
     * Creates new form TelaRemoverFilme
     */
    public TelaRemoverFilme() throws SQLException {
        initComponents();
        
        FilmeDAO dao = new FilmeDAO();
        ArrayList<Filme> filme = dao.selecionarFilme();
        
        for (int i = 0; i < filme.size(); i++) {
            cmbRemoverFilme.addItem(filme.get(i));
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

        lblSelecionarFilme = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblDataLancamento = new javax.swing.JLabel();
        lblAvaliacao = new javax.swing.JLabel();
        btnMenuAdm = new javax.swing.JButton();
        cmbRemoverFilme = new javax.swing.JComboBox<>();
        lblNomeFilme = new javax.swing.JLabel();
        lblGeneroFilme = new javax.swing.JLabel();
        lblDataLancamentoFilme = new javax.swing.JLabel();
        lblAvaliacoesFilme = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblPrecoFilme = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remover Filme");

        lblSelecionarFilme.setText("Selecionar Filme:");

        lblNome.setText("Nome:");

        lblGenero.setText("Gênero:");

        lblDataLancamento.setText("Data de Lançamento:");

        lblAvaliacao.setText("Avaliações:");

        btnMenuAdm.setText("Voltar");
        btnMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAdmActionPerformed(evt);
            }
        });

        cmbRemoverFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRemoverFilmeActionPerformed(evt);
            }
        });

        lblPreco.setText("Preço:");

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDataLancamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSelecionarFilme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAvaliacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbRemoverFilme, 0, 219, Short.MAX_VALUE)
                        .addComponent(lblNomeFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGeneroFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataLancamentoFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAvaliacoesFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecoFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnMenuAdm)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecionarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRemoverFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(lblGeneroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco)
                    .addComponent(lblPrecoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataLancamento)
                    .addComponent(lblDataLancamentoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvaliacao)
                    .addComponent(lblAvaliacoesFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnMenuAdm))
                .addGap(67, 67, 67))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Filme filmeSelect = (Filme) cmbRemoverFilme.getSelectedItem();
        
        FilmeDAO dao = new FilmeDAO();
        
        try {
            dao.removerFilme(filmeSelect);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRemoverFilme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Filme removido! ");
        
        MenuAdm tela = new MenuAdm();
        tela.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void cmbRemoverFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRemoverFilmeActionPerformed
        Filme filmeSelect = (Filme) cmbRemoverFilme.getSelectedItem();
        
        lblNomeFilme.setText(filmeSelect.getNome());
        lblGeneroFilme.setText(filmeSelect.getGenero());
        lblPrecoFilme.setText(String.valueOf("R$ " + filmeSelect.getPreco()));
        lblDataLancamento.setText(String.valueOf(filmeSelect.getData_lancamento()));
        lblAvaliacoesFilme.setText(String.valueOf(filmeSelect.getAvaliacao()));
    }//GEN-LAST:event_cmbRemoverFilmeActionPerformed

    private void btnMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAdmActionPerformed
        MenuAdm tela = new MenuAdm();
        tela.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuAdmActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRemoverFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaRemoverFilme().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRemoverFilme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuAdm;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<Filme> cmbRemoverFilme;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblAvaliacoesFilme;
    private javax.swing.JLabel lblDataLancamento;
    private javax.swing.JLabel lblDataLancamentoFilme;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroFilme;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeFilme;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblPrecoFilme;
    private javax.swing.JLabel lblSelecionarFilme;
    // End of variables declaration//GEN-END:variables
}
