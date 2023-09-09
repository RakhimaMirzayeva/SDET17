package HOMEWORK;

public class Student {

        private int year;
        private String schoolName;
        private int batchNum;
        public Student(int year,String schoolName,int batchNum){
            this.year=year;
            this.schoolName=schoolName;
            this.batchNum=batchNum;
        }
        public void printInfo(){
            System.out.println("I am a student of batch");
        }
        public static void main(String[]args){
            Student student=new Student(2021,"Syntax",9);
            student.printInfo();
        }
    }

