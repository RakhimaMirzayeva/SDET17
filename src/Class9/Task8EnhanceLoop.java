package Class9;

public class Task8EnhanceLoop {
    public static void main(String[] args) {
        //find the largest number expected output is 60
        int [] nums={10,23,25,56,60,20};
        int largest=0;
        for(int r:nums){
            if(r>largest&&r%2==0){
                largest=r;
            }
        }
        System.out.println(largest);
    }
}
