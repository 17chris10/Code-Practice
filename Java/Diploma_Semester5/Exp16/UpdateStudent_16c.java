package Diploma_Semester5.Exp16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent_16c {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "08stmary09!!";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            // Using PreparedStatement to update records securely
            String updateSQL = "UPDATE Student SET Percentage = ? WHERE RollNo = ?";
            PreparedStatement pstmt = conn.prepareStatement(updateSQL);
            
            // Setting parameters: New Percentage = 91.0, RollNo = 101
            pstmt.setDouble(1, 91.0);
            pstmt.setInt(2, 101);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student percentage updated successfully!");
            } else {
                System.out.println("Student with the specified Roll No was not found.");
            }

            // Close resources
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}