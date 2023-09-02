package class3;

public class E1TypeCasting {
    public static void main(String[] args) {
  //byte->short->int->long->float->double
        long age=12;

        //byte myAge=age;
        byte number=10;
        int number2=number;
        System.out.println(number2);

        float num1=15.6f;
        int num2;
        num2=(int)num1;//we are telling java to convert float to an int, and
        //int can only store the whole numbers
        System.out.println(num2);


    }
}
