package review11;

import java.util.HashMap;
import java.util.Map;

public class E4Maps {
    public static void main(String[] args) {
        Map<String,Double> studentsMarksMap=new HashMap<>();//HashMap implements Map
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",85.5);
        studentsMarksMap.put("Arthur",75.5);
        studentsMarksMap.put("Nelson",65.5);
        System.out.println(studentsMarksMap);
        studentsMarksMap.forEach((k,v)-> System.out.println(k+" "+v));//will print all the values
       final  int[] counter=new int[1];
        studentsMarksMap.forEach((k,v)->{
            if(k.contains("a")||v>94){//if someone has more than 94 and if they contain letter a
                System.out.println("1 "+k+" "+v);
                counter [0]++;
            }
        });
        System.out.println(counter[0]);
    }
}
