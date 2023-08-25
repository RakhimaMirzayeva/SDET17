package HOMEWORK;

public class Replit80 {
    public static void main(String[] args) {
        double[] array1 = {1.4, 2.0, 3.3, 2.0};
        double[] array2 = {4.0, 1.5, 6.1, 1.0};
        double[] array3 = {1.2, 3.1, 4.0, 1.6};

        double[] doubledArray1 = doubleArrayElements(array1);
        double[] doubledArray2 = doubleArrayElements(array2);
        double[] doubledArray3 = doubleArrayElements(array3);

        printArray(doubledArray1);
        printArray(doubledArray2);
        printArray(doubledArray3);
    }

    public static double[] doubleArrayElements(double[] arr) {
        double[] doubledArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubledArray[i] = 2 * arr[i];
        }
        return doubledArray;
    }

    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}





