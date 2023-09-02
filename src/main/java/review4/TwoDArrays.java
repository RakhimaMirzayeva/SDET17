package review4;

public class TwoDArrays {
    public static void main(String[] args) {
        //[row][col]
        int[][] array=new int[2][4];
        //1 row
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        //2row
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[1][3]=4;

        System.out.println(array[0][3]);//15
        // how to get all elements from 2D array
        //we need a nested loop
        // outer loop iterates over rows
        //array[row].length in 2D array returns number of column of that row
        for (int row = 0; row <array.length ; row++) {//outer loop iterates(repeats) over rows
            for (int col = 0; col <array[row].length ; col++) {//inner loop repeats over the column
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
// we can use this in Exel

    }
}
