package Interfaces;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import DAO.SessaoDAO;
import Filter.Filters;
import Modelo.Cliente;
import Modelo.Funcionario;
import Modelo.Sessao;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author user
 */
public class Agendar_Sessao extends javax.swing.JInternalFrame {

    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "RG", "CPF"});
    List<Cliente> clientes;
    ListSelectionModel lsmCliente;
    List<String> clienteNomes;
    List<String> tatuadorNomes;
    int i;
    Filters filter = new Filters();

    public Agendar_Sessao() throws ParseException {
        initComponents();
        try {
            getContentPane().setBackground(Color.white);
            MaskFormatter maskData = new MaskFormatter("##:##:00");
            maskData.install(jFTHora);

            i = 0;
            FuncionarioDAO tdao = new FuncionarioDAO();
            tatuadorNomes = tdao.listarTatuador();
            while (i < tatuadorNomes.size()) {
                jCBTatuador.addItem(tatuadorNomes.get(i));
                i++;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + pe);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBTatuador = new javax.swing.JComboBox();
        jTNome = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLValor = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jLEntrada = new javax.swing.JLabel();
        jLHora = new javax.swing.JLabel();
        jCBStatus = new javax.swing.JComboBox();
        jCBRetoque = new javax.swing.JCheckBox();
        jBCadastrar = new javax.swing.JButton();
        jDCData = new com.toedter.calendar.JDateChooser();
        jFTHora = new javax.swing.JFormattedTextField();
        jFTValor = new javax.swing.JFormattedTextField();
        jFTEntrada = new javax.swing.JFormattedTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Agendar Sessão");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tatuador:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cliente:");

        jCBTatuador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmCliente);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor.setText("Valor:");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data:");

        jLStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLStatus.setText("Status:");

        jLEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEntrada.setText("Entrada:");

        jLHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLHora.setText("Hora:");

        jCBStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Em andamento", "Finalizada" }));

        jCBRetoque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBRetoque.setText("Retoque");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Salvar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLValor)
                                        .addGap(3, 3, 3))
                                    .addComponent(jLHora, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFTHora, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jLEntrada))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLData))))
                                    .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBRetoque)
                                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBCadastrar)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jCBTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLEntrada)
                                .addComponent(jFTEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLValor)
                                .addComponent(jFTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLHora)
                            .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFTHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLData)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBRetoque)
                    .addComponent(jLStatus)
                    .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBCadastrar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed

        Sessao sessao = new Sessao();
        if (jCBRetoque.isSelected()) {
            sessao.setRetoque("Retocada");
        } else {
            sessao.setRetoque(" ");
        }
        //instanciando objeto sessao para seu preenchimento
        Cliente cliente = new Cliente();
        cliente.setId(clientes.get(tabela.getSelectedRow()).getId());
        sessao.setCliente(cliente);
        sessao.setValor(filter.format(jFTValor.getText()));
        sessao.setTipo((String) jCBStatus.getSelectedItem());
        //if responsavel por não dar erro se o sinal não for efetuado
        if (jFTEntrada.getText().equals("")) {
            sessao.setSinal(0.00);
        } else {
            sessao.setSinal(filter.format(jFTEntrada.getText()));
        }
        //formatacao de string para date  (hora)
        sessao.setData(jDCData.getDate());
        sessao.setHora(jFTHora.getText());
        //banco de dados sendo chamado
        try {
            FuncionarioDAO tdao = new FuncionarioDAO();
            SessaoDAO sdao = new SessaoDAO();
            //utilizando o nome do tatuador para pegar seu id no banco e utilizado na tabela sesssao
            //como chave primaria
            Funcionario funcionario = new Funcionario();
            funcionario.setId(tdao.pegarFuncionario((String) jCBTatuador.getSelectedItem()));
            sessao.setFuncionario(funcionario);
            sdao.adicionar(sessao);
            JOptionPane.showMessageDialog(null, "Sessão Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            ClienteDAO dao = new ClienteDAO();
            clientes = dao.listar("%" + jTNome.getText() + "%");


            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {

                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getRg(), i, 1);
                tmCliente.setValueAt(clientes.get(i).getCpf(), i, 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jTNome.setText(clientes.get(tabela.getSelectedRow()).getNome());
    }//GEN-LAST:event_tabelaMouseClicked

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        try {
            ClienteDAO dao = new ClienteDAO();
            clientes = dao.listar("%" + jTNome.getText() + "%");


            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {

                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getRg(), i, 1);
                tmCliente.setValueAt(clientes.get(i).getCpf(), i, 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jTNomeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JCheckBox jCBRetoque;
    private javax.swing.JComboBox jCBStatus;
    private javax.swing.JComboBox jCBTatuador;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JFormattedTextField jFTEntrada;
    private javax.swing.JFormattedTextField jFTHora;
    private javax.swing.JFormattedTextField jFTValor;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLEntrada;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
