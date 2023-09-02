package Class9;

public class Task2 {
    public static void main(String[] args) {
//go through the arrya and replace all the negative numbers with 0
        int[] nums={10,77,25,56,60,20,-10,-5};
        nums[6]=0;
        nums[7]=0;
        for (int i = 0; i <nums.length ; i++) {

            System.out.println(nums[i]);
        }
    }
}
