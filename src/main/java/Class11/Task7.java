package Class11;

public class Task7 {
    public static void main(String[] args) {
//2 Ways of printing
        String[][] cars={
                {"Ford","Tesla","Dodge","GMC"},
                {"Mercedes Benz","BMW","Porsche","Audi"},
                {"Toyota","Mazda","Nissan","Honda"}
        };

        for(String[] row:cars){//you can put r:  //Enhanced for loop
            for(String col:row){//can put c:
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("=========================");//Index for loop
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
    }
}
