package Interfaces;

import DAO.FuncionarioDAO;
import DAO.MovimentacaoDAO;
import Filter.NameDocumentFilter;
import Modelo.Movimentacao;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class Saida_Caixa extends javax.swing.JInternalFrame {

    List<String> tatuadorNomes;
    int i;
    FuncionarioDAO tdao;

    public Saida_Caixa() {
        initComponents();
        getContentPane().setBackground(Color.white);
        jLDesc.setVisible(false);
        jCBDesc.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLValorSaida = new javax.swing.JLabel();
        jCBTipoSaida = new javax.swing.JComboBox();
        jLDataSaida = new javax.swing.JLabel();
        jCSaida = new com.toedter.calendar.JCalendar();
        jLTipoSaida = new javax.swing.JLabel();
        jLDesc = new javax.swing.JLabel();
        jCBDesc = new javax.swing.JComboBox();
        jTOBS = new javax.swing.JTextField();
        jLOBS = new javax.swing.JLabel();
        jFTValor = new javax.swing.JFormattedTextField();
        jLCabSaida = new javax.swing.JLabel();
        jBEfetuar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(613, 219));

        jLValorSaida.setText("Valor:");

        jCBTipoSaida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pagamento Tatuadores e Funcionários", "Compra de Materiais", "Pagamento de Contas", "Pagamento de Fornecedores", "Pagamento de Patrocínio", "Pagamento Outros..." }));
        jCBTipoSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoSaidaActionPerformed(evt);
            }
        });

        jLDataSaida.setText("Data:");

        jCSaida.setBackground(new java.awt.Color(153, 153, 153));

        jLTipoSaida.setText("Tipo:");

        jLDesc.setText("Descrição:");

        jLOBS.setText("OBS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLOBS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLValorSaida)
                                    .addComponent(jLTipoSaida)
                                    .addComponent(jLDesc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCBTipoSaida, 0, 279, Short.MAX_VALUE)
                                        .addComponent(jCBDesc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jFTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLDataSaida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jCSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorSaida)
                            .addComponent(jFTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBTipoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTipoSaida))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDesc)
                            .addComponent(jCBDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDataSaida)
                            .addComponent(jCSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTOBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLOBS))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jLCabSaida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCabSaida.setText("Efetuar saída de valor no caixa");

        jBEfetuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBEfetuar.setText("Salvar");
        jBEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEfetuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEfetuar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCabSaida)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLCabSaida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jBEfetuar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTipoSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoSaidaActionPerformed
        String aux = (String) jCBTipoSaida.getSelectedItem();
        if (aux.equals("Pagamento Tatuadores e Funcionários")) {
            jCBDesc.removeAllItems();
            jLDesc.setVisible(true);
            jCBDesc.setVisible(true);
            i = 0;
            tdao = new FuncionarioDAO();
            tatuadorNomes = tdao.listarNomes();

            while (i < tatuadorNomes.size()) {
                jCBDesc.addItem(tatuadorNomes.get(i));
                i++;
            }


        } else if (aux.equals("Compra de Materiais")) {
            jLDesc.setVisible(true);
            jCBDesc.setVisible(true);
            jCBDesc.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Alimentos", "Limpeza", "Camisetas", "Escritório", "Piercings", "Crédito para Celular", "Outros..."}));
        } else {
            jLDesc.setVisible(false);
            jCBDesc.setVisible(false);
        }
    }//GEN-LAST:event_jCBTipoSaidaActionPerformed

    private void jBEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEfetuarActionPerformed
        MovimentacaoDAO mdao = new MovimentacaoDAO();
        Movimentacao movimentacao = new Movimentacao();

        movimentacao.setTipo("S");
        String aux1, aux2;
        aux1 = (String) jCBTipoSaida.getSelectedItem();

        if (jCBDesc.isVisible() == true) {
            aux2 = (String) jCBDesc.getSelectedItem();
        } else {
            aux2 = "";
        }
        String desc = aux1 + " " + aux2;
        movimentacao.setDescricao(desc);
        movimentacao.setData(jCSaida.getDate());
        movimentacao.setValor(Double.parseDouble(jFTValor.getText()));
        movimentacao.setObs(jTOBS.getText());

        mdao.adicionar(movimentacao);

        JOptionPane.showMessageDialog(null, "Saída Cadastrada com Sucesso!");
    }//GEN-LAST:event_jBEfetuarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEfetuar;
    private javax.swing.JComboBox jCBDesc;
    private javax.swing.JComboBox jCBTipoSaida;
    private com.toedter.calendar.JCalendar jCSaida;
    private javax.swing.JFormattedTextField jFTValor;
    private javax.swing.JLabel jLCabSaida;
    private javax.swing.JLabel jLDataSaida;
    private javax.swing.JLabel jLDesc;
    private javax.swing.JLabel jLOBS;
    private javax.swing.JLabel jLTipoSaida;
    private javax.swing.JLabel jLValorSaida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTOBS;
    // End of variables declaration//GEN-END:variables
}
