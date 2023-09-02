package Class14;

public class E2Methods {
    int add(int num1, int num2) {//we removed void and add int and return, because
        //we want to store our data type
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }
     int multiply(int num){
        int result=num*10;
        return result;
    }
}
