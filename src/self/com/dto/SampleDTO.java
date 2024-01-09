package self.com.dto;

public class SampleDTO {

    private String id;
    private String name;
    private int price;

    public SampleDTO(String id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public SampleDTO(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}