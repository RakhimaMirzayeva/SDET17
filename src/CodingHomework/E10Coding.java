package CodingHomework;

public class E10Coding {
    public static void main(String[] args) {
       String[] country={"Turkey","Russia","Turkey","USA","China","Italy"};
        for (int i = 0; i <country.length ; i++) {
            for (int j =i+1; j <country.length ; j++) {
                if(country[i]==country[j]){
                    System.out.println("The duplicate country of this array is "+country[i]);
                    break;
                }
            }
        }

    }
}
