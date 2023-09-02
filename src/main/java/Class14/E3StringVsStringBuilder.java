package Class14;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {
        String name="Baber";
        //name="Azam";
        name.toLowerCase();
        System.out.println(name);

        //StringBuilder is Mutable(means Changeable).
        StringBuilder sb=new StringBuilder("Sunday");
        sb.reverse();
        System.out.println(sb);


    }
}
