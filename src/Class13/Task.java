package Class13;

public class Task {
    public static void main(String[] args) {
        //count the letter "a"
        String str="Batch 17 is great.";


    int count=0;//this is to hold the count

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a')
                //if(str.charAt(i)=='a'||str.charAt(i)=='A'){ to count uppercase to
                            count++;
        }
        System.out.println(count);

    }
}
