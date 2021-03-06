package Interfaces;

import DAO.FuncionarioDAO;
import DAO.MovimentacaoDAO;
import DAO.ParcelaDAO;
import Filter.Filters;
import Modelo.Movimentacao;
import Modelo.Parcela;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class Entrada_Caixa extends javax.swing.JInternalFrame {

    List<String> tatuadorNomes;
    MovimentacaoDAO dao;
    int i;
    Filters filters = new Filters();

    public Entrada_Caixa() throws SQLException {
        initComponents();

        try {
            jCBTatuador.setVisible(false);
            jLTatuador.setVisible(false);
            jLQuant.setVisible(false);
            jTQnt.setVisible(false);
            jCBParcela.setVisible(false);
            jLParcela.setVisible(false);

            int i = 0;
            dao = new MovimentacaoDAO();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPEntrada = new javax.swing.JPanel();
        jLValorEntrada = new javax.swing.JLabel();
        jLTipoEntrada = new javax.swing.JLabel();
        jCEntrada = new com.toedter.calendar.JCalendar();
        jCBTipoEntrada = new javax.swing.JComboBox();
        jLTatuador = new javax.swing.JLabel();
        jCBTatuador = new javax.swing.JComboBox();
        jCBDebito = new javax.swing.JCheckBox();
        jCBCredito = new javax.swing.JCheckBox();
        jCBParcela = new javax.swing.JComboBox();
        jLParcela = new javax.swing.JLabel();
        jLQuant = new javax.swing.JLabel();
        jTQnt = new javax.swing.JTextField();
        jLOBS = new javax.swing.JLabel();
        jTOBS = new javax.swing.JTextField();
        jFTValorEntrada = new javax.swing.JFormattedTextField();
        jBEfetuar = new javax.swing.JButton();
        jLCabEntrada = new javax.swing.JLabel();

        setClosable(true);

        jPEntrada.setBackground(new java.awt.Color(255, 255, 255));
        jPEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPEntrada.setForeground(new java.awt.Color(153, 153, 153));

        jLValorEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValorEntrada.setText("Valor:");

        jLTipoEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipoEntrada.setText("Tipo:");

        jCEntrada.setBackground(new java.awt.Color(153, 153, 153));
        jCEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBTipoEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipoEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tatuagem", "Camisetas", "Piercings", "Alargadores", "Pomada", "Sinal", "Ingresso", "Outros..." }));
        jCBTipoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoEntradaActionPerformed(evt);
            }
        });

        jLTatuador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTatuador.setText("Tatuadores:");

        jCBTatuador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBDebito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBDebito.setText("Cartão Débito");
        jCBDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDebitoActionPerformed(evt);
            }
        });

        jCBCredito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBCredito.setText("Cartão Crédito");
        jCBCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCreditoActionPerformed(evt);
            }
        });

        jCBParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBParcela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLParcela.setText("Parcelas:");

        jLQuant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuant.setText("Quantidade:");

        jTQnt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLOBS.setText("OBS:");

        jTOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTValorEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFTValorEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTValorEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEntradaLayout = new javax.swing.GroupLayout(jPEntrada);
        jPEntrada.setLayout(jPEntradaLayout);
        jPEntradaLayout.setHorizontalGroup(
            jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEntradaLayout.createSequentialGroup()
                .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEntradaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEntradaLayout.createSequentialGroup()
                                .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPEntradaLayout.createSequentialGroup()
                                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLValorEntrada)
                                            .addComponent(jLTipoEntrada))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFTValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addComponent(jLQuant)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPEntradaLayout.createSequentialGroup()
                                        .addComponent(jLTatuador)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jCEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEntradaLayout.createSequentialGroup()
                                .addComponent(jCBDebito)
                                .addGap(53, 53, 53)
                                .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBCredito)
                                    .addGroup(jPEntradaLayout.createSequentialGroup()
                                        .addComponent(jLParcela)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPEntradaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLOBS)
                        .addGap(18, 18, 18)
                        .addComponent(jTOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPEntradaLayout.setVerticalGroup(
            jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEntradaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEntradaLayout.createSequentialGroup()
                        .addComponent(jCEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTOBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLOBS))
                        .addGap(32, 32, 32))
                    .addGroup(jPEntradaLayout.createSequentialGroup()
                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBDebito)
                            .addComponent(jCBCredito))
                        .addGap(34, 34, 34)
                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorEntrada)
                            .addComponent(jLParcela)
                            .addComponent(jCBParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTipoEntrada)
                            .addComponent(jLQuant)
                            .addComponent(jTQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTatuador)
                            .addComponent(jCBTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jBEfetuar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBEfetuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBEfetuar.setText("Salvar");
        jBEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEfetuarActionPerformed(evt);
            }
        });

        jLCabEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabEntrada.setText("Efetuar entrada de valor no caixa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabEntrada)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBEfetuar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLCabEntrada)
                .addGap(18, 18, 18)
                .addComponent(jPEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jBEfetuar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEfetuarActionPerformed
        try {
            if (jCBCredito.isSelected()) {
                double Vpar = 0;
                Parcela parcela = new Parcela();
                Calendar cal = Calendar.getInstance();
                ParcelaDAO pdao = new ParcelaDAO();
                Double valorEntrada = filters.format(jFTValorEntrada.getText());
                int aux = Integer.parseInt((String) jCBParcela.getSelectedItem());
                if (!jTQnt.getText().equals("")) {
                    Vpar = (valorEntrada * Double.parseDouble(jTQnt.getText())) / aux;
                } else {
                    Vpar = valorEntrada / aux;
                }
                parcela.setId(pdao.PegarId());
                parcela.setTipo("Crédito");
                int id = parcela.getId();
                for (int i = 1; i <= aux; i++) {
                    parcela.setParcela(i);
                    parcela.setValor(Vpar);

                    cal.setTime(jCEntrada.getDate());
                    cal.add(Calendar.MONTH, i);
                    parcela.setDataPagamento(cal.getTime());
                    parcela.setDataCompra(jCEntrada.getDate());
                    parcela.setStatus("Pendente");
                    String aux1, aux2;
                    aux1 = (String) jCBTipoEntrada.getSelectedItem();
                    if (jCBTatuador.isVisible() == true) {
                        aux2 = (String) jCBTatuador.getSelectedItem();
                    } else {
                        aux2 = "";
                    }
                    parcela.setDesc(aux1 + " " + aux2);
                    parcela.setObs(jTOBS.getText());
                    parcela.setId(id);


                    pdao.adicionar(parcela);
                }
                JOptionPane.showMessageDialog(null, "Venda Cadastrada com Sucesso!");
            } else if (jCBDebito.isSelected()) {
                Parcela parcela = new Parcela();
                Calendar cal = Calendar.getInstance();
                ParcelaDAO pdao = new ParcelaDAO();
                Double valorEntrada = filters.format(jFTValorEntrada.getText());
                if (!jTQnt.getText().equals("")) {
                    parcela.setValor(valorEntrada * Double.parseDouble(jTQnt.getText()));
                } else {
                    parcela.setValor(valorEntrada);
                }
                parcela.setId(pdao.PegarId());
                parcela.setParcela(1);
                parcela.setDataCompra(jCEntrada.getDate());
                parcela.setTipo("Débito");

                cal.setTime(jCEntrada.getDate());
                cal.add(Calendar.DAY_OF_MONTH, 1);
                parcela.setDataPagamento(cal.getTime());
                String aux1, aux2;
                aux1 = (String) jCBTipoEntrada.getSelectedItem();
                if (jCBTatuador.isVisible() == true) {
                    aux2 = (String) jCBTatuador.getSelectedItem();
                } else {
                    aux2 = "";
                }
                parcela.setDesc(aux1 + " " + aux2);
                parcela.setObs(jTOBS.getText());
                parcela.setStatus("Pendente");
                pdao.adicionar(parcela);
                JOptionPane.showMessageDialog(null, "Venda Cadastrada com Sucesso!");

            } else {
                Movimentacao mov = new Movimentacao();
                mov.setTipo("E");
                String aux1, aux2;
                aux1 = (String) jCBTipoEntrada.getSelectedItem();
                if (jCBTatuador.isVisible() == true) {
                    aux2 = (String) jCBTatuador.getSelectedItem();
                } else {
                    aux2 = "";
                }
                mov.setDescricao(aux1 + " " + aux2);

                mov.setData(jCEntrada.getDate());
                mov.setObs(jTOBS.getText());
                Double valorEntrada = filters.format(jFTValorEntrada.getText());
                if (jTQnt.getText().equals("")) {
                    mov.setValor(valorEntrada);
                } else {
                    mov.setValor(valorEntrada * Double.parseDouble(jTQnt.getText()));
                }
                dao.adicionar(mov);
                JOptionPane.showMessageDialog(null, "Venda Cadastrada com Sucesso!");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBEfetuarActionPerformed

    private void jCBTipoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoEntradaActionPerformed
        String aux = (String) jCBTipoEntrada.getSelectedItem();

        if ((aux.equals("Tatuagem")) || aux.equals("Sinal")) {
            jCBTatuador.setVisible(true);
            jLTatuador.setVisible(true);
            jLQuant.setVisible(false);
            jTQnt.setVisible(false);
        } else {
            jTQnt.setVisible(true);
            jLQuant.setVisible(true);
            jCBTatuador.setVisible(false);
            jLTatuador.setVisible(false);
            jTQnt.setText("1");
        }
    }//GEN-LAST:event_jCBTipoEntradaActionPerformed

    private void jCBCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCreditoActionPerformed
        if (jCBCredito.isSelected()) {
            jCBParcela.setVisible(true);
            jLParcela.setVisible(true);
            jCBDebito.setSelected(false);
        } else {
            jCBParcela.setVisible(false);
            jLParcela.setVisible(false);
        }
    }//GEN-LAST:event_jCBCreditoActionPerformed

    private void jCBDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDebitoActionPerformed
        jCBCredito.setSelected(false);
        jLParcela.setVisible(false);
        jCBParcela.setVisible(false);
    }//GEN-LAST:event_jCBDebitoActionPerformed

    private void jFTValorEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTValorEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTValorEntradaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEfetuar;
    private javax.swing.JCheckBox jCBCredito;
    private javax.swing.JCheckBox jCBDebito;
    private javax.swing.JComboBox jCBParcela;
    private javax.swing.JComboBox jCBTatuador;
    private javax.swing.JComboBox jCBTipoEntrada;
    private com.toedter.calendar.JCalendar jCEntrada;
    private javax.swing.JFormattedTextField jFTValorEntrada;
    private javax.swing.JLabel jLCabEntrada;
    private javax.swing.JLabel jLOBS;
    private javax.swing.JLabel jLParcela;
    private javax.swing.JLabel jLQuant;
    private javax.swing.JLabel jLTatuador;
    private javax.swing.JLabel jLTipoEntrada;
    private javax.swing.JLabel jLValorEntrada;
    private javax.swing.JPanel jPEntrada;
    private javax.swing.JTextField jTOBS;
    private javax.swing.JTextField jTQnt;
    // End of variables declaration//GEN-END:variables
}
