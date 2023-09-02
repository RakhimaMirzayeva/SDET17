package Class11;

import java.util.Arrays;

public class E12DArrays {
    public static void main(String[] args) {
        String[][]names=
        {{"Rakhima","Hind","Mikhail","Ahmed",},
            {"Lucky","Hind","Mikhail","Ahmed",},
            {"Tahmin","Giulia","Aysha","Clare",},
            {"Deepali","Sajana","Laura","Smile",},};
        for(String[] row:names){
            for(String v:row){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(names));//fro printing 2D ARrays


    }



}
