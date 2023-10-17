package Class25;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList();
        arr.add("Halit");
       // arr.add(4);we get error because we put String we only can store String
        arr.add("Aydin");
        arr.add("Ali");
        System.out.println(arr.get(0));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains('r'));//checking if there is letter 'r'
        System.out.println(arr.contains("ABHsj"));
        System.out.println(arr.indexOf("Halit"));
    }
}
