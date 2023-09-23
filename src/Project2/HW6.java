package Project2;

public class HW6 {
    /*
  Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
   */
    public static char nonRepeatingCharacter(String input){
        for(char c:input.toCharArray()){
            if(input.indexOf(c)==input.lastIndexOf(c)){
                return c;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {

        String input="abracadabra";
        char result=nonRepeatingCharacter(input);
        if(result !=' '){
            System.out.println("This is the first non repeating character: "+result);

        }else{
            System.out.println("There is no non repeating character ");
        }



    }

}
