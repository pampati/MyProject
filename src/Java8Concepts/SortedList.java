package Java8Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(10,54,12,85,12,65,85,96,54,25,74);

        //Count based on some condition and then sort

        long noOfFailedmarks =  marks.stream().filter(m->m<35).count();
        System.out.println(noOfFailedmarks);
        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        //Sort in natural sorting order
        System.out.println(sortedMarks);
        //sort in reverese sorting order
        List<Integer> reverseSortedlist = marks.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(reverseSortedlist);

        //String sorting

        List<String> names = Arrays.asList("Mahesh","Naresh","Suman Sheety","Chiranjeevi","Abhi");
        List<String> sortednames = names.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(sortednames);

        //Sort according to length of charecters

        Comparator<String> c = (a,b)->{
            int l1=a.length();
            int l2=b.length();
            if(l1>l2) return  1;
            else if(l2>l1) return -1;
            else return a.compareTo(b);
        };

        // sort by length of charcets
        List<String> sortNamesByLentgyh = names.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sortNamesByLentgyh);

    }
}
