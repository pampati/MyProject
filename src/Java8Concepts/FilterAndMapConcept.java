package Java8Concepts;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapConcept {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(42,58,41,32,65,24,52,98,63,78,88,74,69);

        //Find passed students and failed Studensts
        List<Integer> FailedMarks  = marks.stream().filter(x->x<35).collect(Collectors.toList());
        System.out.println(FailedMarks);

        List<Integer> AddGraceMarks = FailedMarks.stream().map(x->x+10).collect(Collectors.toList());
        System.out.println(AddGraceMarks);

    }
}
