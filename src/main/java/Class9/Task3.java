package Class9;

public class Task3 {
    public static void main(String[] args) {
        //search the array for number 45 it is present in the array
        //print found
        int[] nums={10,77,25,56,60,20,45,23};
       for(int n: nums){
           if(n==45){//you can change to any number
               System.out.println("Found 45");
               break;//the loop will stop here so it won't go any further
           }
       }

        }
    }

