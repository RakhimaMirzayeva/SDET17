package Class10;

public class NestedLoops {
    public static void main(String[] args) {
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {

                for (int j = 0; j < 60; j++) {
                    for (int i = 0; i < 60; i++) {
                        if (i < 10 && j < 10) {
                            System.out.println("0" + j + ":0" + i);

                        } else if (i < 10 && j > 10) {
                            System.out.println("0" + j + ":" + i);
                        } else {
                            System.out.println(j + ":" + i);
                        }

                    }
                    ;
                }
            }
        }
    }
}
