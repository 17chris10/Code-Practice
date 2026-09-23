package Diploma_Semester5.Exp11;

interface Area {
    int calc(int n);
}

public class LambdaFuncOneParameter_11b {
    public static void main(String[] args) {
        Area a = (n) -> n * n;
        System.out.println(a.calc(80));
    }
}
