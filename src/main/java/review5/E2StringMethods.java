package review5;

public class E2StringMethods {
    public static void main(String[] args) {
        String str = "This is a java class";
        boolean starts = str.startsWith("T");
        System.out.println(starts);//checking if beginning is true
        System.out.println(str.endsWith("class"));//checks if ending is true
        System.out.println(str.contains("java"));//checking if there is a word java
        str.indexOf('a');//ascii table number is 97 for 'a'
        int num = 'a';//Type casting(explicit/emplicit)
        System.out.println(num);
        System.out.println(str.indexOf(97));//it will show in what number first 'a' present
        char c=str.charAt(8);
        System.out.println(c);
        //String.valueOf(12);//its a static method becausewe are not using an object
//Static methods don't require using an object



    }
}

