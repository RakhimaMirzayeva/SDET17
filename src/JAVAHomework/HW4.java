package JAVAHomework;

public class HW4 {
    public static void main(String[] args) {
        String[] cars = {"Mercedes", "BMW", "Audi", "Porsche", "Maybach", "Mercedes-AMG"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");


            String[] car = new String[6];
            car[0] = "Mercedes";
            car[1] = "BMW";
            car[2] = "Audi";
            car[3] = "Porsche";
            car[4] = "Maybach";
            car[5] = "Mercedes-AMG";
            System.out.println(car[5]);
        }


    }
}
