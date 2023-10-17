package review10;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Rakhima");//0
        name.add("Abdulla");//1
        name.add("Aydin");//2
        name.add("ALi");//3
        name.add("Halit");//4
        name.add("Shafika");//5
        name.add("Shafika");
        System.out.println(name.size());
        System.out.println(name.get(2));//we will see Aydin
        //System.out.println(name.remove(5));
        //System.out.println(name.remove("Shafika"));//because it was already deleted before on top and now it doesn't
        //see it
        ///System.out.println(name.contains("Shafika"));
        name.removeIf(x->x.equals("Shafika"));
        System.out.println(name);

    }
}
