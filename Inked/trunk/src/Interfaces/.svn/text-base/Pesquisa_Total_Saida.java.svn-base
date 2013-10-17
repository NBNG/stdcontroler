package Interfaces;

import DAO.FuncionarioDAO;
import DAO.MovimentacaoDAO;
import Modelo.Movimentacao;
import java.awt.Color;
import java.util.Calendar;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Pesquisa_Total_Saida extends javax.swing.JInternalFrame {

    List<String> tatuadorNomes;
    FuncionarioDAO tdao;
    int i = 0, size;

    public Pesquisa_Total_Saida() {
        initComponents();
        jLDesc.setVisible(false);
        jCBDesc.setVisible(false);

        getContentPane().setBackground(Color.white);

    }
    DefaultTableModel tmSaida = new DefaultTableModel(null, new String[]{"Data", "Descrição", "Valor",});
    List<Movimentacao> moviS;
    ListSelectionModel lsmSaida;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLTotal = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jLTipoSaida = new javax.swing.JLabel();
        jCBTipoSaida = new javax.swing.JComboBox();
        jLDesc = new javax.swing.JLabel();
        jCBDesc = new javax.swing.JComboBox();
        jBPesquisa = new javax.swing.JButton();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLCabecalho.setText("Pesquisa de Saída do Caixa");

        Tabela.setModel(tmSaida);
        jScrollPane1.setViewportView(Tabela);

        jLTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLTotal.setText("Total:");

        jTFTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLTipoSaida.setText("Tipo:");

        jCBTipoSaida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pagamento Tatuadores e Funcionários", "Compra de Materiais", "Pagamento de Contas", "Pagamento de Fornecedores", "Pagamento de Patrocínio", "Pagamento Outros..." }));
        jCBTipoSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoSaidaActionPerformed(evt);
            }
        });

        jLDesc.setText("Descrição:");

        jBPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisa.setText("Pesquisar");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLTipoSaida)
                                    .addComponent(jLDesc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCBTipoSaida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCBDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(jBPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLCabecalho)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBTipoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTipoSaida)
                            .addComponent(jBPesquisa))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDesc)
                            .addComponent(jCBDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTipoSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoSaidaActionPerformed
        String aux = (String) jCBTipoSaida.getSelectedItem();

        if (aux.equals("Pagamento Tatuadores e Funcionários")) {

            jLDesc.setVisible(true);
            jCBDesc.setVisible(true);

            i = 0;
            tdao = new FuncionarioDAO();
            tatuadorNomes = tdao.listarNomes();

            while (i < tatuadorNomes.size()) {
                jCBDesc.addItem(tatuadorNomes.get(i));
                i++;
            }

            /*for (int j = 0; j < tatuadorNomes.size(); j++) {
             jCBDesc.addItem(tatuadorNomes.get(j));
             }*/

        } else if (aux.equals("Compra de Materiais")) {
            jLDesc.setVisible(true);
            jCBDesc.setVisible(true);
            jCBDesc.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Alimentos", "Limpeza", "Camisetas", "Escritório", "Piercings", "Crédito para Celular", "Outros..."}));
        } else {
            jLDesc.setVisible(false);
            jCBDesc.setVisible(false);
        }
    }//GEN-LAST:event_jCBTipoSaidaActionPerformed

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        String aux1, aux2;
        aux1 = (String) jCBTipoSaida.getSelectedItem();

        if (jCBDesc.isVisible() == true) {
            aux2 = (String) jCBDesc.getSelectedItem();
        } else {
            aux2 = "";
        }
        MovimentacaoDAO mdao = new MovimentacaoDAO();
        moviS = mdao.listarSaidaTotal(aux1 + " " + aux2);

        while (tmSaida.getRowCount() > 0) {
            tmSaida.removeRow(0);
        }
        String[] linha = new String[]{null, null, null, null};
        for (int i = 0; i < moviS.size(); i++) {

            tmSaida.addRow(linha);
            tmSaida.setValueAt(formatData(moviS.get(i).getData()), i, 0);
            tmSaida.setValueAt(moviS.get(i).getDescricao(), i, 1);
            tmSaida.setValueAt(format(moviS.get(i).getValor()), i, 2);

        }
        jTFTotal.setText(format(mdao.listarSaidaResul(aux1 + " " + aux2)));

    }//GEN-LAST:event_jBPesquisaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JComboBox jCBDesc;
    private javax.swing.JComboBox jCBTipoSaida;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLDesc;
    private javax.swing.JLabel jLTipoSaida;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFTotal;
    // End of variables declaration//GEN-END:variables

    public static String format(double x) {
        return String.format("R$ %.2f", x);
    }

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
