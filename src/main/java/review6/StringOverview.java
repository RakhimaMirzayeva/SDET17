package review6;

public class StringOverview {
    public static void main(String[] args) {
        String phone="IPhone";
        String color=new String();
        color="Yellow";

        String day=new String("Thursday");
        String sentence="    Today is September 7     ";
        int size=sentence.length();
        System.out.println(size);
        sentence=sentence.trim();
        System.out.println(sentence);//Today is September 7

        String[] words=sentence.split(" ");
        System.out.println(words[2]);

        String modifiedNewStr=sentence.replace("Today","Tomorrow");
        System.out.println(modifiedNewStr);

        String str="Hi Hi Friends";
        str=str.replace("Hi","Hello");
        System.out.println(str);
       char letter=str.charAt(2);
        System.out.println(letter);
        int indexOfChar=str.indexOf('F');
        System.out.println(indexOfChar);



    }
}
