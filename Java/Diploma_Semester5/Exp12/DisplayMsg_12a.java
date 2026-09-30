package Diploma_Semester5.Exp12;
@FunctionalInterface 
interface Msg{
    void show();
}
public class DisplayMsg_12a {
    public static void main(String[] args) {
        Msg m=() ->{
            System.out.println("Hello");
        };
        m.show();
    }
}
