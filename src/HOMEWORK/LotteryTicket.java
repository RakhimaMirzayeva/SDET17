package HOMEWORK;

public class LotteryTicket {
    public static void main(String[] args) {
        int [][] lotteryCard={{20, 15, 35},
                    {6, 13,2},
                    {1, 28, 23}};
        System.out.print(lotteryCard[0][0]);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(lotteryCard[i][j]+" ");
            }


        }
    }
}
