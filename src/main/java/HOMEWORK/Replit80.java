package HOMEWORK;

public class Replit80 {
    public static void main(String[] args) {
        double[][] numbers = {
                {1.4,2.0,3.3,2.0},
                {4,1.5,6.1,1.0},
                {1.2,3.1,4.0,1.6}
        };


        for(double[] numArray:numbers){
            for(double num:numArray){
                System.out.print(2*num+" ");
            }
            System.out.println();
        }
    }
    }
