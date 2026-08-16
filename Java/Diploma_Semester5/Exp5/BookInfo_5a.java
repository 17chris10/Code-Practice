package Diploma_Semester5.Exp5;

public class BookInfo_5a extends Book_5a{
    double price;
    int stockPos;
    BookInfo_5a(){
        price=300.00;
        stockPos=100;
    }
    void show(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publisher: "+publisher);
        System.out.println("Price: "+price);
        System.out.println("Stock Position: "+stockPos);
    }
    public static void main(String[] args) {
        BookInfo_5a b = new BookInfo_5a();
        b.show();
    }
}
