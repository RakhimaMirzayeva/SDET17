package Class22;

import java.io.FileWriter;
import java.io.IOException;

public class E7CreatingFiles {
    public static void main(String[] args) throws IOException {


        FileWriter f = new FileWriter("Test.text");
        f.write("Hey Guys its tea time");
        f.close();//it will create a file on the left side with red text
        for (int i = 0; i <10 ; i++) {
            f.write("Batch 17 is Great!\n");
        }

        f.close();

    }
}