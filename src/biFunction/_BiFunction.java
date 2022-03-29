package biFunction;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Implement add using apply()
        System.out.println("Sum = " + add.apply(2, 3));
    }
}
