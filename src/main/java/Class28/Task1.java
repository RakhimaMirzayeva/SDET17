package Class28;

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        //Create a map of a building. Store floor number and its associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        //Check how many entries you have?
        //Update company on a 4th floor
        //Remove company on the 7th floor
        //Print your map
        LinkedHashMap<Integer,String> floor=new LinkedHashMap<>();//to maintain the order we used LinkedHashMap
        floor.put(1,"Google");
        floor.put(2,"Syntax");
        floor.put(3,"Firefox");
        floor.put(4,"Safari");
        floor.put(5,"Mozilla");
        floor.put(6,"Chrome");
        floor.put(7,"Edge");

        System.out.println(floor.size());
        System.out.println("**************");
        System.out.println(floor);
        System.out.println("****************");

        System.out.println(floor.replace(4,"Syntax")+"  Floor 4 Replaced with Syntax");
        System.out.println("***************");

        System.out.println(floor.remove(7)+" Floor 7 Removed");
        floor.forEach((key,value)-> System.out.println(key+" "+value));
    }
}
