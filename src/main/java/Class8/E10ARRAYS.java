package Class8;

public class E10ARRAYS {
    public static void main(String[] args) {
//we were creating the arrya and also initializing it
        String [] fruit={"Apple","Orange","Strawberry","Melon","Watermelon","Banana"};
        fruit[1]="Mango";//this is to change any fruits that i want from array
        System.out.println(fruit.length);// this gives us number of items in the array
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}
