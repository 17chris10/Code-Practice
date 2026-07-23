package Diploma_Semester5.Exp2;

public class Cube_2a {
    int length;
    int breadth;
    int height;
    Cube_2a(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    Cube_2a(int l){
        length = l;
        breadth = 23;
        height = 10;
    }
    Cube_2a(){
        length = 10;
        breadth = 20;
        height = 30;
    }
    void calc(){
        int volume = length * breadth * height;
        System.out.println("Volume of Cube is: " + volume);
    }
    public static void main(String[] args) {
        Cube_2a c1 = new Cube_2a(10, 20, 30);
        c1.calc();
        Cube_2a c2 = new Cube_2a(10);
        c2.calc();
        Cube_2a c3 = new Cube_2a();
        c3.calc();
    }
}
