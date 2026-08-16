package Diploma_Semester5.Exp5;

public class Clerk_5d extends Employee_5d {
    float allowance;
    Clerk_5d(float allowance, String name, float salary) {
        this.allowance = allowance;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }
    public static void main(String[] args) {
        Clerk_5d c = new Clerk_5d(5000, "Jane Smith", 30000);
        c.display();
    }
}
