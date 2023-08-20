package Class11;

public class E52DArrays {
    public static void main(String[] args) {
//2ways of writing
        int[][] numbers={{10,20,30,40},
                {100,200,300,400},
                {111,222,333,444}};
        //for (int row = 0; row <3 ; row++) {//we can also say numbers.length
            //for (int col = 0; col < 4; col++) {
                for (int row = 0; row <numbers.length ; row++) {
                    for (int col = 0; col < numbers[row].length; col++) {//numbers[row]=>gives us complete
                        //1D array

                System.out.print(numbers[row][col]+" ");


            }
            System.out.println();
        }
    }
}
