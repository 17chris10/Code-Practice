package Exp12;
import java.util.function.Predicate;
public class PositiveNoChk_12c{
    public static void main(String[] args) {
        Predicate <Integer> p=n->n>0;
        System.out.println(p.test(30));
        System.out.println(p.test(-2));
    }
}