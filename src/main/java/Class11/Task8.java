package Class11;

public class Task8 {
    public static void main(String[] args) {
        String[][] groceries = {{"Apple", "Banana", "Lemon", "Strawberry"},
                {"Potato", "Onion", "Carrot", "Beans"},
                {"Milk", "Cheese", "Yogurt", "Heavy Cream"},
                {"Candy", "Cake", "LolyPop", "Chocolate"}};
        for (String[] row : groceries) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");//Index for loop
        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j] + " ");
            }
            System.out.println();
        }
    }
}
