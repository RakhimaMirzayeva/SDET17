package Class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        ArrayList<Double> priceOfMakeup = new ArrayList<>();
        priceOfMakeup.add(25.5);
        priceOfMakeup.add(35.5);
        priceOfMakeup.add(30.5);

        ArrayList<Double> priceOfFruit = new ArrayList<>();
        priceOfFruit.add(2.5);
        priceOfFruit.add(3.99);
        priceOfFruit.add(5.99);

        ArrayList<Double> priceOfDairy = new ArrayList<>();
        priceOfDairy.add(1.99);
        priceOfDairy.add(2.99);
        priceOfDairy.add(3.99);


        Map<String, ArrayList<Double>> arrayListMap = new HashMap<>();
        arrayListMap.put("pricesOfMakeup", priceOfMakeup);
        arrayListMap.put("pricesOfFruit", priceOfFruit);
        arrayListMap.put("pricesOfDairy", priceOfDairy);
        System.out.println(arrayListMap);
        System.out.println("**************");
        System.out.println(priceOfMakeup);
        System.out.println(priceOfFruit);
        System.out.println(priceOfDairy);
    }
}
