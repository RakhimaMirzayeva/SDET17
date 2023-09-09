package review6;

public class BookStore {
    public static void main(String[] args) {
        Book.type="Audiobook";//right way accessing static variable-By the class name
        Book b1=new Book();//parenthesis calls the constructors
        b1.title="Nightwork";
        b1.author="Irwin Shawn";
        b1.year=1975;
        b1.price=45;
        b1.read();
        b1.changePrice(41);
        double total=b1.totalWithTax(0.1);
        System.out.println("The price with taxes "+total);
        b1.type="Hard Copy";//not right way of accessing static variable, but possible way too.
        System.out.println(b1.type);
        new Book();
        new Book();


    }
}
