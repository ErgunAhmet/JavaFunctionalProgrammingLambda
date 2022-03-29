package biFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunctionAndThen {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        Function<Integer, String> function = (a) -> "result is " + a;


        String result = biFunction.andThen(function).apply(2, 3);

        System.out.println(result);
    }
}
