package Class22;

public class Student {
    private String name;//Instance Field
    private String id;
    public Student(String name,String id){//this is a Constructor, always use class name
        this.name=name;//this is used to access instant variable
        this.id=id;

    }
    public void printInfo(){//method should always be public
        System.out.println(name+" "+id);
    }
}



