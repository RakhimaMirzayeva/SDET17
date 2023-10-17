package Class28;

import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushOne",40.0);
        makeup.put("Base",50.0);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
//remove method is not present in set, but in entrySet it present as removeIf
        //makeup.entrySet().removeIf(x->x.getKey().contains("a"));//we remove makeups with letter a
        //System.out.println(makeup);
        //makeup.entrySet().removeIf(x->x.getValue()>30);will remove makeup 30 and more
        //System.out.println(makeup);
        makeup.entrySet().removeIf(x->x.getKey().contains("a")&&x.getValue()>30);
        System.out.println(makeup);




    }
}
