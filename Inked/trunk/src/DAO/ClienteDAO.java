package DAO;

import Connection.ConnectionFactory;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Cliente cliente) throws SQLException {
        String sql = "insert into cliente (cli_nome,cli_datanasc,cli_telefone,cli_celular,cli_cpf,cli_rg,"
                + "cli_email,cli_rua,cli_numero,cli_bairro,cli_cidade) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setDate(2, new java.sql.Date(cliente.getNascimento().getTime()));
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getCelular());
            stmt.setString(5, cliente.getCpf());
            stmt.setString(6, cliente.getRg());
            stmt.setString(7, cliente.getEmail());
            stmt.setString(8, cliente.getRua());
            stmt.setString(9, cliente.getNumero());
            stmt.setString(10, cliente.getBairro());
            stmt.setString(11, cliente.getCidade());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Cliente> listar(String nome) throws SQLException {
        String sql = "select * from cliente where cli_nome ilike ? order by cli_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Cliente> clientes = new ArrayList<>();

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setNascimento(rs.getDate("cli_datanasc"));
            cliente.setTelefone(rs.getString("cli_telefone"));
            cliente.setCelular(rs.getString("cli_celular"));
            cliente.setCpf(rs.getString("cli_cpf"));
            cliente.setRg(rs.getString("cli_rg"));
            cliente.setEmail(rs.getString("cli_email"));
            cliente.setRua(rs.getString("cli_rua"));
            cliente.setNumero(rs.getString("cli_numero"));
            cliente.setBairro(rs.getString("cli_bairro"));
            cliente.setCidade(rs.getString("cli_cidade"));
            cliente.setId(rs.getInt("cli_codigo"));
            clientes.add(cliente);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }

    public void remover(int id) throws SQLException {
        String sql = "delete from cliente where cli_codigo=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public void alterar(Cliente cliente) throws SQLException {
        String sql = "update cliente set cli_nome = ?,cli_datanasc = ?, cli_telefone = ?,cli_celular = ?, cli_cpf = ?,"
                + "cli_rg = ?,cli_email = ?,cli_rua = ?, cli_numero = ?, cli_bairro = ?,cli_cidade = ?"
                + " where cli_codigo = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setDate(2, new java.sql.Date(cliente.getNascimento().getTime()));
        stmt.setString(3, cliente.getTelefone());
        stmt.setString(4, cliente.getCelular());
        stmt.setString(5, cliente.getCpf());
        stmt.setString(6, cliente.getRg());
        stmt.setString(7, cliente.getEmail());
        stmt.setString(8, cliente.getRua());
        stmt.setString(9, cliente.getNumero());
        stmt.setString(10, cliente.getBairro());
        stmt.setString(11, cliente.getCidade());
        stmt.setInt(12, cliente.getId());
        stmt.execute();
        stmt.close();
    }

    public List<String> listarNomes() throws SQLException {
        List<String> listaCliente = new ArrayList<>();
        String sql = "select cli_nome from cliente";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {

            listaCliente.add(rs.getString("cli_nome"));


        }
        rs.close();
        pstmt.close();
        return listaCliente;
    }

    public List<Cliente> listarCurrent() throws SQLException {
        String sql = "select * from cliente where "
                + "extract(month from cli_datanasc) = extract(month from current_date) AND "
                + "extract(day from cli_datanasc) = extract(day from current_date)"
                + " order by cli_nome";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        List<Cliente> clientes = new ArrayList<>();

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setCpf(rs.getString("cli_cpf"));
            cliente.setRua(rs.getString("cli_rua"));
            cliente.setCelular(rs.getString("cli_celular"));
            cliente.setTelefone(rs.getString("cli_telefone"));
            cliente.setNumero(rs.getString("cli_numero"));
            cliente.setBairro(rs.getString("cli_bairro"));
            cliente.setCidade(rs.getString("cli_cidade"));
            cliente.setEmail(rs.getString("cli_email"));
            cliente.setNascimento(rs.getDate("cli_datanasc"));
            clientes.add(cliente);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }

    public List<Cliente> listarMesCurrent() throws SQLException {
        String sql = "select * from cliente where "
                + "extract(month from cli_datanasc) = extract(month from current_date) "
                + " order by cli_nome";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        List<Cliente> clientes = new ArrayList<>();

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setCelular(rs.getString("cli_celular"));
            cliente.setTelefone(rs.getString("cli_telefone"));
            cliente.setCpf(rs.getString("cli_cpf"));
            cliente.setRua(rs.getString("cli_rua"));
            cliente.setNumero(rs.getString("cli_numero"));
            cliente.setBairro(rs.getString("cli_bairro"));
            cliente.setCidade(rs.getString("cli_cidade"));
            cliente.setEmail(rs.getString("cli_email"));
            cliente.setNascimento(rs.getDate("cli_datanasc"));
            clientes.add(cliente);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }

    public String pegaAniversario() throws SQLException {

        String sql = "select COUNT(cli_nome) from cliente where "
                + "extract(month from cli_datanasc) = extract(month from current_date) AND "
                + "extract(day from cli_datanasc) = extract(day from current_date)";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        String resul = "0";
        while (rs.next()) {
            resul = String.valueOf(rs.getInt("count"));
        }
        return resul;
    }
}
