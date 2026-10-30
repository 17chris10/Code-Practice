package Diploma_Semester5.Exp16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DBCreationUsingJava_16a  {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "08stmary09!!";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Student (" +
                    "RollNo INT PRIMARY KEY, " +
                    "Name VARCHAR(50), " +
                    "Percentage DOUBLE)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Student table created successfully.");
            String insertSQL = "INSERT INTO Student (RollNo, Name, Percentage) VALUES (101, 'Alice Smith', 85.5)";
            int rows = stmt.executeUpdate(insertSQL);
            System.out.println(rows + " record inserted successfully.");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}