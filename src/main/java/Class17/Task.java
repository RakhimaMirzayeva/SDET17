package Class17;

public class Task {
 private String address;
 public Task(String userAddress){
     address=userAddress;
     System.out.println("Constructions with parameters");
 }
public Task(){
    System.out.println("No parameters");
}

    public static void main(String[] args) {
        new Task();
        new Task("Rakhima");
    }

}
