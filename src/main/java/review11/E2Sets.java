package review11;

import java.util.*;

public class E2Sets {
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();//HashSets  Implements  Sets Interface
       numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(60);
        numbers.add(50);
        numbers.add(80);
        System.out.println(numbers);//doesn't keep the order of which i typed
        //Fast but doesn't remember the order
        //Interview Question too
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(10);
        System.out.println(nums);//original set
        LinkedHashSet<Integer> numSet=new LinkedHashSet<>(nums);
       // System.out.println(numSet);//new set without duplicates, but still in LinkedHasSet,will not work for me
       // nums=new ArrayList<>(numSet);//converting back to Arraylist(original) and without duplicates
       // System.out.println(nums);//job is done
        nums.clear();//removing all elements, we want to make that list will not contain any old elements
        nums.addAll(numSet);
        System.out.println(numSet);//adding them back

    }
}
