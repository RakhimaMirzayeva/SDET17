package Class22;

public class E8Final {
    public static void main(String[] args) {
        final int AGE=10;
        System.out.println(AGE);
    }
}
 class Parent{
      void marry(){
        System.out.println("take our permission first");
    }
}
class Child extends Parent{
    @Override
    void marry(){
        System.out.println("I want to marry someone else");
    }
}