package Class11;

public class E32DArrays {
    public static void main(String[] args) {
        //names is the 2D: row is 1 D array
        String[][] names=
                {{"Rakhima","Hind","Mikhail","Ahmed",},
                        {"Lucky","Hind","Mikhail","Ahmed",},
                        {"Tahmin","Giulia","Aysha","Clare",},
                        {"Deepali","Sajana","Laura","Smile",},};
        String[] row=names[2];
        //System.out.println(row[3]);  //Two ways of writing
        //System.out.println(Arrays.toString(row));
        for(String name:row){
            System.out.println(name);
        }
    }
}
