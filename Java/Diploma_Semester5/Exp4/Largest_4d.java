import java.util.*;

public class Largest_4d
{
public static void main(String args[]) {
String n1 = "", n2 = "", n3 = "";
Scanner sc = new Scanner(System.in);
System.out.print("Enter 3 no.s : ");
n1 = sc.next();
n2 = sc.next();
n3 = sc.next();

Integer a = Integer.valueOf(n1);
Integer b = Integer.valueOf(n2);
Integer c = Integer.valueOf(n3);

int max = Integer.max(a, Integer.max(b, c));
System.out.println("Largest = " + max);

sc.close();
}
}