package DAO;

import Connection.ConnectionFactory;
import Modelo.Parcela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ParcelaDAO {

    private Connection conn;

    public ParcelaDAO() {
        this.conn = ConnectionFactory.getConexao();
    }

    public void adicionar(Parcela par) {
        String sql = "insert into parcelas (par_codigo,par_parcela,par_valor,par_datacompra,par_datapgto,par_desc,par_obs,par_status,par_tipo) "
                + "values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, par.getId());
            pstmt.setInt(2, par.getParcela());
            pstmt.setDouble(3, par.getValor());
            pstmt.setDate(4, new java.sql.Date(par.getDataCompra().getTime()));
            pstmt.setDate(5, new java.sql.Date(par.getDataPagamento().getTime()));
            pstmt.setString(6, par.getDesc());
            pstmt.setString(7, par.getObs());
            pstmt.setString(8, par.getStatus());
            pstmt.setString(9, par.getTipo());
            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e);
        }
    }

    public int PegarId() throws SQLException {
        int aux = 0;
        String sql = "select max(par_codigo) from parcelas";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            aux = rs.getInt("max");
        }

        return aux + 1;
    }

    public List<Parcela> ListarParcela() throws SQLException {
        String sql = "select * from parcelas where par_datapgto >= current_date order by par_codigo,par_parcela";
        List<Parcela> parcelas = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setId(rs.getInt("par_codigo"));
                parcela.setParcela(rs.getInt("par_parcela"));
                parcela.setValor(rs.getDouble("par_valor"));
                parcela.setDataPagamento(rs.getDate("par_datapgto"));
                parcela.setDataCompra(rs.getDate("par_datacompra"));
                parcela.setStatus(rs.getString("par_status"));
                parcela.setDesc(rs.getString("par_desc"));
                parcela.setObs(rs.getString("par_obs"));
                parcela.setTipo(rs.getString("par_tipo"));
                parcelas.add(parcela);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e);
        }
        return parcelas;
    }

    public List<Parcela> ListarCurrent() throws SQLException {
        String sql = "select * from parcelas where par_datapgto = current_date order by par_codigo,par_parcela";
        List<Parcela> parcelas = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setId(rs.getInt("par_codigo"));
                parcela.setParcela(rs.getInt("par_parcela"));
                parcela.setValor(rs.getDouble("par_valor"));
                parcela.setDataPagamento(rs.getDate("par_datapgto"));
                parcela.setDataCompra(rs.getDate("par_datacompra"));
                parcela.setStatus(rs.getString("par_status"));
                parcela.setDesc(rs.getString("par_desc"));
                parcela.setObs(rs.getString("par_obs"));
                parcela.setTipo(rs.getString("par_tipo"));
                parcelas.add(parcela);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return parcelas;
    }

    public List<Parcela> ListarDataDesejada(java.util.Date data) throws SQLException {
        String sql = "select * from parcelas where par_datapgto = ? order by par_codigo,par_parcela";
        List<Parcela> parcelas = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(data.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setId(rs.getInt("par_codigo"));
                parcela.setParcela(rs.getInt("par_parcela"));
                parcela.setValor(rs.getDouble("par_valor"));
                parcela.setDataPagamento(rs.getDate("par_datapgto"));
                parcela.setDataCompra(rs.getDate("par_datacompra"));
                parcela.setStatus(rs.getString("par_status"));
                parcela.setDesc(rs.getString("par_desc"));
                parcela.setObs(rs.getString("par_obs"));
                parcela.setTipo(rs.getString("par_tipo"));
                parcelas.add(parcela);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
        return parcelas;
    }

    public List<Parcela> listarPendente() throws SQLException {
        MovimentacaoDAO mdao = new MovimentacaoDAO();
        String sql = "select * from parcelas where par_datapgto = current_date and par_status ilike 'pendente' order by par_codigo";
        List<Parcela> parcelas = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setValor(rs.getDouble("par_valor"));
                parcela.setDataPagamento(rs.getDate("par_datapgto"));
                parcela.setObs(rs.getString("par_obs"));
                parcela.setDesc(rs.getString("par_desc"));
                parcela.setId(rs.getInt("par_codigo"));
                parcela.setParcela(rs.getInt("par_parcela"));
                parcela.setTipo(rs.getString("par_tipo"));
                Pagar(parcela);
                mdao.adicionarParcela(parcela);

                parcelas.add(parcela);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e);
        }
        return parcelas;
    }

    public void Pagar(Parcela parcela) throws SQLException {
        String sql = "update parcelas set par_status = 'Pago' where par_codigo = ? and par_parcela = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, parcela.getId());
        stmt.setInt(2, parcela.getParcela());
        stmt.execute();
        stmt.close();
    }

    public String contarParcelas() throws SQLException {

        String sql = "select COUNT(par_codigo) from parcelas where extract(month from par_datapgto) = "
                + "extract(month from current_date) AND "
                + "extract(day from par_datapgto) = extract(day from current_date)";

        PreparedStatement pstmt = this.conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        String resul = "0";
        while (rs.next()) {
            resul = String.valueOf(rs.getInt("count"));
        }
        return resul;
    }
}
