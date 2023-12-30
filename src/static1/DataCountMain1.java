package static1;

public class DataCountMain1  {
    public static void main(String[] args) {
        Data data = new Data("A");
        System.out.println("A count :" + data.count);

        Data data2 = new Data("B");
        System.out.println("A count :" + data2.count);

        Data data3 = new Data("C");
        System.out.println("C count :" + data3.getDate());


        System.out.println("c count :" + data3.getDate());
        System.out.println("c count :" + data3.getDate());

    }
}
