package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddOrEvenUsingStreams {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,5,8,6,4,8,5,9,74,25,125,63,54,2145,78);

        List<Integer> l1=  l.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(l1);

        List<Integer> l2 =  l.stream().filter(x->x%2==1).collect(Collectors.toList());
        System.out.println(l2);


    }
}
