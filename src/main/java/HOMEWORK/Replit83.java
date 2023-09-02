package HOMEWORK;

public class Replit83 {
    public static void main(String[] args) {
        int[][] num = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
             int sum=0;

        for (int row = 0; row <num.length ; row++) {
            for (int col = 0; col < num[row].length; col++){
                sum=row+col;
                System.out.print(num[row][col]+" ");
            }
            System.out.println();
            }



    }
}
