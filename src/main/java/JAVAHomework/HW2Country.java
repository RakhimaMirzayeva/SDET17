package JAVAHomework;

public class HW2Country {
    public static void main(String[] args) {
        String[][] country={{"Australia","Azerbaijan","Armenia","Albania"},
                {"Bahamas","Barbados","Belarus","Belize"},
                {"Cambodia","Costa Rica","Cuba","Colombia"},
                {"Finland","France","Italy","Japan"},
                {"Turkey","USA","Brazil","Russia"}};
        int total=0;
        for (int row = 0; row < country.length; row++) {
            for (int col = 0; col <country[row].length ; col++) {
                System.out.print(country[row][col]+" ");
            }
            total=total+country[row].length;
            System.out.println();
        }
        System.out.println("All counties are  "+total);
        System.out.println("======================");
        for(String[]names:country){
            for(String all:names){
                System.out.print(all+" ");
            }
            System.out.println();
        }
    }
}
