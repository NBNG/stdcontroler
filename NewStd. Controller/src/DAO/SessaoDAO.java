package DAO;

import Connection.ConnectionFactory;
import Modelo.Cliente;
import Modelo.Funcionario;
import Modelo.Sessao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SessaoDAO {

    private Connection conn;

    public SessaoDAO() {
        this.conn = ConnectionFactory.getConexao();
    }

    public void adicionar(Sessao sessao) {
        String sql = "insert into sessao (ses_cobranca,ses_sinal,ses_valor,ses_data,ses_cliente,ses_funcionario,ses_tipo,ses_hora,ses_retoque) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = this.conn.prepareStatement(sql);


            pstmt.setDouble(1, sessao.getValor() - sessao.getSinal());
            pstmt.setDouble(2, sessao.getSinal());
            pstmt.setDouble(3, sessao.getValor());
            pstmt.setDate(4, new java.sql.Date(sessao.getData().getTime()));
            pstmt.setInt(5, sessao.getCliente().getId());
            pstmt.setInt(6, sessao.getFuncionario().getId());
            pstmt.setString(7, sessao.getTipo());
            pstmt.setString(8, sessao.getHora());
            pstmt.setString(9, sessao.getRetoque());
            pstmt.execute();
            pstmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }

    public List<Sessao> listarTatuador(String nome) throws SQLException {

        String sql = "select cli_nome,cli_codigo, fun_nome, ses_codigo, ses_valor, ses_sinal, ses_cobranca, ses_data, ses_hora, ses_tipo, ses_retoque "
                + "from sessao inner join cliente on sessao.ses_cliente = cliente.cli_codigo "
                + "inner join funcionario on sessao.ses_funcionario = funcionario.fun_codigo "
                + "where fun_nome ilike ?";

        PreparedStatement pstmt = this.conn.prepareStatement(sql);

        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();

        List<Sessao> sessoes = new ArrayList<>();

        while (rs.next()) {
            Sessao sessao = new Sessao();
            sessao.setCodigo(rs.getInt("ses_codigo"));

            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setId(rs.getInt("cli_codigo"));
            sessao.setCliente(cliente);

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(rs.getString("fun_nome"));
            sessao.setFuncionario(funcionario);

            sessao.setValor(rs.getDouble("ses_valor"));
            sessao.setSinal(rs.getDouble("ses_sinal"));
            sessao.setRestante(rs.getDouble("ses_cobranca"));
            sessao.setData(rs.getDate("ses_data"));
            sessao.setHora(rs.getString("ses_hora"));
            sessao.setTipo(rs.getString("ses_tipo"));
            sessao.setRetoque(rs.getString("ses_retoque"));
            sessoes.add(sessao);

        }

        rs.close();
        pstmt.close();
        return sessoes;
    }

    public void remover(int id) throws SQLException {
        String sql = "delete from sessao where ses_codigo=?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public List<Sessao> listarCliente(String cpf) throws SQLException {

        String sql = "select cli_nome,cli_codigo, fun_nome, ses_codigo, ses_valor, ses_sinal, ses_cobranca,ses_data, ses_hora, ses_tipo, ses_retoque"
                + " from sessao inner join cliente on sessao.ses_cliente = cliente.cli_codigo "
                + "inner join funcionario on sessao.ses_funcionario = funcionario.fun_codigo "
                + "where cli_cpf =  ? order by ses_data";

        PreparedStatement pstmt = this.conn.prepareStatement(sql);

        pstmt.setString(1, cpf);

        ResultSet rs = pstmt.executeQuery();

        List<Sessao> sessoes = new ArrayList<>();

        while (rs.next()) {
            Sessao sessao = new Sessao();
            sessao.setCodigo(rs.getInt("ses_codigo"));
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setId(rs.getInt("cli_codigo"));
            sessao.setCliente(cliente);
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(rs.getString("fun_nome"));
            sessao.setFuncionario(funcionario);
            sessao.setValor(rs.getDouble("ses_valor"));
            sessao.setSinal(rs.getDouble("ses_sinal"));
            sessao.setRestante(rs.getDouble("ses_cobranca"));
            sessao.setData(rs.getDate("ses_data"));
            sessao.setHora(rs.getString("ses_hora"));
            sessao.setTipo(rs.getString("ses_tipo"));
            sessao.setRetoque(rs.getString("ses_retoque"));
            sessoes.add(sessao);
        }

        rs.close();
        pstmt.close();
        return sessoes;
    }

    public List<Sessao> listarCurrent() throws SQLException {

        String sql = "select cli_nome,cli_codigo, fun_nome, ses_codigo, ses_valor, ses_sinal, ses_cobranca, ses_data, ses_hora, ses_tipo, ses_retoque "
                + "from sessao inner join cliente on sessao.ses_cliente = cliente.cli_codigo "
                + "inner join funcionario on sessao.ses_funcionario = funcionario.fun_codigo "
                + "where ses_data = current_date order by ses_data";

        PreparedStatement pstmt = this.conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        List<Sessao> sessoes = new ArrayList<>();

        while (rs.next()) {
            Sessao sessao = new Sessao();
            sessao.setCodigo(rs.getInt("ses_codigo"));
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setId(rs.getInt("cli_codigo"));
            sessao.setCliente(cliente);
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(rs.getString("fun_nome"));
            sessao.setFuncionario(funcionario);
            sessao.setValor(rs.getDouble("ses_valor"));
            sessao.setSinal(rs.getDouble("ses_sinal"));
            sessao.setRestante(rs.getDouble("ses_cobranca"));
            sessao.setData(rs.getDate("ses_data"));
            sessao.setHora(rs.getString("ses_hora"));
            sessao.setTipo(rs.getString("ses_tipo"));
            sessao.setRetoque(rs.getString("ses_retoque"));
            sessoes.add(sessao);
        }

        rs.close();
        pstmt.close();
        return sessoes;
    }

    public List<Sessao> listarData(java.util.Date data) throws SQLException {

        String sql = "select cli_nome,cli_codigo, fun_nome, ses_codigo, ses_valor, ses_sinal, ses_cobranca, ses_data, ses_hora, ses_tipo, ses_retoque "
                + "from sessao inner join cliente on sessao.ses_cliente = cliente.cli_codigo "
                + "inner join funcionario on sessao.ses_funcionario = funcionario.fun_codigo "
                + "where ses_data = ? order by ses_data";


        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setDate(1, new java.sql.Date(data.getTime()));
        ResultSet rs = pstmt.executeQuery();

        List<Sessao> sessoes = new ArrayList<>();

        while (rs.next()) {
            Sessao sessao = new Sessao();
            sessao.setCodigo(rs.getInt("ses_codigo"));
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setId(rs.getInt("cli_codigo"));
            sessao.setCliente(cliente);
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(rs.getString("fun_nome"));
            sessao.setFuncionario(funcionario);
            sessao.setValor(rs.getDouble("ses_valor"));
            sessao.setSinal(rs.getDouble("ses_sinal"));
            sessao.setRestante(rs.getDouble("ses_cobranca"));
            sessao.setData(rs.getDate("ses_data"));
            sessao.setHora(rs.getString("ses_hora"));
            sessao.setTipo(rs.getString("ses_tipo"));
            sessao.setRetoque(rs.getString("ses_retoque"));
            sessoes.add(sessao);
        }

        rs.close();
        pstmt.close();
        return sessoes;
    }

    public void alteraDescricao(String descricao, Integer id) throws SQLException {

        String sql = "update sessao set ses_desc = ? where ses_codigo = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, descricao);
        pstmt.setInt(2, id);
        pstmt.execute();
        pstmt.close();

    }

    public String getDescricao(Integer id) throws SQLException {
        String descricao = null;
        String sql = "select ses_desc from sessao where ses_codigo = '" + id + "'";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            descricao = rs.getString("ses_desc");
        }
        return descricao;
    }

    public List<Sessao> listarTatuadorData(String nome, java.util.Date data) throws SQLException {

        String sql = "select cli_nome,cli_codigo, fun_nome, ses_codigo, ses_valor, ses_sinal, ses_cobranca, ses_data, ses_hora, ses_tipo, ses_retoque "
                + "from sessao inner join cliente on sessao.ses_cliente = cliente.cli_codigo "
                + "inner join funcionario on sessao.ses_funcionario = funcionario.fun_codigo "
                + "where fun_nome ilike ? and ses_data = ?";

        PreparedStatement pstmt = this.conn.prepareStatement(sql);

        pstmt.setString(1, nome);
        pstmt.setDate(2, new java.sql.Date(data.getTime()));

        ResultSet rs = pstmt.executeQuery();

        List<Sessao> sessoes = new ArrayList<>();

        while (rs.next()) {
            Sessao sessao = new Sessao();
            sessao.setCodigo(rs.getInt("ses_codigo"));

            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setId(rs.getInt("cli_codigo"));
            sessao.setCliente(cliente);

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(rs.getString("fun_nome"));
            sessao.setFuncionario(funcionario);

            sessao.setValor(rs.getDouble("ses_valor"));
            sessao.setSinal(rs.getDouble("ses_sinal"));
            sessao.setRestante(rs.getDouble("ses_cobranca"));
            sessao.setData(rs.getDate("ses_data"));
            sessao.setHora(rs.getString("ses_hora"));
            sessao.setTipo(rs.getString("ses_tipo"));
            sessao.setRetoque(rs.getString("ses_retoque"));
            sessoes.add(sessao);

        }

        rs.close();
        pstmt.close();
        return sessoes;
    }
}
