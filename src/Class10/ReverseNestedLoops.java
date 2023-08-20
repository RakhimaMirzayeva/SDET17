package Class10;

public class ReverseNestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.println(i+" "+j);
            }
        }
    }

}
