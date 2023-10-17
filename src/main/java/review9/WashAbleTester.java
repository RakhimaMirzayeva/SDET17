package review9;

public interface WashAbleTester {
    public static void main(String[] args) {
        WashAble [] arr={new Car(),new Horse()};
        for(WashAble w:arr){
            w.wash();
        }
    }
}
