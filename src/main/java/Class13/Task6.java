package Class13;

public class Task6 {
    public static void main(String[] args) {
        String str = "Whatisyourname";
        String[] strs = str.split("[\\s]");
        System.out.println(strs.length);
        for (String s : strs) {
            System.out.println(s);

        }
    }
}
