package Diploma_Semester5.Exp11;

interface Message {
    void disp();
}

public class LambdaFuncNoParameters_11a {
    public static void main(String[] args) {
        Message m = () -> System.out.print("Hello");
        m.disp();
    }
}
