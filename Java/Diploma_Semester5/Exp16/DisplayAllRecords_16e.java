package Diploma_Semester5.Exp16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAllRecords_16e  {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "08stmary09!!";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM Student";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("--- All Student Records ---");
            System.out.println("Roll No\tName\t\tPercentage");
            System.out.println("------------------------------------");
            while (rs.next()) {
                int rollNo = rs.getInt("RollNo");
                String name = rs.getString("Name");
                double percentage = rs.getDouble("Percentage");
                System.out.println(rollNo + "\t" + name + "\t" + percentage);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}