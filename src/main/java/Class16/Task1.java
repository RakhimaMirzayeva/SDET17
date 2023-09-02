package Class16;

public class Task1 {
    /*
    create a method that will accept an array as parameters and
    will return a summary of all elements from that array.Method
    should be visible only within same package and accessible by //Default method because it says same package
    the creating an instance/object of the class.
     */
    public static void main(String[] args) {
        Task1 t1=new Task1();
        int [] array={10,25,15,30};
        System.out.println(t1.sumArray(array));
    }

   int  sumArray(int[] arr){
       int sum=0;
       for(int n:arr){
           sum=sum+n;
       }
       return sum;
   }


    }

