package Class20;

public class Shape {

    float radius=3;
     float pi= 3.14F;

}
class circle extends Shape{

    void area(){
        double area=radius*radius*Math.PI;
        System.out.println("Area of circle : " + area);
    }
}
class test{
    public static void main(String[] args) {
        circle obj=new circle();
        obj.area();

    }
}

