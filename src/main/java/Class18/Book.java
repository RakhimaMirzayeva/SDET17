package Class18;

public class Book {
    private String bookTitle;
    private String bookName;
    private int bookYear;
    private int bookPrice;
    public Book(String bookTitle,String bookName,int bookYear,int bookPrice){
        this.bookName=bookName;
        this.bookTitle=bookTitle;
        this.bookYear=bookYear;
        this.bookPrice=bookPrice;
    }
    public void printInfo(){
        System.out.println(bookTitle+" "+bookName+" "+bookYear+" "+bookPrice);
    }
}
