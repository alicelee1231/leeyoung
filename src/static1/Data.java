package static1;

public class Data {
    public String name;
    public int count;

    public Data(String name){
        this.name = name;
        count++;
    }

    public int getDate(){
        return count++;
    }
}
