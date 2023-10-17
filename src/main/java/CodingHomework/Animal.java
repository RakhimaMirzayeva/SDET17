package CodingHomework;

public class Animal {

        String type;

        Animal(String type) {
            this.type = type;
        }

        void eat() {
            System.out.println(type + " eats");
        }

        void sleep() {
            System.out.println(type + " sleeps a lot");
        }
    }

    class Cat extends Animal {
        Cat(String type) {
            super(type);
        }

        @Override
        void sleep() {
            System.out.println(type + " sleeps a lot");
        }
    }

    class Kitten extends Cat {
        Kitten(String type) {
            super(type);
        }

        @Override
        void eat() {
            System.out.println(type + " eats");
        }



        public static void main(String[] args) {
            Animal cat = new Cat("Cat");
            Animal kitten1 = new Kitten("Kitten1");
            Animal kitten2 = new Kitten("Kitten2");
            Animal kitten3 = new Kitten("Kitten3");

            Animal[] animals = {cat, kitten1, kitten2, kitten3};

            for (Animal animal : animals) {
                animal.eat();
                animal.sleep();
            }
        }
    }

