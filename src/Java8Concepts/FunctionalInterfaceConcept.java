package Java8Concepts;

import java.util.function.Function;
// Ab example of functional Interface , Functional interface is nothing nut an interface with only single abstarct method
public class FunctionalInterfaceConcept {
    public static void main(String[] args) {
//An example of labda function with Functional Interface
        Function<String,Integer> func = String::length;
        Integer legnthOfString = func.apply("Hello this is Mahesh");
        System.out.println(legnthOfString);

       // Method chaining
        Function<Integer,Integer> func1 = x->x *2;
        Integer result = func.andThen(func1).apply("Hello super star");
        System.out.println(result);

    }
}
