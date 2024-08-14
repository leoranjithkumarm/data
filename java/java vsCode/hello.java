
import java.util.List;

class Test {
    public static void main(String args[]) {
        List<Integer> arrL = List.of(1, 2, 3, 4, 5);

        // Printing all elements of the ArrayList
        arrL.forEach(n -> System.out.println(n));

        // Checking for even numbers and printing a message
        arrL.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println("Even Number: " + n);
            }
        });
    }
}
