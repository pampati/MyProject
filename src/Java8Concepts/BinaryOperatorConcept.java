package Java8Concepts;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorConcept {
    public static void main(String[] args) {


        BinaryOperator<Integer> func = Integer::sum;
        Integer result = func.apply(30,40);
        System.out.println(result);

        BiFunction<Integer,Integer,Integer> func1 = Integer::sum;
        Integer r = func1.apply(30,50);
        System.out.println(r);
    }
}
