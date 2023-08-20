package review3;

public class TaskWhileLoop {
    public static void main(String[] args) {
//62, 63, 66, 67, 68, 69, 70--No 64, 65
        int i=62;// starting point
        while(i<=70){//ending point

        if(i !=64 && i !=65) { //also can be written like this if(i !=64)
            System.out.print(i+" ");                         //if(i !=65)
        }
       i++;//you never put this condition inside the if condition,
            //otherwise it will stop, and not print next loop.

        }

    }
}
