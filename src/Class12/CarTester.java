package Class12;

public class CarTester {
    public static void main(String[] args) {
        Car mercedesObj=new Car();
        mercedesObj.name="Mercedes AMG";
        mercedesObj.model="Mercedes Benz";
        mercedesObj.carClass="4 door Coupe";
        mercedesObj.year=2023;
        System.out.println(mercedesObj.name);
        System.out.println(mercedesObj.model);
        System.out.println(mercedesObj.carClass);
        System.out.println(mercedesObj.year);
        mercedesObj.goTo();
        mercedesObj.fastness();
        mercedesObj.applyBreaks();
        System.out.println("******************");
        Car teslaObj=new Car();
        teslaObj.name="Tesla";
        teslaObj.model="Max 5 people can seat";
        teslaObj.carClass="It has a smooth break";
        teslaObj.year=2020;
        System.out.println(teslaObj.name);
        System.out.println(teslaObj.model);
        System.out.println(teslaObj.carClass);
        System.out.println(teslaObj.year);
        teslaObj.goTo();
        teslaObj.fastness();
        teslaObj.emergencyStop();
        teslaObj.applyBreaks();
    }
}
