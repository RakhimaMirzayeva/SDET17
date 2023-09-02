package Class13;

public class E7StringMethods {
    public static void main(String[] args) {

        String str = "NAMEJabjcd234()55!@+/$%&RAKhima";
        System.out.println(str.replaceAll("[A-Z]", "="));//this [A-Z] means if enywhere any letter
        //present then find it, and replace it with anything
        System.out.println(str.replaceAll("[A-C]", "="));//to print all Upper cases
        System.out.println(str.replaceAll("[a-z]", "+"));//to print all lower case
        System.out.println(str.replaceAll("[0-9]", "="));//print the numbers
        System.out.println(str.replaceAll("[0-9]", ""));//this way numbers will be removed
        System.out.println(str.replaceAll("", ""));
        System.out.println(str.replaceAll("[A-z]", ""));//removes all Upper and Lower cases.
        System.out.println(str.replaceAll("[A-z]", "="));//print all Upper and Lower cases.
        System.out.println(str.replaceAll("[&-;]","="));//to replace special characters(look from ascii table)
        System.out.println(str.replaceAll("[A-Z0-58-9-j]",""));//no space in between(remove upper case and numbers)
        System.out.println(str.replaceAll("[AMJ35]",""));//simply specified what you want to remove
        System.out.println(str.replaceAll("\\d","="));//means to remove all digits
        System.out.println(str.replaceAll("[abc]","="));
}}
