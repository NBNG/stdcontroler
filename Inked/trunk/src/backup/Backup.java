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

    public static void realizaRestore() {

        try {
            final List<String> comandos = new ArrayList<String>();

            comandos.add("C:\\Program Files\\PostgreSQL\\9.2\\bin\\pg_restore.exe");
            comandos.add("-i");
            comandos.add("-h");
            comandos.add("localhost");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");
            comandos.add("postgres");
            comandos.add("-d");
            comandos.add("inked");
            comandos.add("-v");
            comandos.add("C:\\Inked\\Backup\\bkp.backup");

            ProcessBuilder pb = new ProcessBuilder(comandos);

            pb.environment().put("PGPASSWORD", "senha");

            final Process process = pb.start();

            JOptionPane.showMessageDialog(null, "Restore realizado com sucesso.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
