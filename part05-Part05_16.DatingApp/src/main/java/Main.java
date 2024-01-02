
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate simpleDate = new SimpleDate(29, 12, 2000);
        System.out.println(simpleDate);
        simpleDate.advance();
        System.out.println(simpleDate);
        simpleDate.advance();
        System.out.println(simpleDate);
        simpleDate.advance(10);
        System.out.println(simpleDate);
        simpleDate.advance(60);
        System.out.println(simpleDate);
        simpleDate.advance(367);
        System.out.println(simpleDate);
    }
}
