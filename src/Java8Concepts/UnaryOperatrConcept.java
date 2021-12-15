package Java8Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatrConcept {
    public static void main(String[] args) {

        UnaryOperator<Integer> func = x-> x * 10;
        System.out.println(func.apply(10));

        List<String> listOfLang  = new ArrayList<>();
        listOfLang.add("Javba");
        listOfLang.add("Tjfgjiog");
        listOfLang.add("fjjs");
        System.out.println(listOfLang);
        listOfLang.replaceAll(ele->ele + "Mahjesh");
        System.out.println(listOfLang);
    }
}
