package Class23;

public class FileTester {
    public static void main(String[] args) {


        File[] arr = {new JavaFile("JavaFile.java", 5000), new WordFile("Word.doc", 500), new PdfFile("New.pdf", 1000)};

        for(int i=0; i < arr.length; i++){
            File f = arr[i];
            System.out.println("**");
            // all methods
            f.open();
            f.edit();
            f.close();
        }
        }
    }
