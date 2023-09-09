package review6;

public class Book {
    /*
    Syntax of variable:
    dataType name;
     */
    String title;//These are instance variables(they are inside the class but outside the method)
    String author;
    int year;
    double price;
    static String type;
    /*syntax of method
    returnType name
    void read()
    creating my own method:
    1. with parameters or without
    2.
     */

    void read(){//this method is without parameters
        System.out.println("I am reading  "+title+" book by "+author);
    }
    void changePrice(int newPrice){//this method is with parameters
        System.out.println("The price of the book "+title+" was changed from "+price+" to "+newPrice);
    }
    double totalWithTax(double tax){
        double total=price+(price*tax);
        return total; //to get something return


    }

}
