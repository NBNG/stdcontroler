package Interfaces;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import DAO.ParcelaDAO;
import backup.Backup;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    ParcelaDAO pdao;
    ClienteDAO cdao;
    private String login, senha;

    public Principal(String l, String s) throws SQLException {
        super("St. Controller");
        
        senha = s;
        login = l;
        initComponents();
        pdao = new ParcelaDAO();
        pdao.listarPendente();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        cdao = new ClienteDAO();

        if (senha.equals("123")) {
            JOptionPane.showMessageDialog(null, "Por favor, altere sua senha para maior segurança!");
        }
        if ((!cdao.pegaAniversario().equals("0") || !pdao.contarParcelas().equals("0"))) {
            Feed_Aniversario fa = new Feed_Aniversario();
            jDesktopPane2.add(fa);
            fa.show();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jBarra = new javax.swing.JMenuBar();
        jMCaixa = new javax.swing.JMenu();
        jMIPesquisa = new javax.swing.JMenuItem();
        jMICartao = new javax.swing.JMenuItem();
        jMITotal = new javax.swing.JMenu();
        jTotalEntrada = new javax.swing.JMenuItem();
        jTotalSaida = new javax.swing.JMenuItem();
        jMMovi = new javax.swing.JMenu();
        jMIEntrada = new javax.swing.JMenuItem();
        jMISaida = new javax.swing.JMenuItem();
        jMCliente = new javax.swing.JMenu();
        jMICadastrar = new javax.swing.JMenuItem();
        jMIAniversario = new javax.swing.JMenuItem();
        jMTatuador = new javax.swing.JMenu();
        jMICadastrarTatuador = new javax.swing.JMenuItem();
        jMIAltSenha = new javax.swing.JMenuItem();
        jMAgenda = new javax.swing.JMenu();
        jMIAgendar = new javax.swing.JMenuItem();
        jMIListarSessao = new javax.swing.JMenuItem();
        jMArquivo = new javax.swing.JMenu();
        jMILogoff = new javax.swing.JMenuItem();
        jMIRealizar_Backup = new javax.swing.JMenuItem();
        try {
            FuncionarioDAO fdao = new FuncionarioDAO();
            if (fdao.confereTatuador(login, senha)) {
                jMMovi.setEnabled(false);
            }
            if (fdao.confere(login, senha) == false) {
                jMICartao.setEnabled(false);
                jMITotal.setEnabled(false);
                jMIPesquisa.setEnabled(false);
                jMICadastrarTatuador.setEnabled(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 1370, 680);
        jDesktopPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBarra.setBackground(new java.awt.Color(0, 0, 255));

        jMCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/maquina.png"))); // NOI18N
        jMCaixa.setText("Caixa");
        jMCaixa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPesquisa.setText("Pesquisa de Caixa");
        jMIPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisaActionPerformed(evt);
            }
        });
        jMCaixa.add(jMIPesquisa);

        jMICartao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICartao.setText("Cartão de Crédito - Listagem");
        jMICartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICartaoActionPerformed(evt);
            }
        });
        jMCaixa.add(jMICartao);

        jMITotal.setText("Totais do Mês Atual");
        jMITotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTotalEntrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTotalEntrada.setText("Entrada");
        jTotalEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalEntradaActionPerformed(evt);
            }
        });
        jMITotal.add(jTotalEntrada);

        jTotalSaida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTotalSaida.setText("Saída");
        jTotalSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalSaidaActionPerformed(evt);
            }
        });
        jMITotal.add(jTotalSaida);

        jMCaixa.add(jMITotal);

        jMMovi.setText("Movimentação");
        jMMovi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIEntrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIEntrada.setText("Entrada");
        jMIEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEntradaActionPerformed(evt);
            }
        });
        jMMovi.add(jMIEntrada);

        jMISaida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMISaida.setText("Saída");
        jMISaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISaidaActionPerformed(evt);
            }
        });
        jMMovi.add(jMISaida);

        jMCaixa.add(jMMovi);

        jBarra.add(jMCaixa);

        jMCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        jMCliente.setText("Cliente");
        jMCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastrar.setText("Cadastrar Cliente");
        jMICadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarActionPerformed(evt);
            }
        });
        jMCliente.add(jMICadastrar);

        jMIAniversario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIAniversario.setText("Aniversariantes");
        jMIAniversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAniversarioActionPerformed(evt);
            }
        });
        jMCliente.add(jMIAniversario);

        jBarra.add(jMCliente);

        jMTatuador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario.png"))); // NOI18N
        jMTatuador.setText("Funcionário");
        jMTatuador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastrarTatuador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastrarTatuador.setText("Cadastrar Funcionário");
        jMICadastrarTatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarTatuadorActionPerformed(evt);
            }
        });
        jMTatuador.add(jMICadastrarTatuador);

        jMIAltSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIAltSenha.setText("Alterar Senha");
        jMIAltSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAltSenhaActionPerformed(evt);
            }
        });
        jMTatuador.add(jMIAltSenha);

        jBarra.add(jMTatuador);

        jMAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agenda.png"))); // NOI18N
        jMAgenda.setText("Agenda");
        jMAgenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIAgendar.setText("Agendar Sessão");
        jMIAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAgendarActionPerformed(evt);
            }
        });
        jMAgenda.add(jMIAgendar);

        jMIListarSessao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIListarSessao.setText("Listar Sessões");
        jMIListarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListarSessaoActionPerformed(evt);
            }
        });
        jMAgenda.add(jMIListarSessao);

        jBarra.add(jMAgenda);

        jMArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arquivo.png"))); // NOI18N
        jMArquivo.setText("Arquivo");
        jMArquivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMArquivoActionPerformed(evt);
            }
        });

        jMILogoff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMILogoff.setText("Logoff");
        jMILogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILogoffActionPerformed(evt);
            }
        });
        jMArquivo.add(jMILogoff);

        jMIRealizar_Backup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIRealizar_Backup.setText("Realizar Backup");
        jMIRealizar_Backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRealizar_BackupActionPerformed(evt);
            }
        });
        jMArquivo.add(jMIRealizar_Backup);

        jBarra.add(jMArquivo);

        setJMenuBar(jBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarActionPerformed
        Cadastro_Cliente alt = null;
        try {
            alt = new Cadastro_Cliente();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
        jDesktopPane2.add(alt);
        alt.show();
    }//GEN-LAST:event_jMICadastrarActionPerformed

    private void jMICadastrarTatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarTatuadorActionPerformed
        Cadastro_Funcionario alt;
        try {
            alt = new Cadastro_Funcionario();
            jDesktopPane2.add(alt);
            alt.show();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jMICadastrarTatuadorActionPerformed

    private void jMIAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAgendarActionPerformed
        Agendar_Sessao ag;
        try {
            ag = new Agendar_Sessao();
            jDesktopPane2.add(ag);
            ag.show();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jMIAgendarActionPerformed

    private void jMIListarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListarSessaoActionPerformed
        Listagem_Sessao ls;
        try {
            ls = new Listagem_Sessao();
            jDesktopPane2.add(ls);
            ls.show();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jMIListarSessaoActionPerformed

    private void jMIEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEntradaActionPerformed
        Entrada_Caixa ec;
        try {
            ec = new Entrada_Caixa();
            jDesktopPane2.add(ec);
            ec.show();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jMIEntradaActionPerformed

    private void jMISaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISaidaActionPerformed
        Saida_Caixa sc = new Saida_Caixa();
        jDesktopPane2.add(sc);
        sc.show();
    }//GEN-LAST:event_jMISaidaActionPerformed

    private void jMIPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisaActionPerformed
        Pesquisa_Fluxo_Caixa pfc = new Pesquisa_Fluxo_Caixa();
        jDesktopPane2.add(pfc);
        pfc.show();
    }//GEN-LAST:event_jMIPesquisaActionPerformed

    private void jMICartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICartaoActionPerformed
        Listagem_Cartao lc = new Listagem_Cartao();
        jDesktopPane2.add(lc);
        lc.show();
    }//GEN-LAST:event_jMICartaoActionPerformed

    private void jTotalEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalEntradaActionPerformed
        Pesquisa_Total_Entrada pte = new Pesquisa_Total_Entrada();
        jDesktopPane2.add(pte);
        pte.show();
    }//GEN-LAST:event_jTotalEntradaActionPerformed

    private void jTotalSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalSaidaActionPerformed
        Pesquisa_Total_Saida pts = new Pesquisa_Total_Saida();
        jDesktopPane2.add(pts);
        pts.show();
    }//GEN-LAST:event_jTotalSaidaActionPerformed

    private void jMIAniversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAniversarioActionPerformed
        Lista_Aniversario la = new Lista_Aniversario();
        jDesktopPane2.add(la);
        la.show();
    }//GEN-LAST:event_jMIAniversarioActionPerformed

    private void jMIAltSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAltSenhaActionPerformed
        Altera_Funcionario au = new Altera_Funcionario(login, senha);
        jDesktopPane2.add(au);
        au.show();
    }//GEN-LAST:event_jMIAltSenhaActionPerformed

    private void jMILogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILogoffActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMILogoffActionPerformed

    private void jMArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMArquivoActionPerformed
    }//GEN-LAST:event_jMArquivoActionPerformed

    private void jMIRealizar_BackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRealizar_BackupActionPerformed
        Backup bac = new Backup();
        bac.fazBackup();
        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.");
    }//GEN-LAST:event_jMIRealizar_BackupActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jBarra;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMAgenda;
    private javax.swing.JMenu jMArquivo;
    private javax.swing.JMenu jMCaixa;
    private javax.swing.JMenu jMCliente;
    private javax.swing.JMenuItem jMIAgendar;
    private javax.swing.JMenuItem jMIAltSenha;
    private javax.swing.JMenuItem jMIAniversario;
    private javax.swing.JMenuItem jMICadastrar;
    private javax.swing.JMenuItem jMICadastrarTatuador;
    private javax.swing.JMenuItem jMICartao;
    private javax.swing.JMenuItem jMIEntrada;
    private javax.swing.JMenuItem jMIListarSessao;
    private javax.swing.JMenuItem jMILogoff;
    private javax.swing.JMenuItem jMIPesquisa;
    private javax.swing.JMenuItem jMIRealizar_Backup;
    private javax.swing.JMenuItem jMISaida;
    private javax.swing.JMenu jMITotal;
    private javax.swing.JMenu jMMovi;
    private javax.swing.JMenu jMTatuador;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jTotalEntrada;
    private javax.swing.JMenuItem jTotalSaida;
    // End of variables declaration//GEN-END:variables
}
