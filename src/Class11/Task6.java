package Class11;

public class Task6 {
    public static void main(String[] args) {
        int[][] numbers={{10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};
        //2d arrays contain 1d arrays
        // 1d arrays contains elements
        for(int[] row:numbers){
              for(int col:row){
                  System.out.print(col+" ");
              }
            System.out.println();
        }
    }
}
