package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<Integer> consumer= i-> System.out.print(" "+i);
        Consumer<Integer> consumerWithAndThen = consumer.andThen( i-> System.out.print(" (number "+i+" is printed)"));

        List<Integer> list = Arrays.asList(1,2,3);

        for (Integer i: list) {
            consumerWithAndThen.accept(i);
        }
    }
}
