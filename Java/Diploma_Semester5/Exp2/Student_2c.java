package Diploma_Semester5.Exp2;

public class Student_2c {
    String name;
    int rollNo;
    String dept;
    Student_2c(String n, int r, String d){
        name = n;
        rollNo = r;
        dept = d;
    }
    Student_2c(String n, int r){
        name = n;
        rollNo = r;
        dept = "Mechanical";
    }
    Student_2c(){
        name = "Chriselle";
        rollNo = 45;
        dept = "CSE";
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + dept);
    }
    public static void main(String[] args) {
        Student_2c s1 = new Student_2c("John", 9, "ECE");
        Student_2c s2 = new Student_2c("Alice", 53);
        Student_2c s3 = new Student_2c();
        s1.display();
        s2.display();
        s3.display();
    }
}
