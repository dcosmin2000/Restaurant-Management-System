package common;

import java.io.File;
import javax.swing.JOptionPane;

public class OpenPdf {

    public static void openById(String id) {
        try {
            if ((new File("C:\\" + id + ".pdf")).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler C:\\" + id + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
