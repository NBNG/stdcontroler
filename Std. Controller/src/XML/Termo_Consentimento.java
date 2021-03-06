/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Connection.ConnectionFactory;
import java.net.URL;
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
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

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
        URL arquivo = getClass().getResource("/Termo/inked.jrxml");
        JasperDesign desenho = JRXmlLoader.load(arquivo.getPath());
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String query = "select cli_nome, cli_cpf,cli_rg,to_char(cli_datanasc,"
                + "'dd/mm/yyyy'),cli_rua || ' ' || cli_numero || ', ' || cli_bairro || ' - ' || cli_cidade as ENDERECO"
                + " from cliente where cli_codigo = '" + id + "'";

        PreparedStatement pstmt = this.conexao.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
        HashMap parametros = new HashMap();
        parametros.put("blablabla", new Double(10));

        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        JasperViewer.viewReport(impressao);
        //JasperPrintManager.printPage(impressao, 0, true);
    }
}
