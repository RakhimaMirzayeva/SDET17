package Class28;

import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> BestBuy = new TreeMap<>();
        BestBuy.put(7664847, "Printer");
        BestBuy.put(7879885, "TV");
        BestBuy.put(768347, "MacBook");
        BestBuy.put(316447, "Laptop");
        BestBuy.put(3164947, "PS5");


        var entries = BestBuy.entrySet();//do the same thing
        for (var e : entries) {
            System.out.println(e.getKey() + " " + e.getValue());

        }
    }
}
