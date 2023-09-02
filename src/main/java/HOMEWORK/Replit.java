package HOMEWORK;

public class Replit {
    public static void main(String[] args) {
        String result1 = censorLetter("computer science", 'e');
        String result2 = censorLetter("trick or treat", 't');

        System.out.println(result1); // Should print "comput*r sci*nc*"
        System.out.println(result2); // Should print "*rick or *rea*"
    }

    public static String censorLetter(String input, char letter) {
        // Create a StringBuilder to build the resulting string
        StringBuilder censoredString = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the current character matches the specified letter, replace it with "*"
            if (currentChar == letter) {
                censoredString.append('*');
            } else {
                censoredString.append(currentChar);
            }
        }
        return censoredString.toString();
    }
}