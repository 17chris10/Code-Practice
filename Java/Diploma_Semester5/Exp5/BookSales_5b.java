package Diploma_Semester5.Exp5;

public class BookSales_5b extends BookInfo_5a{
    int copiesSold;
    BookSales_5b(){
        copiesSold=50;
    }
    void RevenueGenerated(){
        double revenue=copiesSold*price;
        System.out.println("Revenue Generated: "+revenue);
    }
    public static void main(String[] args) {
        BookSales_5b b = new BookSales_5b();
        b.show();
        b.RevenueGenerated();
    }
}

