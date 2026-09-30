package Diploma_Semester5.Exp12;
import java.util.function.Consumer;
public class DisplayName_Consumer_12b{
    public static void main(String args[]){
        Consumer <String> c=name ->
        {
            System.out.println("Hello "+name);
        };
        c.accept("Tina");
    }
}