package predicate;

import java.util.function.Predicate;

public class _PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> largerThanThen = (i) -> i > 50;

        Predicate<Integer> smallerThan = (i) -> i < 100;

        boolean result = largerThanThen.and(smallerThan).test(75);
        System.out.println(result);

        boolean result2 = largerThanThen.and(smallerThan).test(25);
        System.out.println(result2);
    }


}
