package Project2;


    public interface Shape {
        double calculateArea();

        double calculatePerimeter();

    }
    class Circle implements Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            double area = 3.14 * radius * radius;
            return area;
        }

        @Override
        public double calculatePerimeter() {
            double perimeter = 2 * 3.14 * radius;
            return perimeter;
        }

    }
    class Square implements Shape {
        double side;

        public Square(double side) {
            this.side = side;
        }
        @Override
        public double calculateArea(){
            double area=side*side;
            return area;
        }
        @Override
        public double calculatePerimeter(){
            double perimeter=4*side;
            return perimeter;

        }
        public static void main(String[] args) {


     /*
    Create an Interface 'Shape' with undefined methods as calculateArea
and calculate Perimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
     */
            Circle c=new Circle(6.0);
            System.out.println(c.calculateArea());
            System.out.println(c.calculatePerimeter());
            Square s=new Square(8.0);
            System.out.println(s.calculateArea());
            System.out.println(s.calculatePerimeter());


        }
    }



