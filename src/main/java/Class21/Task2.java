package Class21;

public class Task2 {
static void method(){
    System.out.println("Java is Great");
}
static void method(String s){
    System.out.println("Java is "+s);

}
static void method(int num){
    System.out.println("Amazing "+num);
}

    public static void main(String[] args) {
        Task2 t2=new Task2();
        t2.method();
        t2.method("Java");
        t2.method(2);


    }
}
