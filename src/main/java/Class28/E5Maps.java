package Class28;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E5Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushOne",40.0);
        makeup.put("Base",50.0);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
   //Maps are collection of entries. Entries are collection of ky value pairs.
       Set<Map.Entry<String,Double>> entries= makeup.entrySet();
      for(Map.Entry<String,Double> e:entries){
          System.out.println(e.getKey()+" "+e.getValue());
      }
    }
}
