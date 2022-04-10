package unaryoperator;

import java.util.function.UnaryOperator;

public class _Unaryoperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> operator1 = t -> t + 5;
        UnaryOperator<Integer> operator2 = t -> t * 5;
        // Using andThen() method
        int a = operator1.andThen(operator2).apply(5);
        System.out.println(a);
        // Using compose() method
        int b = operator1.compose(operator2).apply(5);
        System.out.println(b);
    }

}
