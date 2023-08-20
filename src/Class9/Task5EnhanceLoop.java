package Class9;

public class Task5EnhanceLoop {
    public static void main(String[] args) {
        int [] nums={10,23,25,56,45,20};
        int largest=0;
        for(int t:nums) {
            if (t>largest) {
                largest=t;
            }

        }
        System.out.println(largest);
    }
    }

