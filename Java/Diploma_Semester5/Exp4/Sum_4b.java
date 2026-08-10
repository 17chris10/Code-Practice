import java.util.*;

public class Sum_4b{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter 2 no.s : ");
String n1 = sc.next();
String n2 = sc.next();

Integer num1 = Integer.valueOf(n1);
Integer num2 = Integer.valueOf(n2);
int sum = num1 + num2;

System.out.println("Sum = " + sum);
sc.close();
}
}