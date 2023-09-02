package Class17;

public class Students {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

   Students(String sName,double sGrade1,double sGrade2,double sGrade3){
        name=sName;
        grade1=sGrade1;
       grade2=sGrade2;
       grade3=sGrade3;
    }
    public void printAvg(){
       double avg=0;
       avg=(grade1+grade2+grade3)/3;
        System.out.println(name+" Got "+avg);

    }

    }


