package Interfaces;

import DAO.SessaoDAO;
import java.awt.Color;
import java.sql.SQLException;

public class Pesquisa_Descricao extends javax.swing.JFrame {

    Integer id;

    public Pesquisa_Descricao(Integer id) throws SQLException {
        this.id = id;
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        SessaoDAO sdao = new SessaoDAO();
        jTADesc.setText(sdao.getDescricao(id));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTADesc = new javax.swing.JTextArea();
        jLDesc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTADesc.setColumns(20);
        jTADesc.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTADesc.setRows(5);
        jScrollPane1.setViewportView(jTADesc);

        jLDesc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLDesc.setText("Descrição da Tatuagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLDesc)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLDesc)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLDesc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADesc;
    // End of variables declaration//GEN-END:variables
}
