package Class14;

public class T1Method {
    void parameters(int num1, int num2) {

        if (num1 > num2) {
            System.out.println("Larger number is  " + num1);
        } else {
            System.out.println("Larger number is  " + num2);
        }

    }

    void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even " + num);
        } else {
            System.out.println("The number is odd " + num);
        }
    }
}

