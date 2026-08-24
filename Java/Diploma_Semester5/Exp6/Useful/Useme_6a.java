package Diploma_Semester5.Exp6.Useful;

public class Useme_6a {
    public void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
    public void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }
    public void area(double radius) {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
    public void salary(int basic, int hra, int da) {
        System.out.println("Salary: " + (basic + hra + da));
    }
    public void percentage(int totalMarks, int obtainedMarks) {
        System.out.println("Percentage: " + ((obtainedMarks / (double) totalMarks) * 100) + "%");
    }
}
