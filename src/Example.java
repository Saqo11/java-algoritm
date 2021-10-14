import java.util.Arrays;
import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args)
    {
        // Creating an integer array
        int[] arr = { 1, 212, 32, 4, 5 };

        // Using Arrays.stream() to convert
        // array into Stream
        IntStream stream = Arrays.stream(arr, 1, 3);

        // Displaying elements in Stream
        stream.forEach(ssd -> System.out.print(ssd + " "));
    }
}

