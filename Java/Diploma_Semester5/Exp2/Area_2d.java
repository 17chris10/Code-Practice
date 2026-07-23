package Diploma_Semester5.Exp2;

public class Area_2d {
    int r, l, b, s;
    Area_2d(){
        r = 30;
    }
    Area_2d(int length, int breadth){
        l = length;
        b = breadth;
    }
    Area_2d(int side){
        s = side;
    }
    Area_2d(Area_2d a){
        s= a.s;
    }
    public static void main(String[] args) {
        Area_2d a1 = new Area_2d();
        double ar_c = 3.14 * a1.r * a1.r;
        System.out.println("Area of Circle = " + ar_c);
        Area_2d a2 = new Area_2d(10, 20);
        Area_2d a3 = new Area_2d(30);
        Area_2d a4 = new Area_2d(a3);
        double ar_r = a2.l * a2.b;
        System.out.println("Area of Rectangle = " + ar_r);
        double ar_s4 = a4.s * a4.s;
        System.out.println("Area of Square = " + ar_s4);
    }
}
