package Class26;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Porsche");
        cars.add("BMW");
        cars.add("Lamborghini");
        cars.add("Ferrari");
        System.out.println(cars);
        System.out.println("*****************");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }
    }
}
