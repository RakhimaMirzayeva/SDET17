package HOMEWORK;

public class TwoDArrays2 {
    public static void main(String[] args) {
        int[][] integers={{3, 5,7},{10, 2, 9}};
        for (int i = 0; i <2 ; i++)//always put the smallest number but you want in the output
            for (int j = 0; j < 3; j++) {
                System.out.print(integers[i][j]+" ");
            }
        System.out.println();
        }
    }

