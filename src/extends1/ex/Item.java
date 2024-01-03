package extends1.ex;

public class Item {

    String name;
    int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void print(){
        System.out.println("name : " + name + "price "+ price);
    }
}
