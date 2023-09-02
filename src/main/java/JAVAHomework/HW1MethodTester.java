package JAVAHomework;

public class HW1MethodTester {
    public static void main(String[] args) {
        HW1Method input=new HW1Method();
        System.out.println("Greetings for Turkey "+input.countryLanguages("Turkey"));
        System.out.println("Greetings for Russia"+input.countryLanguages("Russia"));
        System.out.println("Greeting for Italy"+input.countryLanguages("Italy"));
        System.out.println("Greetings for China"+input.countryLanguages("China"));
        System.out.println("Greetings for USA"+input.countryLanguages("USA"));
    }

}
