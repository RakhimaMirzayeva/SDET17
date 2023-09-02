package JAVAHomework;

public class HW1Method {
    String countryLanguages(String Country){
        if(Country.equals("Turkey")){
            return"Merhaba";
        }else if(Country.equals("Russia")){
            return"Privet";
        }else  if(Country.equals("Italy")){
            return"Ciao";
        }else if(Country.equals("Chinese")){
            return"Ni hao";
        }else if(Country.equals("USA")){
            return "Hello";
        }else{
            return"Wrong Input";
        }
    }
}
