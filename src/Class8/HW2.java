package Class8;

public class HW2 {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=6; j++) {
                if(i==2&&j==3||i==3&&j==3||i==2&&j==4||i==3&&j==4){//helps to get rid of two
                    // numbers in the same row
                    System.out.print(" ");
                }else {
                    System.out.print("#");

                }

            }
            System.out.println();
        }
    }
    }