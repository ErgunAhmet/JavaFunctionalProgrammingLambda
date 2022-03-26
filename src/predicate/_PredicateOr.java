package predicate;

import java.util.function.Predicate;

public class _PredicateOr {
    public static Predicate<String> hasLengthOf5 = s -> s.length() > 5;

    public static void predicate_or() {
        Predicate<String> containsLetterB = (w) -> w.contains("B");
        String word = "Blue";
        boolean result = hasLengthOf5.or(containsLetterB).test(word);
        System.out.println(result);
    }

    public static void main(String[] args) {
        predicate_or();
    }
}
