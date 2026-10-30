package Diploma_Semester5.Exp16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudetsCondition_16b {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "08stmary09!!";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Query to fetch students with percentage greater than 70
            String query = "SELECT RollNo, Name FROM Student WHERE Percentage > 70";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Students with Percentage > 70:");
            System.out.println("Roll No\tName");
            System.out.println("--------------------");
            while (rs.next()) {
                int rollNo = rs.getInt("RollNo");
                String name = rs.getString("Name");
                System.out.println(rollNo + "\t" + name);
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
