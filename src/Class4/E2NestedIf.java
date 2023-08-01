package Class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter=true;
        String jacketColor="Black";//if you put "Blue" then it will show only
        //first if.

        if(winter==true){
            System.out.println("Its very cold");

            if(jacketColor.equals("Red")){
                System.out.println("Lets go with Red Nike shoes");

            }else{
                System.out.println("Lets go with the blue ones");
            }
        }else {
            System.out.println("No need to wear jackets");
        }

    }
}
