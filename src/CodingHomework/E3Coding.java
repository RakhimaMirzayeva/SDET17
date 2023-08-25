package CodingHomework;

public class E3Coding {
    public static void main(String[] args) {

        int[][] numbers={{35,32,14,11,4},
                {101,202,303,404,505},
                {111,222,333,444}
        };
        System.out.println("Even numbers are ");
        for (int[] row :numbers) {
            for (int number:row) {
                if(number%2==0){
                    System.out.println(number);
                }

            }

        }
        System.out.println();
    }
}
