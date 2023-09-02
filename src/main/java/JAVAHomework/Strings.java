package JAVAHomework;

public class Strings {
    public static void main(String[] args) {
      long startTime=System.currentTimeMillis();
      StringBuffer sbf=new StringBuffer("Hello");

        for (int i = 0; i <100000 ; i++) {
            sbf.append(" World");
        }
        System.out.println("Time taken to StringBuffer:"+(System.currentTimeMillis()-startTime));
         startTime=System.currentTimeMillis();
        StringBuilder sbd=new StringBuilder("Hello");

        for (int i = 0; i <100000 ; i++) {
            sbd.append(" World");
        }
        System.out.println("Time taken to StringBuilder:"+(System.currentTimeMillis()-startTime));

    }
    }


