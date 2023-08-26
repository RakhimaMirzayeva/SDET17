package Class13;

public class E5MethodChanging {
    public static void main(String[] args) {
        String str="Batch 17 is good";
        String newStr=str.replace("good","great");
        System.out.println(newStr);

        //this method is used to replace with a new code everywhere
        //if we have multiple words then we need multiple .replace
        String name="Rakhima";
        String newName=name.replace("Rakhima","Abdulla");
        System.out.println(newName);
    }
}
