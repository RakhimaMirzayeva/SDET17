package Class5;

public class E3ANDOperator {
    public static void main(String[] args) {

        double math=92;
        double physics=95;//change to any number that is lower than 90 we will get an else output
        double chemistry=91;
        if(math>90 &&physics>90 &&chemistry>90){
            System.out.println("You are doing great!");
        }else{
            System.out.println("You need to work harder");
        }
    }
}
