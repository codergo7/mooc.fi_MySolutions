
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String neaty = ""; 
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                neaty+= String.valueOf(array[i]) + ", ";
            }
            else{
                neaty+= String.valueOf(array[i]);
            }
        }
        System.out.println(neaty);
    }
}
