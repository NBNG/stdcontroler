package Interfaces;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import DAO.SessaoDAO;
import XML.Termo_Consentimento;
import Modelo.Sessao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

public class Listagem_Sessao extends javax.swing.JInternalFrame {
    
    List<String> tatuadorNomes;
    int i;
    
    public Listagem_Sessao() throws SQLException {
        initComponents();
        getContentPane().setBackground(Color.white);
        i = 0;
        FuncionarioDAO tdao = new FuncionarioDAO();
        tatuadorNomes = tdao.listarTatuador();
        while (i < tatuadorNomes.size()) {
            jCBTatuador.addItem(tatuadorNomes.get(i));
            i++;
        }
    }
    DefaultTableModel tmSessao = new DefaultTableModel(null, new String[]{"Cliente", "Tatuador", "Valor", "Entrada", "Restante", "Dia", "Hora", "Status", "Retoque"});
    List<Sessao> sessoes;
    ListSelectionModel lsmSessao;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTCPF = new javax.swing.JTextField();
        jRBAtual = new javax.swing.JRadioButton();
        jRBCliente = new javax.swing.JRadioButton();
        jRBDesejado = new javax.swing.JRadioButton();
        jDCDesejada = new com.toedter.calendar.JDateChooser();
        jBFinalizar = new javax.swing.JButton();
        jRBTatuador = new javax.swing.JRadioButton();
        jCBTatuador = new javax.swing.JComboBox();
        jBVer = new javax.swing.JButton();
        jDCDesejadaTat = new com.toedter.calendar.JDateChooser();
        jBImprimir = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();

        setClosable(true);

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmSessao);
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listagem de Sessões");

        jTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCPFActionPerformed(evt);
            }
        });

        jRBAtual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBAtual.setText("Por dia Atual");
        jRBAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAtualActionPerformed(evt);
            }
        });

        jRBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBCliente.setText("Por Cliente (CPF)");
        jRBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBClienteActionPerformed(evt);
            }
        });

        jRBDesejado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBDesejado.setText("Por dia Desejado");
        jRBDesejado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDesejadoActionPerformed(evt);
            }
        });

        jDCDesejada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBFinalizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jBFinalizar.setText("Flinalizar Sessão");
        jBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarActionPerformed(evt);
            }
        });

        jRBTatuador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBTatuador.setText("Por Tatuador");
        jRBTatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTatuadorActionPerformed(evt);
            }
        });

        jCBTatuador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTatuador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBTatuadorItemStateChanged(evt);
            }
        });

        jBVer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBVer.setText("Ver Descrição");
        jBVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerActionPerformed(evt);
            }
        });

        jDCDesejadaTat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDCDesejadaTat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCDesejadaTatPropertyChange(evt);
            }
        });

        jBImprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imprimir.png"))); // NOI18N
        jBImprimir.setText("Imprimir Termo");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.gif"))); // NOI18N
        jBExcluir.setText("Excluir Sessão");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBDesejado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDCDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jRBAtual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBTatuador)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jDCDesejadaTat, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBVer)
                        .addGap(32, 32, 32)
                        .addComponent(jBFinalizar)))
                .addGap(35, 35, 35)
                .addComponent(jBExcluir)
                .addGap(34, 34, 34)
                .addComponent(jBImprimir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBFinalizar, jBVer});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBExcluir, jBImprimir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBAtual)
                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBCliente))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDCDesejada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBDesejado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDCDesejadaTat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBTatuador)
                        .addComponent(jCBTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFinalizar)
                    .addComponent(jBVer)
                    .addComponent(jBImprimir)
                    .addComponent(jBExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarActionPerformed
        Altera_Descricao alt = new Altera_Descricao(sessoes.get(tabela.getSelectedRow()).getCodigo());
        alt.setVisible(true);
    }//GEN-LAST:event_jBFinalizarActionPerformed
    
    private void jRBAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAtualActionPerformed
        if (jRBAtual.isSelected() == true) {
            jRBDesejado.setSelected(false);
            jRBCliente.setSelected(false);
            jRBTatuador.setSelected(false);
        }
        
        try {
            
            SessaoDAO sdao = new SessaoDAO();
            sessoes = sdao.listarCurrent();
            while (tmSessao.getRowCount() > 0) {
                tmSessao.removeRow(0);
            }
            
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < sessoes.size(); i++) {
                tmSessao.addRow(linha);
                tmSessao.setValueAt(sessoes.get(i).getCliente().getNome(), i, 0);
                tmSessao.setValueAt(sessoes.get(i).getFuncionario().getId(), i, 1);
                tmSessao.setValueAt(format(sessoes.get(i).getValor()), i, 2);
                tmSessao.setValueAt(format(sessoes.get(i).getSinal()), i, 3);
                tmSessao.setValueAt(format(sessoes.get(i).getRestante()), i, 4);
                tmSessao.setValueAt(formatData(sessoes.get(i).getData()), i, 5);
                tmSessao.setValueAt(sessoes.get(i).getHora(), i, 6);
                tmSessao.setValueAt(sessoes.get(i).getTipo(), i, 7);
                tmSessao.setValueAt(sessoes.get(i).getRetoque(), i, 8);
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jRBAtualActionPerformed
    
    private void jRBDesejadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDesejadoActionPerformed
        if (jDCDesejada.getDate() != null) {
            
            if (jRBDesejado.isSelected() == true) {
                jRBAtual.setSelected(false);
                jRBCliente.setSelected(false);
                jRBTatuador.setSelected(false);
            }
            try {
                ClienteDAO cdao = new ClienteDAO();
                FuncionarioDAO tdao = new FuncionarioDAO();
                SessaoDAO sdao = new SessaoDAO();
                
                Calendar cal = Calendar.getInstance();
                cal.setTime(new Date(jDCDesejada.getDate().getTime()));
                int ano = cal.get(Calendar.YEAR);
                int mes = cal.get(Calendar.MONTH) + 1;
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                String sData = String.valueOf(ano) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia);
                
                sessoes = sdao.listarData(jDCDesejada.getDate());
                while (tmSessao.getRowCount() > 0) {
                    tmSessao.removeRow(0);
                }
                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < sessoes.size(); i++) {
                    tmSessao.addRow(linha);
                    tmSessao.setValueAt(sessoes.get(i).getCliente().getNome(), i, 0);
                    tmSessao.setValueAt(sessoes.get(i).getFuncionario().getNome(), i, 1);
                    tmSessao.setValueAt(format(sessoes.get(i).getValor()), i, 2);
                    tmSessao.setValueAt(format(sessoes.get(i).getSinal()), i, 3);
                    tmSessao.setValueAt(format(sessoes.get(i).getRestante()), i, 4);
                    tmSessao.setValueAt(formatData(sessoes.get(i).getData()), i, 5);
                    tmSessao.setValueAt(sessoes.get(i).getHora(), i, 6);
                    tmSessao.setValueAt(sessoes.get(i).getTipo(), i, 7);
                    tmSessao.setValueAt(sessoes.get(i).getRetoque(), i, 8);
                    
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        } else {
            jRBDesejado.setSelected(false);
            JOptionPane.showMessageDialog(null, "Favor, preencher a data desejada.");
        }
        jRBDesejado.setSelected(false);
    }//GEN-LAST:event_jRBDesejadoActionPerformed
    
    private void jRBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBClienteActionPerformed
        
        if (jRBCliente.isSelected() == true) {
            jRBDesejado.setSelected(false);
            jRBAtual.setSelected(false);
            jRBTatuador.setSelected(false);
        }
        
        try {
            
            ClienteDAO cdao = new ClienteDAO();
            FuncionarioDAO tdao = new FuncionarioDAO();
            SessaoDAO sdao = new SessaoDAO();
            ;
            sessoes = sdao.listarCliente(jTCPF.getText());
            
            while (tmSessao.getRowCount() > 0) {
                tmSessao.removeRow(0);
            }
            
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < sessoes.size(); i++) {
                tmSessao.addRow(linha);
                tmSessao.setValueAt(sessoes.get(i).getCliente().getNome(), i, 0);
                tmSessao.setValueAt(sessoes.get(i).getFuncionario().getNome(), i, 1);
                tmSessao.setValueAt(format(sessoes.get(i).getValor()), i, 2);
                tmSessao.setValueAt(format(sessoes.get(i).getSinal()), i, 3);
                tmSessao.setValueAt(format(sessoes.get(i).getRestante()), i, 4);
                tmSessao.setValueAt(formatData(sessoes.get(i).getData()), i, 5);
                tmSessao.setValueAt(sessoes.get(i).getHora(), i, 6);
                tmSessao.setValueAt(sessoes.get(i).getTipo(), i, 7);
                tmSessao.setValueAt(sessoes.get(i).getRetoque(), i, 8);
                
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jRBClienteActionPerformed
    
    private void jRBTatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTatuadorActionPerformed
        if (jRBTatuador.isSelected() == true) {
            jRBDesejado.setSelected(false);
            jRBCliente.setSelected(false);
            jRBAtual.setSelected(false);
            try {
                
                SessaoDAO sdao = new SessaoDAO();
                if (jDCDesejadaTat.getDate() == null) {
                    sessoes = sdao.listarTatuador((String) jCBTatuador.getSelectedItem());
                } else {
                    sessoes = sdao.listarTatuadorData((String) jCBTatuador.getSelectedItem(), jDCDesejadaTat.getDate());
                }
                
                while (tmSessao.getRowCount() > 0) {
                    tmSessao.removeRow(0);
                }
                
                String[] linha = new String[]{null, null, null, null};
                
                for (int i = 0; i < sessoes.size(); i++) {
                    
                    tmSessao.addRow(linha);
                    tmSessao.setValueAt(sessoes.get(i).getCliente().getNome(), i, 0);
                    tmSessao.setValueAt(sessoes.get(i).getFuncionario().getNome(), i, 1);
                    tmSessao.setValueAt(format(sessoes.get(i).getValor()), i, 2);
                    tmSessao.setValueAt(format(sessoes.get(i).getSinal()), i, 3);
                    tmSessao.setValueAt(format(sessoes.get(i).getRestante()), i, 4);
                    tmSessao.setValueAt(formatData(sessoes.get(i).getData()), i, 5);
                    tmSessao.setValueAt(sessoes.get(i).getHora(), i, 6);
                    tmSessao.setValueAt(sessoes.get(i).getTipo(), i, 7);
                    tmSessao.setValueAt(sessoes.get(i).getRetoque(), i, 8);
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        }
    }//GEN-LAST:event_jRBTatuadorActionPerformed
    
    private void jBVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerActionPerformed
        
        try {
            Pesquisa_Descricao pd;
            pd = new Pesquisa_Descricao(sessoes.get(tabela.getSelectedRow()).getCodigo());
            pd.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
        
    }//GEN-LAST:event_jBVerActionPerformed
    
    private void jTCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCPFActionPerformed
    
    private void jCBTatuadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBTatuadorItemStateChanged
        jRBTatuador.setSelected(false);
    }//GEN-LAST:event_jCBTatuadorItemStateChanged
    
    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        
        String caminho = "C:\\Inked\\Termo\\report7.jrxml";
        String id = String.valueOf(sessoes.get(tabela.getSelectedRow()).getCliente().getId());
        
        
        Termo_Consentimento term = new Termo_Consentimento();
        
        try {
            
            
            term.gerar(sessoes.get(tabela.getSelectedRow()).getCliente().getId());
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        } catch (SQLException ex) {
            Logger.getLogger(Listagem_Sessao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBImprimirActionPerformed
    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int pergunta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta sessão?\n");
        if (pergunta == 0) {//clicou em sim  
            try {
                SessaoDAO sdao = new SessaoDAO();
                sdao.remover(sessoes.get(tabela.getSelectedRow()).getCodigo());
                JOptionPane.showMessageDialog(null, "Sessão deletada com sucesso.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        } else if (pergunta == 1) {//clicou em nao  
        }
    }//GEN-LAST:event_jBExcluirActionPerformed
    
    private void jDCDesejadaTatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCDesejadaTatPropertyChange
        jRBTatuador.setSelected(false);
    }//GEN-LAST:event_jDCDesejadaTatPropertyChange
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFinalizar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBVer;
    private javax.swing.JComboBox jCBTatuador;
    private com.toedter.calendar.JDateChooser jDCDesejada;
    private com.toedter.calendar.JDateChooser jDCDesejadaTat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBAtual;
    private javax.swing.JRadioButton jRBCliente;
    private javax.swing.JRadioButton jRBDesejado;
    private javax.swing.JRadioButton jRBTatuador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTable tabela;
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
