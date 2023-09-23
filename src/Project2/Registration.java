package Project2;


    /*
   Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
    */
    public class Registration {
        String email;
        String userName;
        String password;
        public void setEmail(String email){
            if(email.endsWith("@yahoo.com")){
                this.email=email;
            }else{
                System.out.println("Invalid user name format");
            }

        }
        public void setUserName(String userName){
            if(!userName.isEmpty()&&userName.length()>6){
                this.userName=userName;
            }else{
                System.out.println("Invalid username. Please input valid username");
            }
        }
        public void setPassword(String password){
            if(!password.isEmpty()&& password.length()>6&& !password.contains(userName)){
                this.password=password;
            }else{
                System.out.println("Invalid password.Please input valid password, password should not be empty and should not be same as username");


            }
        }

        public void printInfo(){
            System.out.println(email);
            System.out.println(userName);
        }

        public static void main(String[] args) {
            Registration reg=new Registration();
            reg.setEmail("rakhimaMirzayeva@yahoo.com");
            reg.setUserName("RakhimaMirzayeva");
            reg.setPassword("rakhima123");
            reg.printInfo();


        }
    }




