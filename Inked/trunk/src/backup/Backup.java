package backup;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Backup {

    public static void fazBackup() {
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();

            String caminho = filesys.getHomeDirectory().toString();
            System.out.println(caminho + "\\bkp.backup");

            ProcessBuilder pb;
            Process p;
            pb = new ProcessBuilder("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_dump.exe ",
                    "-i", "-h", "localhost", "-p", "5432", "-U", "postgres", "-F", "t", "-b", "-v", "-f",
                    caminho + "\\bkp.backup", "inked");
            pb.environment().put("PGPASSWORD", "senha");
            pb.redirectErrorStream(true);
            p = pb.start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }
}
