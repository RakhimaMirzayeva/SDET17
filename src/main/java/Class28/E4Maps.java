package Class28;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushoOne",40.0);
        makeup.put("Base",50.0);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("Eyeliner",25.5);
        //prints both keys and values
        //makeup.forEach((key,value)-> System.out.println(key+" "+value));//you can call them x,y or k,v
        //prints only keys
        //makeup.forEach((key,value)-> System.out.println(key));
        //prints only values
        //makeup.forEach((key,value)-> System.out.println(value));
        //whenever you need more than one parameter, you need to put parenthesis
        //similarly if we want to have more than one line of code we need to have curly brackets as well
        makeup.forEach((key,value)->{
            if(key.contains("a")){
                System.out.println(value);
            }
        });//will print only the one that contains letter "a"
      makeup.forEach((key,value)-> System.out.println(key+" "+value));//this is lambda expression


    }
}

