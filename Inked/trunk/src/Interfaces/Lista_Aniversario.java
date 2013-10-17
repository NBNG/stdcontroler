package Interfaces;

import DAO.ClienteDAO;
import Modelo.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Lista_Aniversario extends javax.swing.JInternalFrame {

    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "CPF", "Endereço", "email", "Nascimento"});
    List<Cliente> clientes;
    ListSelectionModel lsmCliente;

    public Lista_Aniversario() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNiver = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jRBHoje = new javax.swing.JRadioButton();
        jRBMes = new javax.swing.JRadioButton();

        setClosable(true);

        jLNiver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLNiver.setText("Aniversariantes");

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmCliente);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jRBHoje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBHoje.setText("Hoje");
        jRBHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBHojeActionPerformed(evt);
            }
        });

        jRBMes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBMes.setText("Mês");
        jRBMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBHoje)
                            .addComponent(jRBMes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLNiver)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLNiver)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRBHoje)
                        .addGap(18, 18, 18)
                        .addComponent(jRBMes)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBHojeActionPerformed
        if (jRBHoje.isSelected()) {
            jRBMes.setSelected(false);
        }

        try {

            ClienteDAO cdao = new ClienteDAO();
            clientes = cdao.listarCurrent();
            String endereco;

            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {
                endereco = clientes.get(i).getRua() + " " + clientes.get(i).getNumero() + ", " + clientes.get(i).getBairro() + " - " + clientes.get(i).getCidade();
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getCpf(), i, 1);
                tmCliente.setValueAt(endereco, i, 2);
                tmCliente.setValueAt(clientes.get(i).getEmail(), i, 3);
                tmCliente.setValueAt(formatData(clientes.get(i).getNascimento()), i, 4);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jRBHojeActionPerformed

    private void jRBMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMesActionPerformed
        if (jRBMes.isSelected()) {
            jRBHoje.setSelected(false);
        }
        try {

            ClienteDAO cdao = new ClienteDAO();
            clientes = cdao.listarMesCurrent();
            String endereco;


            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {
                endereco = clientes.get(i).getRua() + " " + clientes.get(i).getNumero() + ", " + clientes.get(i).getBairro() + " - " + clientes.get(i).getCidade();
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getCpf(), i, 1);
                tmCliente.setValueAt(endereco, i, 2);
                tmCliente.setValueAt(clientes.get(i).getEmail(), i, 3);
                tmCliente.setValueAt(formatData(clientes.get(i).getNascimento()), i, 4);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jRBMesActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
    }//GEN-LAST:event_tabelaMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLNiver;
    private javax.swing.JRadioButton jRBHoje;
    private javax.swing.JRadioButton jRBMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
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
