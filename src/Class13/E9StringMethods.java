package Class13;

public class E9StringMethods {
    public static void main(String[] args) {
        String str="Hi There how are you . I am Good. I am driving";
        String [] strs=str.split("[.]");
        //System.out.println(strs.length);
        System.out.println(strs[2]);//because it will split by the (.)
        System.out.println(strs[2].trim());//removes spaces before and after the sentence

    }
}
