package biConsumer;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age)->System.out.println(name+" "+age);
        biConsumer.accept("Peter", 28);
    }
}
