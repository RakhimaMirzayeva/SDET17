package review11;

import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        Map<String,Double> studentsMarksMap=new HashMap<>();//HashMap implements Map
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",85.5);
        studentsMarksMap.put("Arthur",75.5);
        studentsMarksMap.put("Nelson",65.5);
        System.out.println(studentsMarksMap);
        /*studentsMarksMap.replaceAll((k,v)->{//will replace all values with 0.0
           return 0.0;
        });
        System.out.println(studentsMarksMap);
    */
        studentsMarksMap.replaceAll((k,v)->{//replaceAll will replace every item one by one.

            if(k.contains("a")){
                return 10.0;
            }else{
                return v;//returning original value
            }
        });
        System.out.println(studentsMarksMap);
    }

}
