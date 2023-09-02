package CodingHomework;

public class E8Coding {
    public static void main(String[] args) {

        int[] num={35,35,14,11,4,100,120,115};
        int maxNum=num[0];
        int minNum=num[0];
        for(int number: num){
            if(number>maxNum){
                maxNum=number;
            }
            if(number<minNum){
                minNum=number;
            }

        }
        System.out.println("Maximum number is "+maxNum);
        System.out.println("Minimum number is "+minNum);
    }
}
