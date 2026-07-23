package Diploma_Semester5.Exp2;
import java.util.Scanner;
public class Mobile_2b {
    String company;
    int screenSize;
    Mobile_2b(String c, int s){
        company = c;
        screenSize = s;
    }
    void display(){
        System.out.println("Company: " + company);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
    public static void main(String[] args) {
        Mobile_2b m[] = new Mobile_2b[5];
        Scanner sc = new Scanner(System.in);
        String n = " ";
        int ss=0;
        for (int i = 0; i < m.length; i++) {
            n=sc.next();
            ss=sc.nextInt();
            m[i] = new Mobile_2b(n, ss);
        }
        sc.close();
        for (int i = 0; i < m.length; i++) {
            m[i].display();
        }
    }
}
