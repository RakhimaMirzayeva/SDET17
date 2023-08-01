package Class4;

public class E5NestedIf {
    public static void main(String[] args) {

        double mortgagePrice=100000;
        double mortgageRate=4.5;

        if (mortgageRate>=4.5) {
            System.out.println("User will not buy a house");

        }else{
            System.out.println("User consider buying the house");
        }
        if (mortgagePrice>=500000){
            System.out.println("user will take a loan");
        }else System.out.println("user will pay a cash");

    }
}
