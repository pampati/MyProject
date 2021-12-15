package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExprAndMethodReference {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Mahesh","Ravi","Ramu","Rahim");
//1. Ananymous class
        namesList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //2 : Lambda expression

        namesList.forEach(x->System.out.println(x));

        //3 method references

        namesList.forEach(System.out::println);
    }
}
