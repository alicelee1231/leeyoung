package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter(); //값 0으로 초기화 -> counter인스턴스 공유해서 호출할 때마다 값이 1씩 증가되는거임
        Data2 data1 = new Data2("A",counter);
        System.out.println("A count=" + counter.count);

        Counter counter1 = new Counter(); //값 0으로 초기화

        Data2 data2 = new Data2("B",counter1);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C",counter);
        System.out.println("C count=" + counter.count);

    }
}
