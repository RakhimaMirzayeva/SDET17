package Class11;

public class E72DArrays {
    public static void main(String[] args) {
        int[][] numbers={{10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};
        for (int row = 0; row < 3; row++) {// here 3 means columns
            //System.out.println(numbers[1][row]);
            System.out.println(numbers[row][1]);

        }
    }
}
