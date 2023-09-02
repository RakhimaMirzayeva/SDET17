package HOMEWORK;

public class LotteryTicket2 {
    public static void main(String[] args) {
        /*
        String[][] cars={
                            {"Camaro","Corvette","Audi"}
                            {"Mercedes-Benz","Porsche","Mitsubishi"}
                            {"Tesla","BMW","Mercedes AMG"}
                          } will do the same thing
         */
        String[][] cars=new String[3][3];
        cars[0][0]="Camaro";
        cars[0][1]="Corvette";
        cars[0][2]="Audi";
        cars[1][0]="Mercedes-Benz";
        cars[1][1]="Porsche";
        cars[1][2]="Mitsubishi";
        cars[2][0]="Tesla";
        cars[2][1]="BMW";
        cars[2][2]="Mercedes AMG";
        for (int i = 0; i <cars.length ; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }

            }

        }


    }

