package predicate;

import java.util.function.Predicate;

public class _PredicateIsEqual {
    public static Predicate<String> pred = Predicate.isEqual("tree");

    public static void main(String[] args) {
        System.out.println(pred.test("tree"));
    }
}
