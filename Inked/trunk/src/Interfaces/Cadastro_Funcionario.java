package Interfaces;

import DAO.FuncionarioDAO;
import Modelo.Funcionario;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Cadastro_Funcionario extends javax.swing.JInternalFrame {

    DefaultTableModel tmTatuador = new DefaultTableModel(null, new String[]{"Nome", "Endereço", "Telefone", "Cargo"});
    List<Funcionario> tatuadores;
    ListSelectionModel lsmTatuador;

    public Cadastro_Funcionario() throws ParseException {
        initComponents();
        MaskFormatter maskData = new MaskFormatter("(##) ####-####");
        MaskFormatter maskTel = new MaskFormatter("(##) ####-####");
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        maskTel.install(jTTelefone);
        maskCPF.install(jFTCPF);
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRua = new javax.swing.JLabel();
        jBPesquisar = new javax.swing.JButton();
        jLCidade = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();
        jTRua = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jTCidade = new javax.swing.JTextField();
        jLBairro = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jTTelefone = new javax.swing.JFormattedTextField();
        jBLimpar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLLogin = new javax.swing.JLabel();
        jTLogin = new javax.swing.JTextField();
        jLCargo = new javax.swing.JLabel();
        jCBCargo = new javax.swing.JComboBox();
        jBZerarSenha = new javax.swing.JButton();
        jLRG = new javax.swing.JLabel();
        jTRg = new javax.swing.JTextField();
        jLCPF = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();

        setClosable(true);

        jLRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRua.setText("Rua:");

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Salvar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Nº:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Dados do Funcionário");

        jBEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmTatuador);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogin.setText("Login:");

        jTLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCargo.setText("Cargo:");

        jCBCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerente", "Recepcionista", "Tatuador" }));

        jBZerarSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBZerarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jBZerarSenha.setText("Zerar Senha");
        jBZerarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZerarSenhaActionPerformed(evt);
            }
        });

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jTRg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLRua)
                            .addComponent(jLBairro)
                            .addComponent(jLTelefone)
                            .addComponent(jLRG)
                            .addComponent(jLNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLCidade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLNumero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTNumero))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTRg)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLCPF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTNome))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLCargo)
                                    .addComponent(jLLogin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTLogin)
                                    .addComponent(jCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)))
                        .addComponent(jBZerarSenha)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jBCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jBEditar)
                .addGap(18, 18, 18)
                .addComponent(jBPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBEditar, jBLimpar, jBPesquisar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLNome)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLRG)
                                        .addComponent(jTRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCPF))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLLogin)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCargo)
                                    .addComponent(jCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLRua)
                            .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumero)
                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLBairro)
                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCidade)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTelefone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jBZerarSenha)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jBCadastrar)
                    .addComponent(jBEditar)
                    .addComponent(jBLimpar))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        String endereco = jTRua.getText() + " " + jTNumero.getText() + "," + jTBairro.getText()
                + " - " + jTCidade.getText();


        Funcionario t = new Funcionario();
        t.setNome(jTNome.getText());
        t.setTelefone(jTTelefone.getText());
        t.setCpf(jFTCPF.getText());
        t.setRg(jTRg.getText());
        t.setRua(jTRua.getText());
        t.setNumero(jTNumero.getText());
        t.setBairro(jTBairro.getText());
        t.setCidade(jTCidade.getText());
        t.setCargo((String) jCBCargo.getSelectedItem());
        t.setLogin(jTLogin.getText());
        t.setSenha("123");
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.adicionar(t);
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            tatuadores = dao.getLista("%" + jTNome.getText() + "%");
            String endereco;



            while (tmTatuador.getRowCount() > 0) {
                tmTatuador.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < tatuadores.size(); i++) {
                endereco = tatuadores.get(i).getRua() + " " + tatuadores.get(i).getNumero() + ", " + tatuadores.get(i).getBairro() + " - " + tatuadores.get(i).getCidade();
                tmTatuador.addRow(linha);
                tmTatuador.setValueAt(tatuadores.get(i).getNome(), i, 0);
                tmTatuador.setValueAt(endereco, i, 1);
                tmTatuador.setValueAt(tatuadores.get(i).getTelefone(), i, 2);
                tmTatuador.setValueAt(tatuadores.get(i).getCargo(), i, 3);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }



    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jTNome.setText(tatuadores.get(tabela.getSelectedRow()).getNome());
        jTRua.setText(tatuadores.get(tabela.getSelectedRow()).getRua());
        jFTCPF.setText(tatuadores.get(tabela.getSelectedRow()).getCpf());
        jTRg.setText(tatuadores.get(tabela.getSelectedRow()).getRg());
        jTNumero.setText(tatuadores.get(tabela.getSelectedRow()).getNumero());
        jTBairro.setText(tatuadores.get(tabela.getSelectedRow()).getBairro());
        jTCidade.setText(tatuadores.get(tabela.getSelectedRow()).getCidade());
        jTTelefone.setText(tatuadores.get(tabela.getSelectedRow()).getTelefone());
        jTLogin.setText(tatuadores.get(tabela.getSelectedRow()).getLogin());
    }//GEN-LAST:event_tabelaMouseClicked

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed

        while (tmTatuador.getRowCount() > 0) {
            tmTatuador.removeRow(0);
        }
        jTNome.setText("");
        jTRua.setText("");
        jTNumero.setText("");
        jFTCPF.setText("");
        jTRg.setText("");
        jTBairro.setText("");
        jTCidade.setText("");
        jTTelefone.setText("");
        jTLogin.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        Funcionario t = new Funcionario();
        t.setNome(jTNome.getText());
        t.setCpf(jFTCPF.getText());
        t.setRg(jTRg.getText());
        t.setRua(jTRua.getText());
        t.setNumero(jTNumero.getText());
        t.setBairro(jTBairro.getText());
        t.setCidade(jTCidade.getText());
        t.setTelefone(jTTelefone.getText());
        t.setCargo((String) jCBCargo.getSelectedItem());
        t.setLogin(jTLogin.getText());
        t.setId(tatuadores.get(tabela.getSelectedRow()).getId());
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.alterar(t);
            JOptionPane.showMessageDialog(null, "Edição Efetuada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBZerarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZerarSenhaActionPerformed
        try {
            FuncionarioDAO fdao = new FuncionarioDAO();
            fdao.zerarSenha(tatuadores.get(tabela.getSelectedRow()).getId());
            JOptionPane.showMessageDialog(null, "Senha Zerada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jBZerarSenhaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBZerarSenha;
    private javax.swing.JComboBox jCBCargo;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCargo;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTLogin;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRg;
    private javax.swing.JTextField jTRua;
    private javax.swing.JFormattedTextField jTTelefone;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
