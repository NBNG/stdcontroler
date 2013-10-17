package Interfaces;

import DAO.ClienteDAO;
import DAO.ParcelaDAO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Feed_Aniversario extends javax.swing.JInternalFrame {

    public Feed_Aniversario() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFeedAniversario = new javax.swing.JLabel();
        jLFeedParcelas = new javax.swing.JLabel();

        setClosable(true);

        jLFeedAniversario.setText("aniversario");
        try {

            ClienteDAO cdao = new ClienteDAO();
            if (!cdao.pegaAniversario().equals("0")){
                jLFeedAniversario.setText("Hoje temos " + (cdao.pegaAniversario()) + " aniversariante(s)!");
            }else{
                jLFeedAniversario.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Lista_Aniversario.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLFeedParcelas.setText("parcelas");
        try {

            ParcelaDAO pdao = new ParcelaDAO();
            if (!pdao.contarParcelas().equals("0")){
                jLFeedParcelas.setText("Há " + (pdao.contarParcelas()) + " parcela(s) a receber!");
            }else{
                jLFeedParcelas.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Lista_Aniversario.class.getName()).log(Level.SEVERE, null, ex);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFeedAniversario)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLFeedParcelas)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLFeedAniversario)
                .addGap(31, 31, 31)
                .addComponent(jLFeedParcelas)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLFeedAniversario;
    private javax.swing.JLabel jLFeedParcelas;
    // End of variables declaration//GEN-END:variables
}
