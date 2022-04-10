package binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class _BinaryoperatorMinBy {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = BinaryOperator.minBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.minBy((a, b) -> a.compareTo(b));
        BinaryOperator<Integer> binaryOperator3 = BinaryOperator.minBy(Comparator.naturalOrder());
        System.out.println(binaryOperator.apply(98, 11));
        System.out.println(binaryOperator2.apply(98, 11));
        System.out.println(binaryOperator3.apply(98, 11));
    }
}
