package Class21;


public class Degree {

        public void getPrerequisite() {
            System.out.println("To get a degree you need high school diploma :");
        }
    }

    class Bachelors extends Degree {
    }





    class Masters extends Degree {
        @Override//java makes extra checks if i am not making any mistakes
        public void getPrerequisite() {

            System.out.println("You will get master if you have bachelor degree");
        }

    }




