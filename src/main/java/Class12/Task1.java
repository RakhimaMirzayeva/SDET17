package Class12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your username");
        String username=scanner.next();
        System.out.println("Please Enter your password");
       String password=scanner.next();
        System.out.println("Please confirm your password");
        String confirmPassword=scanner.next();
          if(username.isEmpty()||password.isEmpty()){
              System.out.println("Username and Password cannot be empty");
        }else if(password.length()<8){
              System.out.println("Password is too short");
          }else if(password.contains(username)){
              System.out.println("Password cannot contain the username");
          }else if(!password.equals(confirmPassword)){
              System.out.println("Password do not match");
          }else{
              System.out.println("Your username and password has been created");
          }
    }
}
