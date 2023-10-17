package Class23;
/*
Create a class File that will have the following behaviors: open(), edit(), close()
and fields like name and size. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of
 open behaviour: Example: to open .java file we need notepad++
 or sublime text, to open .doc file we need Microsoft word to be installed etc.Create a tester
 class and call all of the methods from these classes.
 */

public abstract class File {
    private String name;
    private int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing the file "+name);
    }
    public void close(){
        System.out.println("Closing the file "+name);
    }
    }
class JavaFile extends File{

    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Open the Java File");
    }

    @Override
   public void edit() {
        System.out.println("Please edit the Java File");
    }

    @Override
    public void close() {
        System.out.println("Close Java File");
    }
}
class WordFile extends File{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Open WordFile");
    }

    @Override
   public void edit() {
        System.out.println("Edit WordFile");
    }

    @Override
  public  void close() {
        System.out.println("Close WordFile");
    }
}
class PdfFile extends File{

    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Open PDF");
    }

    @Override
   public void edit() {
        System.out.println("Edit PDF");
    }

    @Override
   public  void close() {
        System.out.println("Close PDF");
    }
}