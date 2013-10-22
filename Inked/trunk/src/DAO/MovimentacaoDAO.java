package DAO;

import Connection.ConnectionFactory;
import Modelo.Movimentacao;
import Modelo.Parcela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MovimentacaoDAO {

    private Connection conn;

    public MovimentacaoDAO() {
        this.conn = ConnectionFactory.getConexao();
    }

    public void adicionar(Movimentacao mov) {
        String sql = "insert into movimentacao (mov_tipo,mov_desc,mov_data,mov_valor,mov_obs) values (?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mov.getTipo());
            pstmt.setString(2, mov.getDescricao());
            pstmt.setDate(3, new java.sql.Date(mov.getData().getTime()));
            pstmt.setDouble(4, mov.getValor());
            pstmt.setString(5, mov.getObs());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }

    public List<Movimentacao> listarEntrada() {
        String sql = "select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor "
                + "from (select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor from movimentacao where mov_tipo='E') as tipo"
                + " where mov_data = current_date";
        List<Movimentacao> listEntrada = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setCodigo(rs.getInt("mov_codigo"));
                mov.setData(rs.getDate("mov_data"));
                mov.setDescricao(rs.getString("mov_desc"));
                mov.setTipo(rs.getString("mov_tipo"));
                mov.setValor(rs.getDouble("mov_valor"));
                listEntrada.add(mov);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return listEntrada;
    }

    public List<Movimentacao> listarSaida() {
        String sql = "select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor "
                + "from (select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor from movimentacao where mov_tipo='S') as tipo"
                + " where mov_data = current_date";
        List<Movimentacao> listEntrada = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setCodigo(rs.getInt("mov_codigo"));
                mov.setData(rs.getDate("mov_data"));
                mov.setDescricao(rs.getString("mov_desc"));
                mov.setTipo(rs.getString("mov_tipo"));
                mov.setValor(rs.getDouble("mov_valor"));
                listEntrada.add(mov);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return listEntrada;
    }

    public List<Movimentacao> listarEntradaDesejada(java.util.Date dataI, java.util.Date dataF) {
        String sql = "select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor "
                + "from movimentacao where mov_tipo='E' and mov_data >= ? and mov_data <= ?";
        List<Movimentacao> listEntrada = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(dataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(dataF.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setCodigo(rs.getInt("mov_codigo"));
                mov.setData(rs.getDate("mov_data"));
                mov.setDescricao(rs.getString("mov_desc"));
                mov.setTipo(rs.getString("mov_tipo"));
                mov.setValor(rs.getDouble("mov_valor"));
                listEntrada.add(mov);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return listEntrada;
    }

    public List<Movimentacao> listarSaidaDesejada(java.util.Date dataI, java.util.Date dataF) {
        String sql = "select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor "
                + "from movimentacao where mov_tipo='S' and mov_data >= ? and mov_data <= ?";
        List<Movimentacao> listEntrada = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(dataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(dataF.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setCodigo(rs.getInt("mov_codigo"));
                mov.setData(rs.getDate("mov_data"));
                mov.setDescricao(rs.getString("mov_desc"));
                mov.setTipo(rs.getString("mov_tipo"));
                mov.setValor(rs.getDouble("mov_valor"));
                listEntrada.add(mov);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return listEntrada;
    }

    public List<Movimentacao> listarSaidaTotal(String aux) {
        String sql = "select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor "
                + "from movimentacao where mov_tipo='S' and mov_desc ilike '" + aux + "' a"
                + "nd  extract(month from mov_data) = extract(month from current_date) "
                + "and extract (year from mov_data) = extract (year from  current_date);";
        List<Movimentacao> listEntrada = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setCodigo(rs.getInt("mov_codigo"));
                mov.setData(rs.getDate("mov_data"));
                mov.setDescricao(rs.getString("mov_desc"));
                mov.setTipo(rs.getString("mov_tipo"));
                mov.setValor(rs.getDouble("mov_valor"));
                listEntrada.add(mov);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return listEntrada;
    }

    public List<Movimentacao> listarEntradaTotal(String aux) {
        String sql = "select mov_codigo,mov_data,mov_desc,mov_tipo,mov_valor "
                + "from movimentacao where mov_tipo='E' and mov_desc ilike '" + aux + "' "
                + "and  extract(month from mov_data) = extract(month from current_date) "
                + "and extract (year from mov_data) = extract (year from  current_date)";
        List<Movimentacao> listEntrada = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setCodigo(rs.getInt("mov_codigo"));
                mov.setData(rs.getDate("mov_data"));
                mov.setDescricao(rs.getString("mov_desc"));
                mov.setTipo(rs.getString("mov_tipo"));
                mov.setValor(rs.getDouble("mov_valor"));
                listEntrada.add(mov);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return listEntrada;
    }

    public double listarEntradaResul(String aux) {
        double resul = 0;
        String sql = "SELECT SUM (mov_valor)AS total from movimentacao where mov_tipo='E' and mov_desc ilike '" + aux + "' "
                + "and  extract(month from mov_data) = extract(month from current_date) and "
                + "extract (year from mov_data) = extract (year from  current_date);";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                resul = rs.getDouble("total");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return resul;
    }

    public double listarSaidaResul(String aux) {
        double resul = 0;
        String sql = "SELECT SUM (mov_valor)AS total from movimentacao where mov_tipo='S' and mov_desc ilike '" + aux + "' and  extract(month from mov_data) = extract(month from current_date);";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                resul = rs.getDouble("total");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return resul;
    }

    public Double listarLucro() {
        Double resul = 0.0;

        /*String sql = "select case when SUM(mov_valor) is null then 0.0 else sum(mov_valor) end - "
         + "(select case when sum(mov_valor) is null then 0.0 else sum(mov_valor) end "
         + "from movimentacao where mov_tipo = 'S' and mov_data = current_date) "
         + "as total from movimentacao where mov_tipo='E' and mov_data = current_date";
         */

        String sql = "select * from listarvalordata()";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                //resul = rs.getDouble("total");
                resul = rs.getDouble("listarvalordata");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return resul;
    }

    public Double listarLucroIntevaloDias(java.util.Date dataI, java.util.Date dataF) {
        double resul = 0;
        String sql = "select case when sum(mov_valor) is null then 0.0 else sum(mov_valor) end - "
                + "(select case when sum(mov_valor) is null then 0.0 else sum(mov_valor) end"
                + " from movimentacao where mov_tipo = 'S' and mov_data >= ? and mov_data <= ?) as total "
                + "from movimentacao where mov_tipo='E' and mov_data >= ? and mov_data <= ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(dataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(dataF.getTime()));
            pstmt.setDate(3, new java.sql.Date(dataI.getTime()));
            pstmt.setDate(4, new java.sql.Date(dataF.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                resul = rs.getDouble("total");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return resul;
    }

    public Double listarCaixa() {
        Double resul = 0.;

        String sql = "select case when sum(mov_valor) is null then 0.0 else sum(mov_valor) end - "
                + "(select case when sum(mov_valor) is null then 0.0 else sum(mov_valor) end "
                + "from movimentacao where mov_tipo = 'S') as total from movimentacao where mov_tipo='E'";
        /*String sql = "select case when SUM(mov_valor) is null then 0.0 else sum(mov_valor) end - "
         + "(select case when sum(mov_valor) is null then 0.0 else sum(mov_valor) end "
         + "from movimentacao where mov_tipo = 'S' and mov_data = current_date) "
         + "as total from movimentacao where mov_tipo='E' and mov_data = current_date";
         */
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                resul = rs.getDouble("total");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return resul;
    }

    public void adicionarParcela(Parcela parcela) {
        String sql = "insert into movimentacao (mov_tipo,mov_desc,mov_data,mov_valor,mov_obs) values (?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "E");
            pstmt.setString(2, parcela.getDesc());
            pstmt.setDate(3, new java.sql.Date(parcela.getDataPagamento().getTime()));
            pstmt.setDouble(4, parcela.getValor());
            pstmt.setString(5, parcela.getObs());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }
}