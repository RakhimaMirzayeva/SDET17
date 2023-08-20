package Class9;

public class Task2EnhanceLoop {
    public static void main(String[] args) {
        int [] numbers={10,20,4,3,8,45,96};
        int count=0;//put int outside the loop if you want it to count
        for (int i = 0; i <numbers.length ; i++) {

         if(numbers[i]>10){
             count++;
         }


            }
        System.out.println(count);
        }

    }

