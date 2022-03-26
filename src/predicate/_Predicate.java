package predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = a -> (a > 18);
        if (predicate.test(10)) {
            System.out.println("This person is an adult");
        } else {
            System.out.println("This person is a minor");
        }
        System.out.println(predicate.test(10));
    }
}
