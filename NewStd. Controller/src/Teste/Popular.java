package Teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Popular {

    private static Connection conn;
    private String desc, obs;
    private static Integer tipo;
    private Calendar data;
    private Double valor;
    private static PreparedStatement pstmt;

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/inked", "postgres", "senha");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static String gerarTipo() {
        if ((int) ((Math.random() * 2) + 1) == 1) {
            return "E";
        } else {
            return "S";
        }
    }

    public static Double gerarValor() {
        return (Math.random() * 200) + 1;
    }

    public static void cliente() throws SQLException {
        String sql = "insert into movimentacao(mov_tipo, mov_desc,mov_valor) values(?,?,?)";


        for (int i = 0; i < 1000; i++) {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, gerarTipo());
            pstmt.setString(2, "Teste simulação de dados");
            pstmt.setDouble(3, gerarValor());

            pstmt.execute();
            pstmt.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        cliente();
    }
}
