package Class9;

public class Task1 {
    public static void main(String[] args) {
        //find the smallest number expected answer -10
        int[] nums={10,77,25,56,60,20,-10,-5};
        int smallest=0;
        for(int r:nums){
            if(r<smallest&&r%2==0){
                smallest=r;
            }
        }
        System.out.println(smallest);
    }
    }

