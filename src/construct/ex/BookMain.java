package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("hello","bye");
        Book book2 = new Book("first", "park",19);
        Book book3 = new Book();

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();


    }
}
