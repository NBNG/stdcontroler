package Interfaces;

import DAO.ClienteDAO;
import Modelo.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Cadastro_Cliente extends javax.swing.JInternalFrame {

    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "RG", "Endereço", "Telefone", "Celular", "Nascimento"});
    List<Cliente> clientes;
    ListSelectionModel lsmCliente;

    public Cadastro_Cliente() throws ParseException {
        initComponents();
        getContentPane().setBackground(Color.white);
        MaskFormatter maskCel = new MaskFormatter("(##) #####-####");
        MaskFormatter maskTel = new MaskFormatter("(##) ####-####");
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        maskTel.install(jFTTelefone);
        maskCel.install(jFTCel);
        maskCPF.install(jFTCPF);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDCNascimento = new com.toedter.calendar.JDateChooser();
        jLNumero = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLRua = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLCidade = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jTCidade = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTRua = new javax.swing.JTextField();
        jLemail = new javax.swing.JLabel();
        jLRG = new javax.swing.JLabel();
        jBCadastro = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jFTRG = new javax.swing.JFormattedTextField();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jBEditar = new javax.swing.JButton();
        jTemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        jTNomePesquisa = new javax.swing.JTextField();
        jBLimpar = new javax.swing.JButton();
        jLCliente = new javax.swing.JLabel();
        jFTCel = new javax.swing.JFormattedTextField();
        jLCelular = new javax.swing.JLabel();

        setClosable(true);

        jDCNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Nº:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRua.setText("Rua:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLemail.setText("E-mail:");

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jBCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastro.setText("Salvar");
        jBCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroActionPerformed(evt);
            }
        });

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLCabecalho.setText("Controle de Clientes");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Nascimento:");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jTemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TabelaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaCliente.setModel(tmCliente);
        TabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCliente);

        jTNomePesquisa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNomePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomePesquisaActionPerformed(evt);
            }
        });
        jTNomePesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomePesquisaKeyTyped(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jFTCel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLNumero)
                                .addGap(18, 18, 18)
                                .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCelular)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTCel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCPF)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLRG)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLemail)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLRua)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLData)
                                            .addGap(18, 18, 18)
                                            .addComponent(jDCNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLTelefone)
                                            .addGap(18, 18, 18)
                                            .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLNome)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLBairro)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLCidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jBCadastro)
                        .addGap(31, 31, 31)
                        .addComponent(jBEditar)
                        .addGap(31, 31, 31)
                        .addComponent(jBLimpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jTNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLCabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastro, jBEditar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNome)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLTelefone)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLData, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFTCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCelular))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCPF)
                            .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRG)
                            .addComponent(jFTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLemail))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLRua)
                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLBairro)
                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCidade)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCadastro)
                            .addComponent(jBEditar)
                            .addComponent(jBLimpar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCliente))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNome(jTNome.getText());
        cliente.setTelefone(jFTTelefone.getText());
        cliente.setCelular(jFTCel.getText());
        cliente.setCpf(jFTCPF.getText());
        cliente.setRg(jFTRG.getText());
        cliente.setEmail(jTemail.getText());
        cliente.setRua(jTRua.getText());
        cliente.setNumero(jTNumero.getText());
        cliente.setBairro(jTBairro.getText());
        cliente.setCidade(jTCidade.getText());
        cliente.setNascimento(jDCNascimento.getDate());
        try {
            ClienteDAO dao = new ClienteDAO();
            dao.adicionar(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBCadastroActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (TabelaCliente.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro a ser alterado.");
        } else {
            if (jDCNascimento.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Por favor, repreencher a data de nascimento.");
            } else {
                Cliente cliente = new Cliente();
                cliente.setNome(jTNome.getText());
                cliente.setTelefone(jFTTelefone.getText());
                cliente.setCelular(jFTCel.getText());
                cliente.setCpf(jFTCPF.getText());
                cliente.setRg(jFTRG.getText());
                cliente.setEmail(jTemail.getText());
                cliente.setRua(jTRua.getText());
                cliente.setNumero(jTNumero.getText());
                cliente.setBairro(jTBairro.getText());
                cliente.setCidade(jTCidade.getText());
                cliente.setNascimento(jDCNascimento.getDate());
                cliente.setId(clientes.get(TabelaCliente.getSelectedRow()).getId());
                try {
                    ClienteDAO dao = new ClienteDAO();
                    dao.alterar(cliente);
                    JOptionPane.showMessageDialog(null, "Edição efetuada com Sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
                }
            }
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void TabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMouseClicked
        jTNome.setText(clientes.get(TabelaCliente.getSelectedRow()).getNome());
        jFTTelefone.setText(clientes.get(TabelaCliente.getSelectedRow()).getTelefone());
        jFTCel.setText(clientes.get(TabelaCliente.getSelectedRow()).getCelular());
        jFTCPF.setText(clientes.get(TabelaCliente.getSelectedRow()).getCpf());
        jFTRG.setText(clientes.get(TabelaCliente.getSelectedRow()).getRg());
        jTemail.setText(clientes.get(TabelaCliente.getSelectedRow()).getEmail());
        jTRua.setText(clientes.get(TabelaCliente.getSelectedRow()).getRua());
        jTNumero.setText(clientes.get(TabelaCliente.getSelectedRow()).getNumero());
        jTBairro.setText(clientes.get(TabelaCliente.getSelectedRow()).getBairro());
        jTCidade.setText(clientes.get(TabelaCliente.getSelectedRow()).getCidade());
        jDCNascimento.setDate(clientes.get(TabelaCliente.getSelectedRow()).getNascimento());
    }//GEN-LAST:event_TabelaClienteMouseClicked

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTNome.setText("");
        jFTCPF.setText("");
        jFTRG.setText("");
        jFTTelefone.setText("");
        jFTCel.setText("");
        jTemail.setText("");
        jTRua.setText("");
        jTNumero.setText("");
        jTBairro.setText("");
        jTCidade.setText("");
        jDCNascimento.setDate(null);
        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jTNomePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomePesquisaActionPerformed
        try {
            ClienteDAO dao = new ClienteDAO();
            clientes = dao.listar("%" + jTNomePesquisa.getText() + "%");
            String endereco;


            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {
                endereco = clientes.get(i).getRua() + " " + clientes.get(i).getNumero() + ", " + clientes.get(i).getBairro() + " - " + clientes.get(i).getCidade();
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getRg(), i, 1);
                tmCliente.setValueAt(endereco, i, 2);
                tmCliente.setValueAt(clientes.get(i).getTelefone(), i, 3);
                tmCliente.setValueAt(clientes.get(i).getCelular(), i, 4);
                tmCliente.setValueAt(formatData(clientes.get(i).getNascimento()), i, 5);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jTNomePesquisaActionPerformed

    private void jTNomePesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomePesquisaKeyTyped
        try {
            ClienteDAO dao = new ClienteDAO();
            clientes = dao.listar("%" + jTNomePesquisa.getText() + "%");
            String endereco;


            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {
                endereco = clientes.get(i).getRua() + " " + clientes.get(i).getNumero() + ", " + clientes.get(i).getBairro() + " - " + clientes.get(i).getCidade();
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getRg(), i, 1);
                tmCliente.setValueAt(endereco, i, 2);
                tmCliente.setValueAt(clientes.get(i).getTelefone(), i, 3);
                tmCliente.setValueAt(clientes.get(i).getCelular(), i, 4);
                tmCliente.setValueAt(formatData(clientes.get(i).getNascimento()), i, 5);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jTNomePesquisaKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JButton jBCadastro;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBLimpar;
    private com.toedter.calendar.JDateChooser jDCNascimento;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JFormattedTextField jFTCel;
    private javax.swing.JFormattedTextField jFTRG;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLemail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNomePesquisa;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRua;
    private javax.swing.JTextField jTemail;
    // End of variables declaration//GEN-END:variables

    public static String formatData(java.util.Date d) {
        String aux, aux2 = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        if (mes < 10) {
            aux = "0" + String.valueOf(mes);
        } else {
            aux = String.valueOf(mes);
        }
        if (dia < 10) {
            aux2 = "0" + String.valueOf(dia);
        } else {
            aux2 = String.valueOf(dia);
        }
        String sData = aux2 + "/" + aux + "/" + String.valueOf(ano);
        return sData;
    }
}
