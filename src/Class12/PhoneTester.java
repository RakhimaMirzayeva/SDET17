package Class12;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphoneObj=new Phone();
        iphoneObj.model="Iphone 14";
        iphoneObj.speed="Fast";
        iphoneObj.pixel=123;
        System.out.println(iphoneObj.model);
        System.out.println(iphoneObj.speed);
        System.out.println(iphoneObj.pixel);
        iphoneObj.camera();
        iphoneObj.rearCamera();
        iphoneObj.speed();
    }
}
