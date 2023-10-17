package Class28;

import java.util.Collection;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushoOne",40.0);
        makeup.put("Base",50.0);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("Eyeliner",25.5);
        System.out.println(makeup);//sorting all alphabetically.
        Collection<String> onlyKeys=makeup.keySet();//will show only keys
        System.out.println(onlyKeys);
        Collection<Double> onlyVal=makeup.values();//to show only values
        System.out.println(onlyVal);


    }
}
