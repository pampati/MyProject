package Java8Concepts;



import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateConcept {
    public static void main(String[] args) {
        Predicate<Integer> func = z -> z>=25;

        List<Integer> listOfnum = Arrays.asList(1,25,1,25,125,64);
        List<Integer> listOfnumAfterFliter =listOfnum.stream().filter(func).collect(Collectors.toList());
        System.out.println(listOfnumAfterFliter);

        List<String> listOfkang =  Arrays.asList("Mjndjk","hkjasfh","dkalj","dlksaj");
        Predicate<String> func1 =  x -> x.startsWith("d");
        List<String> listOfkan =  listOfkang.stream().filter(func1.negate()).collect(Collectors.toList());
        System.out.println(listOfkan);
    }
}
