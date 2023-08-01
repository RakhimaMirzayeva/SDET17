package Class4;

public class Donor {
    public static void main(String[] args) {

        int age = 18;
        int weight=120;
        if (age >= 18) {
            System.out.println("You are eligible to donate");
        } else {
            System.out.println("Not eligible to donate the blood");
        }

        if(weight>=110){
            System.out.println("He/She is eligible donor");
        }else{
            System.out.println("We cannot accept such a patient");
        }
    }
}
