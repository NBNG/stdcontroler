package Interfaces;

import DAO.FuncionarioDAO;

import Modelo.Funcionario;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Altera_Funcionario extends javax.swing.JInternalFrame {

    String login;
    String senha;

    public Altera_Funcionario(String l, String s) {
        super("Alteração de senha");
        login = l;
        senha = s;
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLUsu = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLNovaSenha = new javax.swing.JLabel();
        jButAlt = new javax.swing.JButton();
        jTUsu = new javax.swing.JTextField();
        jPSenha = new javax.swing.JPasswordField();
        jPNovaSenha = new javax.swing.JPasswordField();

        setClosable(true);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Alteração de Cadastro:"));

        jLUsu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLUsu.setText("Usuário:");

        jLSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSenha.setText("Senha:");

        jLNovaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNovaSenha.setText("Nova Senha:");

        jButAlt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jButAlt.setText("Salvar");
        jButAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAltActionPerformed(evt);
            }
        });

        jTUsu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPNovaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButAlt)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLUsu)
                                .addComponent(jLNovaSenha))
                            .addComponent(jLSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPNovaSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsu))
                .addGap(20, 20, 20)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNovaSenha)
                    .addComponent(jPNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButAlt)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAltActionPerformed
        if (senha.equals(jPSenha.getText()) && login.equals(jTUsu.getText())) {
            try {
                FuncionarioDAO dao = new FuncionarioDAO();
                dao.altera(jTUsu.getText(), jPNovaSenha.getText());
                JOptionPane.showMessageDialog(null, "Senha alterada!");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuáro ou Senha inválidos, favor preencher corretamente!");
        }



    }//GEN-LAST:event_jButAltActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAlt;
    private javax.swing.JLabel jLNovaSenha;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLUsu;
    private javax.swing.JPasswordField jPNovaSenha;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTUsu;
    // End of variables declaration//GEN-END:variables
}
