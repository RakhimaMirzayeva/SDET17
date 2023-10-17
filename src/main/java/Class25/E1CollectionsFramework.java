package Class25;

import java.util.Arrays;

public class E1CollectionsFramework {
    public static void main(String[] args) {
        String[] arr=new String[100];//reserving 100 spaces
        arr[1]="Rakhima";//using one space
        System.out.println(Arrays.toString(arr));//wasting  a lot of space
    }
}
