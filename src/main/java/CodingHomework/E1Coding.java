package CodingHomework;

public class E1Coding {
    public static void main(String[] args) {

        double[] temperatures={83.0,82.2,80.3,78.9,85.0,75.0,};

        double highestTemperature=temperatures[0];
        double lowestTemperature=temperatures[0];

        for(double temperature:temperatures){
            if(temperature>highestTemperature){
                highestTemperature=temperature;

            }
            if( temperature < lowestTemperature){
                lowestTemperature=temperature;
            }
        }
        System.out.println("The highest temperature for this week is "+highestTemperature);
        System.out.println("The lowest temperature for this week is "+lowestTemperature);
    }
}
