package Diploma_Semester5.Exp12;
import java.util.function.Function;
public class NumSquare_Function_12e {
    public static void main(String[] args) {
        Function <Integer, Integer> f=n->n*n;
        System.out.println(f.apply(3));
    }
}
