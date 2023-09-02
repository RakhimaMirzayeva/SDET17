package Class5;

public class E2ANDOperator {
    public static void main(String[] args) {

        boolean goodCredit=true;
        boolean stableJob=true;
        boolean minimumAge=true;//use false to execute else statement
        if(goodCredit&&stableJob&&minimumAge){
            System.out.println("You can have a loan");
        }else {
            System.out.println("You need to fulfill all the requirements");
        }
    }
}
