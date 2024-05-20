
package pertemuan10;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dian Sariani (2201010254)
 * TGL: 2024-05-20
 */
public class koneksi {
    public static Connection getKoneksi() throws SQLException{
        Connection cnn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bukuteman", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi ke Database Gagal");
        }
        
        return cnn;
    } 
}
