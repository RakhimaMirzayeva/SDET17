package Class9;

public class Task1EnhanceLoop {
    public static void main(String[] args) {

        boolean[] cond={true,false,true,false,true,true};

        //for (boolean b : cond) {//use iter
        int count=0;
        for (int i = 0; i < cond.length; i++) {
            if(cond[i]) {
                count++;
                System.out.println(count);
            }
        }
        }

        }






