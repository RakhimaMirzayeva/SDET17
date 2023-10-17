package Class28;

import java.util.LinkedHashMap;


public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> student=new LinkedHashMap<>();
        student.put(10,"Adam");//no add methods here we replace them with put.
        student.put(20,"Deepali");
        student.put(30,"Marta");
        student.put(40,"Alina");
        student.put(50,"Ayesha");
        System.out.println(student);//it will maintain the order because its LinkedHasMap
        student.remove(30);//will remove marta
        System.out.println(student);
        student.replace(20,"Rahima");
        System.out.println(student);


    }
}
