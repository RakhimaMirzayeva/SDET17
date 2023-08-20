package Class9;

public class Task6EnhanceLoop {
    public static void main(String[] args) {
        int [] nums={-10,-23,-25,-56,-45,-20};
        int largest=nums[0];//because the number that is closer to the 0 is the largest number.
        for(int t:nums) {
            if (t>largest) {
                largest=t;
            }

        }
        System.out.println(largest);
    }
    }

