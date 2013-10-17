package backup;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Backup {

    public static void fazBackup() {
        try {
            ProcessBuilder pb;
            Process p;
            pb = new ProcessBuilder("C:\\Program Files\\PostgreSQL\\9.2\\bin\\pg_dump.exe ",
                    "-i", "-h", "localhost", "-p", "5432", "-U", "postgres", "-F", "t", "-b", "-v", "-f",
                    "C:\\inked\\backup\\bkp.backup", "inked");
            pb.environment().put("PGPASSWORD", "senha");
            pb.redirectErrorStream(true);
            p = pb.start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }
}
