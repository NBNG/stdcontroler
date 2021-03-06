package DAO;

import Connection.ConnectionFactory;
import Modelo.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    private Connection conn;

    public FuncionarioDAO() {
        this.conn = ConnectionFactory.getConexao();
    }

    public void adicionar(Funcionario funcionario) throws SQLException {
        String sql = "insert into funcionario (fun_nome,fun_telefone,fun_rua,"
                + "fun_numero,fun_bairro,fun_cidade,fun_cargo,fun_login,fun_senha,fun_cpf,fun_rg) "
                + "values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getTelefone());
        stmt.setString(3, funcionario.getRua());
        stmt.setString(4, funcionario.getNumero());
        stmt.setString(5, funcionario.getBairro());
        stmt.setString(6, funcionario.getCidade());
        stmt.setString(7, funcionario.getCargo());
        stmt.setString(8, funcionario.getLogin());
        stmt.setString(9, funcionario.getSenha());
        stmt.setString(10, funcionario.getCpf());
        stmt.setString(11, funcionario.getRg());

        stmt.execute();
        stmt.close();

    }

    public List<Funcionario> getLista(String nome) throws SQLException {
        String sql = "select * from funcionario where fun_nome ilike ? order by fun_nome";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        while (rs.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(rs.getString("fun_nome"));
            funcionario.setTelefone(rs.getString("fun_telefone"));
            funcionario.setId(rs.getInt("fun_codigo"));
            funcionario.setRua(rs.getString("fun_rua"));
            funcionario.setNumero(rs.getString("fun_numero"));
            funcionario.setBairro(rs.getString("fun_bairro"));
            funcionario.setCidade(rs.getString("fun_cidade"));
            funcionario.setCargo(rs.getString("fun_cargo"));
            funcionario.setRg(rs.getString("fun_rg"));
            funcionario.setCpf(rs.getString("fun_cpf"));
            funcionario.setLogin(rs.getString("fun_login"));
            funcionarios.add(funcionario);

        }
        rs.close();
        pstmt.close();
        return funcionarios;

    }

    public void remover(int id) throws SQLException {
        String sql = "delete from funcionario where fun_codigo=?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public void zerarSenha(int id) throws SQLException {
        String sql = "update funcionario set fun_senha = '123' where fun_codigo = '" + id + "'";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.execute();
        stmt.close();
    }

    public void alterar(Funcionario funcionario) throws SQLException {

        String sql = "update funcionario set fun_nome = ?,fun_telefone = ?,fun_rua = ?,fun_numero=?,fun_bairro=?,"
                + "fun_cidade=?,fun_cargo = ?,fun_login= ?,fun_cpf = ?, fun_rg=? where fun_codigo = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getTelefone());
        stmt.setString(3, funcionario.getRua());
        stmt.setString(4, funcionario.getNumero());
        stmt.setString(5, funcionario.getBairro());
        stmt.setString(6, funcionario.getCidade());
        stmt.setString(7, funcionario.getCargo());
        stmt.setString(8, funcionario.getLogin());
        stmt.setString(9, funcionario.getCpf());
        stmt.setString(10, funcionario.getRg());
        stmt.setInt(11, funcionario.getId());
        stmt.execute();
        stmt.close();
    }

    public List<String> listarTatuador() throws SQLException {
        List<String> listaFuncionario = new ArrayList<>();
        String sql = "select fun_nome from funcionario where fun_cargo ilike 'tatuador' order by fun_nome";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {

            listaFuncionario.add(rs.getString("fun_nome"));

        }
        rs.close();
        pstmt.close();
        return listaFuncionario;
    }

    public Integer pegarFuncionario(String nome) throws SQLException {

        Integer id = null;
        String sql = "select fun_codigo from funcionario where fun_nome ilike '" + nome + "'";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {

            id = rs.getInt("fun_codigo");

        }

        rs.close();
        pstmt.close();
        return id;
    }

    public List<String> listarNomes() {
        List<String> listaFuncionario = new ArrayList<>();
        String sql = "select fun_nome from funcionario order by fun_nome";
        try {
            PreparedStatement pstmt = this.conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                listaFuncionario.add(rs.getString("fun_nome"));

            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return listaFuncionario;
    }

    public boolean testaLogin(String login, String senha) throws SQLException {
        String sql = "select fun_login,fun_senha from funcionario where fun_login ilike  ?  AND fun_senha ilike ?";
        boolean status = false;
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, login);
        pstmt.setString(2, senha);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            if (login.equalsIgnoreCase(rs.getString("fun_login")) && senha.equalsIgnoreCase(rs.getString("fun_senha"))) {
                status = true;
                break;
            }
        }

        pstmt.close();
        return status;
    }

    public void altera(String login, String senha) throws SQLException {
        String sql = "update funcionario set fun_senha = ? where fun_login ilike ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, senha);
        stmt.setString(2, login);
        stmt.execute();
        stmt.close();
    }

    public boolean confere(String login, String senha) throws SQLException {
        Boolean aux = false;
        String sql = "select fun_cargo from funcionario where fun_login ilike ? and fun_senha ilike ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, login);
        pstmt.setString(2, senha);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {

            if ((rs.getString("fun_cargo").equals("Gerente"))) {

                aux = true;
            } else {
                aux = false;
            }
        }
        pstmt.execute();
        pstmt.close();
        return aux;
    }

    public boolean confereTatuador(String login, String senha) throws SQLException {
        Boolean aux = false;
        String sql = "select fun_cargo from funcionario where fun_login ilike ? and fun_senha ilike ?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, login);
        pstmt.setString(2, senha);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {

            if ((!rs.getString("fun_cargo").equals("Tatuador"))) {

                aux = false;
            } else {
                aux = true;
            }
        }
        pstmt.execute();
        pstmt.close();
        return aux;
    }
}
