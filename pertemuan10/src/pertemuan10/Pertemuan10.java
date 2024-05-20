
package pertemuan10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @authorDian Sariani (2201010254)
 * TGL: 2024-05-20
 */
public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        list_all();
    }
    
    private static void list_all() throws SQLException{
        Connection cnn = koneksi.getKoneksi();
        if(cnn.isClosed()){
            System.out.println("Koneksi Gagal");
        }else{
            PreparedStatement PS = cnn.prepareStatement("select * from datateman;");
            ResultSet rs = PS.executeQuery();
            
            while(rs.next()){
                System.out.println( "No Record: " + rs.getInt("idteman"));
                System.out.println( "Nama : " + rs.getString("nama"));
                System.out.println( "Alamat : " + rs.getString("alamat"));
                System.out.println( "telp : " + rs.getString("telp"));
            }
            cnn.close();
        }
    }
    
}
