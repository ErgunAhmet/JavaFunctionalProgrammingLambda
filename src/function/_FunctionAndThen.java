package function;

import java.util.function.Function;

public class _FunctionAndThen {

    public static void main(String[] args) {

        Function<Integer, Integer> f1 = i -> i*4;

        Function<Integer, Integer> f2 = i -> i+4;

        System.out.println(f2.andThen(f1).apply(3)); // 28

        //f2.andThen(f1).apply(3) - is equals to below statements
        Integer j1 = f2.apply(3);
        Integer j2 = f1.apply(j1);

        System.out.println(j2); //28

    }
}
