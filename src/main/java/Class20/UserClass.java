package Class20;

public class UserClass {
   protected String name;
    protected int telNum;
    private String address;
    public UserClass(String name,int telNum,String address){
        this.name=name;
        this.telNum=telNum;
        this.address=address;
    }
     void printInfo(){
         System.out.println(name+" "+telNum+" "+address);

     }
}
class UserInfo extends UserClass{
    String address;
    public UserInfo(String name,int  telNum,String address){

        super(name,telNum,address);
     this.address=address;
    }
}
class UserDetails extends UserClass {
    String address;

    public UserDetails(String name, int telNum, String address) {
        super(name, telNum, address);
    }
}

