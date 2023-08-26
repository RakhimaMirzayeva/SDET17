package JAVAHomework;


     class Main{
         String breed, name, color;

         public static void main(String[] args) {

             Main b = new Main();
             b.breed = "Bulldog";

           Main l = new Main();
             l.breed = "Labrador";

             Main h = new Main();
             h.breed = "Husky";

             h.bark();
             h.run();
             h.play();
             b.bark();
             b.run();
             b.play();
             l.bark();
             l.run();
             l.play();
         }

         void bark() {
             System.out.println(breed + " can bark");
         }

         void run() {
             System.out.println(breed + " can run");
         }

         void play() {
             System.out.println(breed + " can play");
         }
     }

