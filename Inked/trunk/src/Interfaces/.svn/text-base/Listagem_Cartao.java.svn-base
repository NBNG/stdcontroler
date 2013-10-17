package Interfaces;

import DAO.ParcelaDAO;
import Modelo.Parcela;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Listagem_Cartao extends javax.swing.JInternalFrame {

    public Listagem_Cartao() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }
    DefaultTableModel tmParcela = new DefaultTableModel(null, new String[]{"Código", "Parcela", "Valor", "Data da Compra", "Data de Pagamento", "Status", "Descrição", "Observação", "Tipo"});
    List<Parcela> parcelas;
    ListSelectionModel lsmParcela;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRBAtual = new javax.swing.JRadioButton();
        jRBDesejado = new javax.swing.JRadioButton();
        jRBTotal = new javax.swing.JRadioButton();
        jDCInicio = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        Tabela.setModel(tmParcela);
        jScrollPane1.setViewportView(Tabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Listagem de Parcelas - Cartão");

        jRBAtual.setText("Por dia Atual");
        jRBAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAtualActionPerformed(evt);
            }
        });

        jRBDesejado.setText("Por dia Desejado");
        jRBDesejado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDesejadoActionPerformed(evt);
            }
        });

        jRBTotal.setText("Todas as Parcelas");
        jRBTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBAtual)
                    .addComponent(jRBTotal)
                    .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBDesejado))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jRBTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jRBAtual)
                        .addGap(18, 18, 18)
                        .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRBDesejado)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtualActionPerformed
        if (jRBAtual.isSelected() == true) {
            jRBDesejado.setSelected(false);
            jRBTotal.setSelected(false);
        }
        try {
            ParcelaDAO pdao = new ParcelaDAO();
            parcelas = pdao.ListarCurrent();


            while (tmParcela.getRowCount() > 0) {
                tmParcela.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < parcelas.size(); i++) {
                tmParcela.addRow(linha);
                tmParcela.setValueAt(parcelas.get(i).getId(), i, 0);
                tmParcela.setValueAt(parcelas.get(i).getParcela(), i, 1);
                tmParcela.setValueAt(format(parcelas.get(i).getValor()), i, 2);
                tmParcela.setValueAt(formatData(parcelas.get(i).getDataCompra()), i, 3);
                tmParcela.setValueAt(formatData(parcelas.get(i).getDataPagamento()), i, 4);
                tmParcela.setValueAt(parcelas.get(i).getStatus(), i, 5);
                tmParcela.setValueAt(parcelas.get(i).getDesc(), i, 6);
                tmParcela.setValueAt(parcelas.get(i).getObs(), i, 7);
                tmParcela.setValueAt(parcelas.get(i).getTipo(), i, 8);


            }




        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jRBAtualActionPerformed

    private void jRBDesejadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDesejadoActionPerformed
        if (jRBDesejado.isSelected() == true) {
            jRBAtual.setSelected(false);
            jRBTotal.setSelected(false);
        }
        if (jDCInicio.getDate() == null) {
            jRBDesejado.setSelected(false);
            JOptionPane.showMessageDialog(null, "Por favor, preencher a data desejada.");

        } else {
            try {
                ParcelaDAO pdao = new ParcelaDAO();
                parcelas = pdao.ListarDataDesejada(jDCInicio.getDate());


                while (tmParcela.getRowCount() > 0) {
                    tmParcela.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < parcelas.size(); i++) {
                    tmParcela.addRow(linha);
                    tmParcela.setValueAt(parcelas.get(i).getId(), i, 0);
                    tmParcela.setValueAt(parcelas.get(i).getParcela(), i, 1);
                    tmParcela.setValueAt(format(parcelas.get(i).getValor()), i, 2);
                    tmParcela.setValueAt(formatData(parcelas.get(i).getDataCompra()), i, 3);
                    tmParcela.setValueAt(formatData(parcelas.get(i).getDataPagamento()), i, 4);
                    tmParcela.setValueAt(parcelas.get(i).getStatus(), i, 5);
                    tmParcela.setValueAt(parcelas.get(i).getDesc(), i, 6);
                    tmParcela.setValueAt(parcelas.get(i).getObs(), i, 7);
                    tmParcela.setValueAt(parcelas.get(i).getTipo(), i, 8);



                }




            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }

        }
    }//GEN-LAST:event_jRBDesejadoActionPerformed

    private void jRBTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTotalActionPerformed
        if (jRBTotal.isSelected() == true) {
            jRBAtual.setSelected(false);
            jRBDesejado.setSelected(false);
        }
        try {
            ParcelaDAO pdao = new ParcelaDAO();
            parcelas = pdao.ListarParcela();


            while (tmParcela.getRowCount() > 0) {
                tmParcela.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < parcelas.size(); i++) {
                tmParcela.addRow(linha);
                tmParcela.setValueAt(parcelas.get(i).getId(), i, 0);
                tmParcela.setValueAt(parcelas.get(i).getParcela(), i, 1);
                tmParcela.setValueAt(format(parcelas.get(i).getValor()), i, 2);
                tmParcela.setValueAt(formatData(parcelas.get(i).getDataCompra()), i, 3);
                tmParcela.setValueAt(formatData(parcelas.get(i).getDataPagamento()), i, 4);
                tmParcela.setValueAt(parcelas.get(i).getStatus(), i, 5);
                tmParcela.setValueAt(parcelas.get(i).getDesc(), i, 6);
                tmParcela.setValueAt(parcelas.get(i).getObs(), i, 7);
                tmParcela.setValueAt(parcelas.get(i).getTipo(), i, 8);



            }




        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }


    }//GEN-LAST:event_jRBTotalActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBAtual;
    private javax.swing.JRadioButton jRBDesejado;
    private javax.swing.JRadioButton jRBTotal;
    private javax.swing.JScrollPane jScrollPane1;
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
