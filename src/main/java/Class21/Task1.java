package Class21;

    //return num1<num2?num1:num2;(shorter way of writing if else)
    public class Task1 {
        public void min(int num1, int num2) {
            if (num1 < num2) {
                System.out.println("The minimum number is " + num1);
            } else {
                System.out.println("The minimum number is " + num2);

            }
        }

        public void min(double numA, double numB) {
            if (numA < numB) {
                System.out.println("The minimum number is " + numA);
            } else {
                System.out.println("The minimum number is " + numB);
            }
        }

        public static void main(String[] args) {
            Task1 t1 = new Task1();
            t1.min(23, 12.2);
        }
    }


