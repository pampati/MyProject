package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SuqreOfListUsingConsumerComcept {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10,25,12,41,62,10,7,1);

        Consumer<Integer> c= i->{
          System.out.println("The Square of "+ i+ " is :"+i*i);
        };
        l.stream().forEach(c);
    }
}
