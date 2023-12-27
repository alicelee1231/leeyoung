package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(int max){
        if(count >= max) {
            System.out.println("it is out of range");
            return;
        }
         count++;
        }


    public int getCount(){
        return count;
    }

}
