package JAVAHomework;

public class HW1Fruits {
    public static void main(String[] args) {


        String[][] shopList = {{"Banana", "Strawberry", "Raspberry", "Blueberry"},
                {"Chocolate", "Candy", "CottonCandy", "Cake"},
                {"Milk", "Cheese", "Yougurt", "Butter"}
        };
        for (int i = 0; i <shopList.length ; i++) {
            for (int j = 0; j < shopList[i].length; j++) {
                System.out.print(shopList[i][j]+" ");
            }
            System.out.println();
        }
    }
}

