/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usert
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class programdelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection koneksi = KoneksiDatabase.getKoneksi();
        Statement statement = null;
        try{
            statement = koneksi.createStatement();
            System.out.println("statement berhasil dibuat");
            String url= "DELETE from barang WHERE kode_barang='B003'";
              statement.executeUpdate(url);
        }catch(SQLException ex){
            System.out.println("statement gagal dibuat");
            System.out.println("pesan : "+ex.getMessage());
        }finally{
            if (statement != null){
                try{
                    statement.close();
                    System.out.println("statement berhasil ditutup");
                }catch(SQLException ex){
                    System.out.println("statement gagal ditutup");
                    System.out.println("pesan :" +ex.getMessage());
                }
            }
            
        }
    }
    
    
    
}
