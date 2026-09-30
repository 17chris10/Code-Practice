package Diploma_Semester5.Exp12;
import java.util.function.Function;
public class StringLength_Function_12e{
    public static void main(String[] args) {
        Function<String,Integer> len=str->str.length();
        System.out.println(len.apply("java"));
    }
}