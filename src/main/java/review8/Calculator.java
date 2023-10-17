package review8;

public class Calculator {
    //you can not store the result of void method
    void add(int a,int b){//never use void if you want a return in another class
        System.out.println(a+b);
    }
int add(int a,int b,int c){
    return a+b+c;

}
int add(int...arr){//real life calculator
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
}


    }

