import java.util.*;

public class EvenOdd {
public static void main(String args[]) {
String n = "";
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no. : ");
n = sc.next();

Integer a = Integer.valueOf(n);
if (a % 2 == 0) {
System.out.print("Even");
} else {
System.out.print("Odd");
}

sc.close();
}
}
