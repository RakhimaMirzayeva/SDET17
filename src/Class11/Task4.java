package Class11;

public class Task4 {
    public static void main(String[] args) {

        String[][] students={{"Aysha","Guilia","John","Deepali"},
                {"A","A+","C","B"},
        };

        for (int i = 0; i <4 ; i++) {
            if(students[1][i].equals("A")||students[1][i].equals("B")){
                System.out.println(students[0][i]);
            }
            //System.out.println(students[1][i]);//for grades
            //System.out.println(students[0][i]);
        }
        
    }
}
