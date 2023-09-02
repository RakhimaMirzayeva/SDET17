package JAVAHomework;

public class HW4Method {
    String  primeNum( int num){
        if( num<=1){
            return num+" is not a prime number";
        }
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
        if(num%i==0){
            return num+" is not a prime number";
        }
        }
        return num+" is a prime number";
    }
}
