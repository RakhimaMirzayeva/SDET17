package JAVAHomework;

public class HW3Method {
    String getGrade(int grade){
        if(grade>90){
            return "A";
        }else if(grade>80){
            return "B";
        }else if(grade>70){
            return "C";
        }else if(grade>50){
            return "D";
        }else{
            return "F";
        }
    }
}
