package JAVAHomework;

public class HW4Number {
    public static void main(String[] args) {
        int[][] num={{12,34,56,88},
                {23,34,67,76},
                {98,87,76,90}};
        for (int row = 0; row <num.length ; row++) {
            for (int col = 0; col <num[row].length ; col++) {
                if(num[row][col]%2==0){
                    System.out.print(num[row][col]+" ");
                }
            }
            System.out.println();
        }
    }
}
