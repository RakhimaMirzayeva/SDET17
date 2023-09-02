package Class16;

public class Task3 {
    public static void main(String[] args) {

        System.out.println(getVowels("Rakhima"));

    }

    private static String getVowels(String str){
      return  str=str.replaceAll("[aeiouAEIOU]","");
    }
}
