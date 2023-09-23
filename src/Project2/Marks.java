package Project2;



/*
    We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code

  */

    abstract class Marks {
        abstract double getPercentage();

    }
    class A extends Marks {
        private double sub1Marks;
        private double sub2Marks;
        private double sub3Marks;

        public A(double sub1Marks, double sub2Marks, double sub3Marks) {
            this.sub1Marks = sub1Marks;
            this.sub2Marks = sub2Marks;
            this.sub3Marks = sub3Marks;
        }

        @Override
        double getPercentage() {
            return (sub1Marks + sub2Marks + sub3Marks)/ 3.0;
        }

    }
    class B extends Marks{
        private double sub1Marks;
        private double sub2Marks;
        private double sub3Marks;
        private double sub4Marks;

        public B(double sub1Marks, double sub2Marks, double sub3Marks,  double sub4Marks) {
            this.sub1Marks = sub1Marks;
            this.sub2Marks = sub2Marks;
            this.sub3Marks = sub3Marks;
            this.sub4Marks = sub4Marks;
        }
        @Override
        double getPercentage(){
            return( sub1Marks+ sub2Marks+ sub3Marks+ sub4Marks)/4.0;
        }

        public static void main(String[] args) {
            A  studentA=new A(90,80,92);
            System.out.println("Student A grade average is: "+studentA.getPercentage()+"%");
            B studentB=new B(95,85,75,99);
            System.out.println("Student B grade average is: " +studentB.getPercentage()+"%");


        }

    }
