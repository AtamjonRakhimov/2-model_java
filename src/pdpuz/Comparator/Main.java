package pdpuz.Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person(1, "Tarra Prohaska", "MALE", 16),
                new Person(2, "Allen Dicki", "FEMALE", 29),
                new Person(3, "Jack Davis DVM", "MALE", 17)
        );

        List<Person> sorted = new ArrayList<>(people);
        sorted.sort(new AgeComparator());

        HtmlGenerator.generate(sorted);
    }
}