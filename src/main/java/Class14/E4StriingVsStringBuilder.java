package Class14;

public class E4StriingVsStringBuilder {
    public static void main(String[] args) {

        String name1,name2,name3,name4;
        name1="USA";
        name2="USA";
        name3="USA";
        name4="USA";
        StringBuilder sbd=new StringBuilder("Rakhima");
        StringBuffer sbf=new StringBuffer("Mirzayeva");
        sbd.reverse();
        sbf.reverse();
        System.out.println(sbf);
        System.out.println(sbd);
    }
}
