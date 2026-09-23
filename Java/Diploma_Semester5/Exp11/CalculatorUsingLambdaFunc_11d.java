package Diploma_Semester5.Exp11;

interface Calculation {
    int calc(int x, int y);
}

public class CalculatorUsingLambdaFunc_11d {
    public static void main(String args[]) {
        int b = 30, c = 40;
        Calculation a = (x, y) -> x + y;
        Calculation s = (x, y) -> x - y;
        Calculation p = (x, y) -> x * y;
        Calculation q = (x, y) -> x / y;
        Calculation r = (x, y) -> x % y;
        System.out.println("Sum = " + a.calc(b, c));
        System.out.println("Difference = " + s.calc(b, c));
        System.out.println("Product = " + p.calc(b, c));
        System.out.println("Quotient = " + q.calc(b, c));
        System.out.println("Remainder = "+ r.calc(b, c));
    }

}
