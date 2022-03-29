package consumer;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Consumer<String> consumer = (a) -> System.out.println("hello ");

        consumer.accept("Tom");
    }
}
