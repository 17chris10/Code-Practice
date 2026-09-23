package Diploma_Semester5.Exp11;
interface Area2{
    int calc(int x, int y);
}
public class LamdaFunMultiParameters_11c {
    public static void main(String args[]){
        Area2 a = (x , y) -> x+y;
        System.out.print(a.calc(90,100));
    }
}
