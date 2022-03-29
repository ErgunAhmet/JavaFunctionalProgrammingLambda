package biFunction;

import java.util.HashMap;
import java.util.function.BiFunction;

public class _BiFunctionExample {
    public static void main(String args[])
    {
        //Let’s create an example to use BiFunction in HashMap. Consider a HashMap that stores student roll
        // numbers and their scores. We need to add 5 to the score of every student, except roll number 101.
        HashMap<Integer, Double> scoreMap = new HashMap<>();
        scoreMap.put(101, 95.2);
        scoreMap.put(102, 86.0);
        scoreMap.put(103, 91.9);
        scoreMap.put(104, 72.8);
        scoreMap.put(105, 89.5);

        System.out.println("Intial HashMap: " + scoreMap);

        // BiFunction with arguments of type Integer and Double
        // and return type of Double
        BiFunction<Integer, Double, Double> biFunction = (key, value) -> {
            if(key == 101)
                return value;
            else
                return value + 5;
        };
        scoreMap.replaceAll(biFunction);
        System.out.print("HashMap After The Update: " + scoreMap);
    }
}
