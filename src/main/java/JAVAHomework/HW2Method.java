package JAVAHomework;

public class HW2Method {
    String palindrome(String word){
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse=reverse+word.charAt(i);
        }
        if(word.equals(reverse)){
            return word+" This word is a palindrome ";
        }else{
            return word+" This word is not a palindrome";
        }
    }
}
