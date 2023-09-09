package HOMEWORK;

import java.util.Scanner;

public class Replit99 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Input:");
        String givenString=inp.nextLine();
        String replaceAllString=givenString.replaceAll("\\s","").toLowerCase();
        boolean result=false;
        int i=0;
        int j=replaceAllString.length()-1;
        while(i<=j){
            if(replaceAllString.charAt(i)==replaceAllString.charAt(j)){
                result=true;
            }else{
                break;
            }
            i++;
            j--;
        }
        System.out.println(result);
    }
}


