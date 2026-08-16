package Diploma_Semester5.Exp5;

public class Manager_5d extends Employee_5d {
     float bonus;
     Manager_5d(String name, float salary, float bonus) {
         this.name = name;
         this.salary = salary;
         this.bonus = bonus;
     }
     void display() {
         System.out.println("Name: " + name);
         System.out.println("Salary: " + salary);
         System.out.println("Bonus: " + bonus);
     }
     public static void main(String[] args) {
         Manager_5d m = new Manager_5d("John Doe", 50000, 10000);
         m.display();
     }
    
}
