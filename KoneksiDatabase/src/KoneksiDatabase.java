/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author usert
 */

public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
         if (koneksi == null){
            try{
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url ="jdbc:mysql://localhost:3306/db_opp";
        String user = "root";
        String pass ="";
        koneksi = DriverManager.getConnection(url, user, pass);
        System.out.println("koneksi berhasil");
            }catch (SQLException ex){
        System.out.println("Koneksi Gagal");
        System.out.println("pesan :"+ex.getMessage());
        
        }
    }
         return koneksi;
    }
         
} 

