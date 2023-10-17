package Class22;

public class T1StudentTester {
    public static void main(String[] args) {

        T1Student[] arr = {new T1Student(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].study();
            arr[i].play();
            arr[i].extraCurricular();

        }

    }
}

