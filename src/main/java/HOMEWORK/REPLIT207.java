package HOMEWORK;

import java.util.HashMap;
import java.util.Map;

public class REPLIT207 {
    public static void main(String[] args) {

                Map<String,String> obj=new HashMap<>();
                obj.put("FIVE","EEE");
                obj.put("ONE","AAA");
                obj.put("FOUR","DDD");
                obj.put("TWO","BBB");
                obj.put("THREE","CCC");
                System.out.println("HashMap Before Replace :");
                for(Map.Entry<String,String> entry:obj.entrySet()){
                    System.out.println(entry.getKey()+":"+entry.getValue());
                }
                obj.put("THREE","ASEL");
                obj.put("FIVE","SUMAIR");
                System.out.println("-----------");
                System.out.println("HashMap After Replace :");
                for(Map.Entry<String,String> entry:obj.entrySet()){
                    System.out.println(entry.getKey()+":"+entry.getValue());
                }
            }

        }



