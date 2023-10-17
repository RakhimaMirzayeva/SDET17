package review7;

public class E2InstanceVar {
    String name="jam";
    void printName(){

    }
    static void printInfo(){

    }

    public static void main(String[] args) {
        E2InstanceVar e1=new E2InstanceVar();
        e1.name="Jam";
        E2InstanceVar e2=new E2InstanceVar();
        e1.name="Scan";
        E2InstanceVar.printInfo();
    }
}
