package Class19;

public class Teacher {
    public class teacher {
        String name;
        String subject;

        void teach() {
            System.out.println("today we will learn java");
        }

        void grade() {
            System.out.println("grading tests");
        }

        void talk() {
            System.out.println("no class today");
        }

        void eat() {
            System.out.println("nhum nhum ");
        }

    }

    class MathTeacher extends teacher {

        int schoolHours;

        void printHours() {
            System.out.println(schoolHours);

        }
    }

    class ChemistryTeacher extends MathTeacher {

        int numOfClasses;

        void printClasses() {
            System.out.println(numOfClasses);

        }
    }

    class PianoTeacher extends ChemistryTeacher {

        int numOfStudents;

        void printStudents() {
            System.out.println(numOfStudents);

        }
    }
}