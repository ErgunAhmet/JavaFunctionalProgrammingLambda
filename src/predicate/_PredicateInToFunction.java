package predicate;

import java.util.function.Predicate;

public class _PredicateInToFunction {
    static void pred(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("the number is correct: " + number);
        }
    }

    public static void main(String[] args) {
        pred(45, (i) -> i > 25);
    }
}
