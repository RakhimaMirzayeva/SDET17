package Class8;

public class NestedLoopTask {
    public static void main(String[] args) {
        int i=0;
        while(i<4){
            int j=1;
            while(j<7){
                if(j!=3){
                    System.out.print(j+" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
