package JAVAHomework;

public class HW3Number {
    public static void main(String[] args) {
        int[][] num={{12,34,56},
                {23,34,67},
                {98,87,76}};
        int sum=0;
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col <num[row].length ; col++) {
                sum=sum+num[row][col];
            }

        }

        System.out.println(sum);
    }
}
