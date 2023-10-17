package review11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {//to store Keys and Values at the same time
        Map<String,Double> studentsMarksMap=new HashMap<>();//HashMap implements Map
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",85.5);
        studentsMarksMap.put("Arthur",75.5);
        studentsMarksMap.put("Nelson",65.5);
        System.out.println(studentsMarksMap);

        LinkedHashMap<String,Double> studentsMarksMap2=new LinkedHashMap<>();//will print from highest to lowest values
        studentsMarksMap2.put("Habib",95.5);
        studentsMarksMap2.put("Madina",85.5);
        studentsMarksMap2.put("Arthur",75.5);
        studentsMarksMap2.put("Nelson",65.5);
        System.out.println(studentsMarksMap2);

        TreeMap<String,Double> studentsMarksMap3=new TreeMap<>();//will print based on the alphabetical order
        studentsMarksMap3.put("Habib",95.5);
        studentsMarksMap3.put("Madina",85.5);
        studentsMarksMap3.put("Arthur",75.5);
        studentsMarksMap3.put("Nelson",65.5);
        System.out.println(studentsMarksMap3);
    }
}
