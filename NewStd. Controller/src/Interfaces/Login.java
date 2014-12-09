package Interfaces;

import DAO.FuncionarioDAO;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*iuhiukj*/
public class Login extends javax.swing.JFrame {

    public Login() {
        super("St. Controller");
        this.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/icone.png")));
        jTLogin.setText("ADMIN");
        jTSenha.setText("ADMIN");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLogin = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jTLogin = new javax.swing.JTextField();
        jTSenha = new javax.swing.JPasswordField();
        jButCanc = new javax.swing.JButton();
        jButCon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.setForeground(new java.awt.Color(51, 153, 0));

        jLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLogin.setText("Login:");

        jLSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSenha.setText("Senha:");

        jTLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTLogin.setAutoscrolls(false);

        jTSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSenhaActionPerformed(evt);
            }
        });

        jButCanc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButCanc.setText("Cancelar");
        jButCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCancActionPerformed(evt);
            }
        });

        jButCon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButCon.setText("Conectar");
        jButCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLogin)
                    .addComponent(jLSenha))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jTSenha))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButCon)
                .addGap(18, 18, 18)
                .addComponent(jButCanc)
                .addGap(90, 90, 90))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin)
                    .addComponent(jTLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButCanc)
                    .addComponent(jButCon))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLImagem)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLImagem)
                .addGap(18, 18, 18)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButCancActionPerformed

    private void jButConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButConActionPerformed
        FuncionarioDAO fdao = new FuncionarioDAO();
        try {
            if (fdao.testaLogin(jTLogin.getText(), jTSenha.getText()) == true) {
                try {
                    Principal p = new Principal(jTLogin.getText(), jTSenha.getText());
                    p.setVisible(true);
                    setVisible(false);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha invalido!");
                jTSenha.setText(null);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jButConActionPerformed

    private void jTSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSenhaActionPerformed
        FuncionarioDAO fdao = new FuncionarioDAO();
        try {
            if (fdao.testaLogin(jTLogin.getText(), jTSenha.getText()) == true) {
                try {
                    Principal p = new Principal(jTLogin.getText(), jTSenha.getText());
                    p.setVisible(true);
                    setVisible(false);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha invalido!");
                jTSenha.setText(null);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jTSenhaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButCanc;
    private javax.swing.JButton jButCon;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLogin;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTLogin;
    private javax.swing.JPasswordField jTSenha;
    // End of variables declaration//GEN-END:variables
}
