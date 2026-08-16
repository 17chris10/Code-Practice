package Diploma_Semester5.Exp5;

public class Document_5e implements Printable_5e, Drawable_5e {
    @Override
    public void print() {
        System.out.println("Printing the document...");
    }

    @Override
    public void draw() {
        System.out.println("Drawing the document...");
    }
    public static void main(String[] args) {
        Document_5e d = new Document_5e();
        d.print();
        d.draw();
    }
    
}
