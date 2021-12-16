package Java8Concepts;

import java.util.Arrays;
import java.util.List;

public class MinMAxUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,52,14,25,63,85,965,48,21,01,20,30,2,54,45);

        //Find Min value of the list

        int minValue = list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println(minValue);

        int maxValue = list.stream().max((a,b)->a.compareTo(b)).get();
        System.out.println(maxValue);
    }
}
