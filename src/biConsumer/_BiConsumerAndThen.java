package biConsumer;

import java.util.function.BiConsumer;

public class _BiConsumerAndThen {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (a, b) ->
                System.out.println("His name is " + a + " and he is " + b + " old");
        biConsumer.andThen((a, b) -> System.out.println(a + b.toString())).accept("Tom", 21);

    }
}
