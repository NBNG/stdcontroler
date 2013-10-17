package Interfaces;

import DAO.FuncionarioDAO;
import DAO.MovimentacaoDAO;
import Modelo.Movimentacao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Pesquisa_Total_Entrada extends javax.swing.JInternalFrame {

    List<String> tatuadorNomes;

    public Pesquisa_Total_Entrada() {
        initComponents();
        try {
            jCBTatuador.setVisible(false);
            jLTatuador.setVisible((false));
            getContentPane().setBackground(Color.white);
            int i = 0;

            getContentPane().setBackground(Color.white);
            i = 0;
            FuncionarioDAO tdao = new FuncionarioDAO();
            tatuadorNomes = tdao.listarTatuador();
            while (i < tatuadorNomes.size()) {
                jCBTatuador.addItem(tatuadorNomes.get(i));
                i++;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }
    DefaultTableModel tmEntrada = new DefaultTableModel(null, new String[]{"Data", "Descrição", "Valor",});
    List<Movimentacao> moviE;
    ListSelectionModel lsmEntrada;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLTotal = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jLTipoEntrada = new javax.swing.JLabel();
        jLTatuador = new javax.swing.JLabel();
        jCBTipoEntrada = new javax.swing.JComboBox();
        jCBTatuador = new javax.swing.JComboBox();
        jBPesquisar = new javax.swing.JButton();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLCabecalho.setText("Pesquisa de Entrada do Caixa");

        Tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tabela.setModel(tmEntrada);
        jScrollPane1.setViewportView(Tabela);

        jLTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLTotal.setText("Total:");

        jTFTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLTipoEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipoEntrada.setText("Tipo:");

        jLTatuador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTatuador.setText("Tatuadores:");

        jCBTipoEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipoEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tatuagem", "Camisetas", "Piercings", "Alargadores", "Pomada", "Sinal", "Ingresso", "Outros..." }));
        jCBTipoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoEntradaActionPerformed(evt);
            }
        });

        jCBTatuador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLCabecalho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLTipoEntrada)
                                    .addComponent(jLTatuador))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCBTipoEntrada, 0, 239, Short.MAX_VALUE)
                                    .addComponent(jCBTatuador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jBPesquisar)
                                .addGap(45, 45, 45)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLCabecalho)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoEntrada)
                    .addComponent(jCBTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTatuador)
                    .addComponent(jCBTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTotal))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTipoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoEntradaActionPerformed
        String aux = (String) jCBTipoEntrada.getSelectedItem();

        if ((aux.equals("Tatuagem")) || aux.equals("Sinal")) {
            jCBTatuador.setVisible(true);
            jLTatuador.setVisible(true);
        } else {
            jCBTatuador.setVisible(false);
            jLTatuador.setVisible(false);
        }
    }//GEN-LAST:event_jCBTipoEntradaActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        String aux1, aux2;
        aux1 = (String) jCBTipoEntrada.getSelectedItem();

        if (jCBTatuador.isVisible() == true) {
            aux2 = (String) jCBTatuador.getSelectedItem();
        } else {
            aux2 = "";
        }
        MovimentacaoDAO mdao = new MovimentacaoDAO();
        moviE = mdao.listarEntradaTotal(aux1 + " " + aux2);
        while (tmEntrada.getRowCount() > 0) {
            tmEntrada.removeRow(0);
        }
        String[] linha = new String[]{null, null, null, null};

        for (int i = 0; i < moviE.size(); i++) {

            tmEntrada.addRow(linha);
            tmEntrada.setValueAt(formatData(moviE.get(i).getData()), i, 0);
            tmEntrada.setValueAt(moviE.get(i).getDescricao(), i, 1);
            tmEntrada.setValueAt(format(moviE.get(i).getValor()), i, 2);

        }
        jTFTotal.setText(format(mdao.listarEntradaResul(aux1 + " " + aux2)));

    }//GEN-LAST:event_jBPesquisarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox jCBTatuador;
    private javax.swing.JComboBox jCBTipoEntrada;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLTatuador;
    private javax.swing.JLabel jLTipoEntrada;
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
