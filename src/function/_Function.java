package function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) -> x * x;
        System.out.println(function.apply(5));
    }
}
