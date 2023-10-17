package Class26;

public class E5ArrayList {
    public static void main(String[] args) {
        int a=10;
        Integer number=new Integer(a);//Primitive to a class (Boxing)
        //Integer number2=10;//same thing like on the top just diff version of writing
        int d=number.intValue();//converting from a class to a primitive(Boxing)
        System.out.println(d);
        Integer c=10;//Auto Boxing(shorter way)
        int f=c;//Auto Unboxing
        System.out.println(f);

    }
}
