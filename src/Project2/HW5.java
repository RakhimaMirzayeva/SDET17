package Project2;

import java.util.Arrays;

public class HW5 {
    /*
   Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
    */
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";
        if(word1.length() !=word2.length()){
            System.out.println("This is not an anagram");
            char[] charArray1=word1.toCharArray();
            char[] charArray2=word2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if(Arrays.equals(charArray1,charArray2)){
                System.out.println("This words are anagrams");
            }else{
                System.out.println("This words are not anagrams");
            }

        }
    }
}


