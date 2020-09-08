
public class MainProgram {

    public static void main(String[] args) {
        Counter count = new Counter();
        
        count.decrease();
        count.increase();
        count.decrease(10);
        count.increase(89);
        
        System.out.println(count.value());
    }
}
