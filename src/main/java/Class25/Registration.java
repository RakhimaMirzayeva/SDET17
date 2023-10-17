package Class25;


    public class Registration {
        private String email;
        private String userName;
        private String password;

        public Registration() {
            this.email = email = "";
            this.userName = userName ="";
            this.password = password="";
        }

        public void setEmail(String email){
            if (email.endsWith("@yahoo.com")){
                this.email=email;
            }else {
                System.out.println("Allowed only Yahoo email");
            }
        }
        public void setUserName(String userName){
            if (userName.length()>6){
                this.userName=userName;
            }else {
                System.out.println("User Name long 6 characters");
            }
        }
        public void setPassword(String password){
            if(password.length()> 6 && !password.contains(userName)){
                this.password=password;
            }else {
                System.out.println("Password long than 6 characters and cannot te user name");
            }
        }
        public String getEmail(){
            return email;
        }
        public String getUserName(){
            return userName;
        }
        public String getPassword(){
            return password;
        }


}



