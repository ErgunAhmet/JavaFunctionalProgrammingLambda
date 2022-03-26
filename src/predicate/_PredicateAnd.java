package predicate;

import java.util.function.Predicate;

public class _PredicateAnd {
    public static Predicate<String> hasLengthOf5 = s -> s.length() > 5;

    public static void predicate_and() {
        Predicate<String> containsLetterB = (w) -> w.contains("B");
        String word = "Blue";
        boolean result = hasLengthOf5.and(containsLetterB).test(word);
        System.out.println(result);
    }

    public static void main(String[] args) {
        predicate_and();
    }
}
