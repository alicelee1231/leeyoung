package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);

        counter.increment(1);
        counter.increment(1);
        counter.increment(1);
        counter.increment(1);

//        System.out.println(counter.increment());
//        System.out.println(counter.increment());
//        System.out.println(counter.increment());
        int count = counter.getCount();
        System.out.println(count);

    }
}
