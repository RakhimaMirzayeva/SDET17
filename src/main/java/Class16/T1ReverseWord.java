package Class16;

public class T1ReverseWord {
    //how would you reverse a String word by word?
    public static void main(String[] args) {
        String str = "This is sentence I want to reverse";
        StringBuilder sb = new StringBuilder("This is sentence I want to reverse");
        String[] arr = str.split(" ");//you can also put "//s"
        //this will split word by word
        //System.out.println(arr[0]);//this is to just print one word
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            String word = arr[i];
            String reversed = reverseStr(word);
            System.out.print(reversed + " ");

            // System.out.println(reverseStr("This"));
        }
        //sb.reverse();
        //System.out.println(sb);

        // str.length()//parenthesis means a method(parameters)
        //arr.length;//this is the Property

    }


    static String reverseStr(String inputStr){
        String reversed="";
        for (int i = inputStr.length()-1; i >=0; i--) {//for a reverse loop
            reversed=reversed+inputStr.charAt(i);//charAt used in reverse strings

        }
        return reversed;
    }
}
