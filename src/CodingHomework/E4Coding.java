package CodingHomework;

public class E4Coding {
    public static void main(String[] args) {

        int[][] numbers={{35,32,14,11,4},
                {101,202,303,404,505},
                {111,222,333,444}};
        int sum=0;
        for (int row = 0; row <numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length; col++){
                sum=sum+numbers[row][col];
            }

        }
        System.out.println(sum);
    }
}



