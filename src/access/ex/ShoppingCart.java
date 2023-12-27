package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private  int itemCount;

    public void addItem(Item item){

        if(itemCount >= items.length){
            System.out.println("cart is already full");
            return;
        }
        items[itemCount] = item;
        itemCount ++;
    }


    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("product's name " + item.getName() + "total" + item.getTotalPrice());
        }
        System.out.println(calculateTotalPrice());
    }

    private  int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i <itemCount; i++ ){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
