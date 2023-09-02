package review2;

public class E1TypeCasting {
    public static void main(String[] args) {
        int number=(int)10.5;
        System.out.println(number);
        char c=(char)65;
        System.out.println(c);// ascii table this character converts to a letter "A", explicit data type
        //String s=(String)'C';
        //System.out.println(s);

        boolean condition=true;
        if (condition){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }
}
