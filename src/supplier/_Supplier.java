package supplier;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        String product = "Android";

        Supplier<Boolean> boolSupplier = () -> product.length() == 10;
        Supplier<String> supplier = () -> product.toUpperCase();


        System.out.println(boolSupplier.get());//false
        System.out.println(supplier.get());//ANDROID

    }
}
