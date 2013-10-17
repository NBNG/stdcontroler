package Interfaces;

import DAO.SessaoDAO;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Altera_Descricao extends javax.swing.JFrame {

    Integer id;

    public Altera_Descricao(Integer id) {
        this.id = id;
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        jTADesc.setText("Local da Tatuagem: \n"
                + "Tintas utilizadas: ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTADesc = new javax.swing.JTextArea();
        jBConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTADesc.setColumns(20);
        jTADesc.setRows(5);
        jScrollPane1.setViewportView(jTADesc);

        jBConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBConcluir.setText("Salvar");
        jBConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBConcluir)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBConcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConcluirActionPerformed

        try {
            SessaoDAO sdao = new SessaoDAO();
            sdao.alteraDescricao(jTADesc.getText(), id);
            JOptionPane.showMessageDialog(null, "Sessão alterada com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBConcluirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADesc;
    // End of variables declaration//GEN-END:variables
}
