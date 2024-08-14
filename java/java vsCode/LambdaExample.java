
import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");

        // Using a lambda expression with zero parameters in orElse
        String result = stream
                .filter(fruit -> fruit.equals("apple"))
                .findFirst()
                .orElseGet(() -> "No fruit found");

        System.out.println(result); // Output: No fruit found
    }
}
