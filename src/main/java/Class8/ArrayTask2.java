package Class8;

public class ArrayTask2 {
    public static void main(String[] args) {
        int [] numbers={20,29,48,69,80};
        for (int i = 0; i <numbers.length ; i+=2) {
            System.out.println(numbers[i]+" ");
            //also will work with this
            //if(numbers[i]%2==0){we will have the same output
        }


    }
}
