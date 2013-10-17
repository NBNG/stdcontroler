/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author user
 */
public class Termo_Consentimento {

    private Connection conexao;

    public Termo_Consentimento() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void gerar(int id) throws JRException, SQLException {
        String caminho = "C:\\Inked\\Termo\\inked.jrxml";
        JasperDesign desenho = JRXmlLoader.load(caminho);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String query = "select cli_nome, cli_cpf,cli_rg,to_char(cli_datanasc,"
                + "'dd/mm/yyyy'),cli_rua || ' ' || cli_numero || ', ' || cli_bairro || ' - ' || cli_cidade as ENDERECO"
                + " from cliente where cli_codigo = '" + id + "'";
        PreparedStatement pstmt = this.conexao.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        HashMap parametros = new HashMap();
        parametros.put("termo", new Double(10));
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        JasperPrintManager.printPage(impressao, 0, true);
    }
}
