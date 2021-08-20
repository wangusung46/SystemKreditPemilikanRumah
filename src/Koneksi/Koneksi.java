package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {

    Connection conn;

    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_system_kpr", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL \n" + e);
        }
        return conn;
    }
}
