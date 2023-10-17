package Class25;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration r = new Registration();
        r.setEmail("Rakhima@yahoo.com");
        r.setUserName("user321");
        r.setPassword("Password");

        System.out.println("Email: "+r.getEmail());
        System.out.println("Username: "+r.getUserName());
        System.out.println("Password: "+r.getPassword());

    }
}
