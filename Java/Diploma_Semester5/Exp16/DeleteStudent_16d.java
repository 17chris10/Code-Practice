package Diploma_Semester5.Exp16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DeleteStudent_16d {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "08stmary09!!";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String deleteSQL = "DELETE FROM Student WHERE RollNo = ?";
            PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
            
            // Specify RollNo to delete
            pstmt.setInt(1, 101);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student record deleted successfully.");
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