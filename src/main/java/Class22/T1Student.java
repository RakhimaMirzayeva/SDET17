package Class22;

public class T1Student {
    void homework() {
        System.out.println("Student is doing homework");
    }

    void exam() {
        System.out.println("student is taking an exam");
    }

    void study() {
        System.out.println("Student is studying");
    }

    void play() {
        System.out.println("Student likes to play Chess");
    }

    void extraCurricular() {
        System.out.println("Student likes to do extra curricular activites");
    }
}


class SyntaxStudent extends T1Student {
    void play() {
        System.out.println("Student likes to play cards");
    }
}



class CollegeStudent extends T1Student {
    @Override
    void extraCurricular() {
        System.out.println("Student likes to nap instead");

    }
}

class SchoolStudent extends T1Student {
    @Override
    void homework() {
        System.out.println("Student doesnt like to do homework, instead likes to chill all day");
    }

}
