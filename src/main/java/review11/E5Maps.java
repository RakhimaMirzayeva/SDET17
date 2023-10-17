package review11;

import java.util.HashMap;
import java.util.Map;

public class E5Maps {
    public static void main(String[] args) {
        Map<String,Double> studentsMarksMap=new HashMap<>();//HashMap implements Map
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",85.5);
        studentsMarksMap.put("Arthur",75.5);
        studentsMarksMap.put("Nelson",65.5);
        System.out.println(studentsMarksMap);
        //Set<Map.Entry<String, Double>> entries = studentsMarksMap.entrySet();
        //Set<Map.Entry<String,Double>> entrySet=studentsMarksMap.entrySet();
        var entrySet=studentsMarksMap.entrySet();//converting maps to sets of Entry,
        //there we can use RemoveIf method
        /*entrySet.removeIf(x->{
            if (x.getKey().contains("e")) {

                return true;
            }else{
                return false;
            }
        });*/
        //also can use this way

        entrySet.removeIf(x -> x.getKey().contains("e")||x.getValue()<90);
        System.out.println(studentsMarksMap);
    }
}
