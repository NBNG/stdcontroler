package Interfaces;

import DAO.MovimentacaoDAO;
import Modelo.Movimentacao;
import java.awt.Color;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Pesquisa_Fluxo_Caixa extends javax.swing.JInternalFrame {

    DefaultTableModel tmSaida = new DefaultTableModel(null, new String[]{"Data", "Descrição", "Valor",});
    DefaultTableModel tmEntrada = new DefaultTableModel(null, new String[]{"Data", "Descrição", "Valor",});
    List<Movimentacao> moviE, moviS;
    ListSelectionModel lsmFluxo;

    public Pesquisa_Fluxo_Caixa() {
        initComponents();
        getContentPane().setBackground(Color.white);
        MovimentacaoDAO mdao = new MovimentacaoDAO();
        jLTotal.setText(format(mdao.listarCaixa()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLEntrada = new javax.swing.JLabel();
        jLSaida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaEntrada = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaSaida = new javax.swing.JTable();
        jRBAtual = new javax.swing.JRadioButton();
        jRBDesejado = new javax.swing.JRadioButton();
        jDCInicio = new com.toedter.calendar.JDateChooser();
        jDCFim = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLLucro = new javax.swing.JLabel();
        jTLucro = new javax.swing.JTextField();
        jLLucro1 = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();

        setClosable(true);

        jLEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLEntrada.setText("Entrada");

        jLSaida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLSaida.setText("Saida");

        TabelaEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaEntrada.setModel(tmEntrada);
        jScrollPane1.setViewportView(TabelaEntrada);

        TabelaSaida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaSaida.setModel(tmSaida);
        jScrollPane2.setViewportView(TabelaSaida);

        jRBAtual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBAtual.setText("Dia Atual");
        jRBAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAtualActionPerformed(evt);
            }
        });

        jRBDesejado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBDesejado.setText("Pesquisar vários dias");
        jRBDesejado.setActionCommand("Pesquisar intervalos de dias");
        jRBDesejado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDesejadoActionPerformed(evt);
            }
        });

        jDCInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDCFim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Término");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Início");

        jLLucro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLLucro.setText("Lucro do Período:");

        jTLucro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLLucro1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLLucro1.setText("Total em Caixa:");

        jLTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 594, Short.MAX_VALUE)
                .addComponent(jLSaida)
                .addGap(270, 270, 270))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBAtual)
                            .addComponent(jRBDesejado))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDCFim, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLLucro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTotal)
                        .addGap(29, 29, 29)
                        .addComponent(jLLucro)
                        .addGap(18, 18, 18)
                        .addComponent(jTLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRBDesejado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEntrada)
                            .addComponent(jLSaida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLLucro1)
                                    .addComponent(jLTotal)
                                    .addComponent(jLLucro)
                                    .addComponent(jRBAtual)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jDCFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBDesejadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDesejadoActionPerformed
        if (jRBDesejado.isSelected() == true) {
            jRBAtual.setSelected(false);
        }
        if ((jDCInicio.getDate() == null) || (jDCFim.getDate() == null)) {
            jRBDesejado.setSelected(false);
            JOptionPane.showMessageDialog(null, "Por favor, preencher as datas necessárias para pesquisa!");
        } else {
            MovimentacaoDAO mdao = new MovimentacaoDAO();
            moviS = mdao.listarSaidaDesejada(jDCInicio.getDate(), jDCFim.getDate());
            moviE = mdao.listarEntradaDesejada(jDCInicio.getDate(), jDCFim.getDate());

            while (tmSaida.getRowCount() > 0) {
                tmSaida.removeRow(0);
            }
            while (tmEntrada.getRowCount() > 0) {
                tmEntrada.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < moviS.size(); i++) {

                tmSaida.addRow(linha);
                tmSaida.setValueAt(formatData(moviS.get(i).getData()), i, 0);
                tmSaida.setValueAt(moviS.get(i).getDescricao(), i, 1);
                tmSaida.setValueAt(format(moviS.get(i).getValor()), i, 2);

            }

            for (int i = 0; i < moviE.size(); i++) {

                tmEntrada.addRow(linha);
                tmEntrada.setValueAt(formatData(moviE.get(i).getData()), i, 0);
                tmEntrada.setValueAt(moviE.get(i).getDescricao(), i, 1);
                tmEntrada.setValueAt(format(moviE.get(i).getValor()), i, 2);

            }

            jTLucro.setText(format(mdao.listarLucroIntevaloDias(jDCInicio.getDate(), jDCFim.getDate())));
        }
    }//GEN-LAST:event_jRBDesejadoActionPerformed

    private void jRBAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtualActionPerformed
        if (jRBAtual.isSelected() == true) {
            jRBDesejado.setSelected(false);
        }
        moviS = null;
        moviE = null;

        MovimentacaoDAO mdao = new MovimentacaoDAO();
        moviS = mdao.listarSaida();
        moviE = mdao.listarEntrada();

        while (tmSaida.getRowCount() > 0) {
            tmSaida.removeRow(0);
        }
        while (tmEntrada.getRowCount() > 0) {
            tmEntrada.removeRow(0);
        }

        String[] linha = new String[]{null, null, null, null};
        for (int i = 0; i < moviS.size(); i++) {

            tmSaida.addRow(linha);
            tmSaida.setValueAt(formatData(moviS.get(i).getData()), i, 0);
            tmSaida.setValueAt(moviS.get(i).getDescricao(), i, 1);
            tmSaida.setValueAt(format(moviS.get(i).getValor()), i, 2);

        }

        for (int i = 0; i < moviE.size(); i++) {

            tmEntrada.addRow(linha);
            tmEntrada.setValueAt(formatData(moviE.get(i).getData()), i, 0);
            tmEntrada.setValueAt(moviE.get(i).getDescricao(), i, 1);
            tmEntrada.setValueAt(format(moviE.get(i).getValor()), i, 2);

        }
        jTLucro.setText(format(mdao.listarLucro()));



    }//GEN-LAST:event_jRBAtualActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaEntrada;
    private javax.swing.JTable TabelaSaida;
    private com.toedter.calendar.JDateChooser jDCFim;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private javax.swing.JLabel jLEntrada;
    private javax.swing.JLabel jLLucro;
    private javax.swing.JLabel jLLucro1;
    private javax.swing.JLabel jLSaida;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBAtual;
    private javax.swing.JRadioButton jRBDesejado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTLucro;
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
