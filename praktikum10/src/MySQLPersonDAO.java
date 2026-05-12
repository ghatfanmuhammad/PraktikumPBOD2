import java.sql.*;

/**
 * File: MySQLPersonDAO.java
 * Deskripsi: implementasi PersonDAO untuk MySQL
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // Membuat koneksi
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "#Passwordnya123");
        
        // Eksekusi query
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // Tutup koneksi
        con.close();
    }
}