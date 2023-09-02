package HOMEWORK;

public class Replit99 {
    public static void main(String[] args) {
        String input = "Never odd or even"; // Replace with your input string

        boolean isPalindrome = checkPalindrome(input);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(String input) {
        // Remove spaces and convert to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;


    }
}
