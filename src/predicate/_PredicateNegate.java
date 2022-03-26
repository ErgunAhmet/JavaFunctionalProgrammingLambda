package predicate;

import java.util.function.Predicate;

public class _PredicateNegate {
    public static Predicate<String> containsA = (t) -> t.contains("a");

    public static void predicate_negate() {
        String word = "reading";
        boolean result = containsA.negate().test(word);
        System.out.println(result);
    }

    public static void main(String[] args) {
        predicate_negate();
    }
}
