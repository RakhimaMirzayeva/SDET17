package JAVAHomework;

public class HWPracticeBreakContinue {
    public static void main(String[] args) {
        /*
        BREAK AND Continue:
        Special keywords that can be used within loops
        Break: exits the loop regardless of the condition.
        Continue: skips the rest of the loop's body. Continu executing the loops as if we
         finished executing the body.
         */
        for (int i = 1; i <=10; i++) {
            if(i%2==0)//print only odd numbers
                continue;
            System.out.println(i+" ");

        }
    }
}
