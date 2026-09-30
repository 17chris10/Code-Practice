package Diploma_Semester5.Exp12;
import java.util.function.Consumer;
public class NumSquare_Consumer_12b {
    public static void main(String[] args) {
        Consumer <Integer> sq=n->
        {
            System.out.println(n*n);
        };
        sq.accept(3);
    }
}
