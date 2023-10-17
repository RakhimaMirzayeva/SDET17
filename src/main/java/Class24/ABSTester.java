package Class24;

public abstract class ABSTester {//we can have constructor here
    int age;
    ABSTester(){

    }
        private void Batch17(){
            System.out.println("Its possible");
        }

}
interface A{//but we can not have constructor here
    private void tester(){
        System.out.println("Private is possible in interface");
    }
}
class Tester{
    public static void main(String[] args) {
        //A a=new A();

    }
}