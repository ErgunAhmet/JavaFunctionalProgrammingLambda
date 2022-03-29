package biPredicate;

import java.util.function.BiPredicate;

public class _BiPredicateAnd {
    public static void main(String... args) {
        BiPredicate<String, String> startsWith = (word, fistWord) -> word.startsWith(fistWord);
        BiPredicate<String, String> biPredicate = startsWith.and((word, lastWord) -> word.endsWith(lastWord));
        boolean result = biPredicate.test("enough is enough", "enough");
        System.out.println(result);
        boolean result2 = biPredicate.test("she is tall", "tall");
        System.out.println(result2);
    }
}
