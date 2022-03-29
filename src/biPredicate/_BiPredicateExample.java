package biPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class _BiPredicateExample {
    public static void main(String[] args) {

        List<Domain> domains = Arrays.asList(
                new Domain("google.com", 1),
                new Domain("facebook.com", 10),
                new Domain("youtube.com", 8),
                new Domain("instagram.com", 7),
                new Domain("microsoft.com", 2));

        BiPredicate<String, Integer> bi = (domain, score) -> (domain.equalsIgnoreCase("google.com") || score == 0);

        // if google or score == 0
        List<Domain> result = filterBadDomain(domains, bi);
        System.out.println(result);

        //  if score == 0
        List<Domain> result2 = filterBadDomain(domains, (domain, score) -> score == 0);
        System.out.println(result2);

        // if start with i or score > 5
        List<Domain> result3 = filterBadDomain(domains, (domain, score) -> domain.startsWith("i") && score > 5);
        System.out.println(result3);

        // chaining with or
        List<Domain> result4 = filterBadDomain(domains, bi.or(
                (domain, x) -> domain.equalsIgnoreCase("microsoft.com"))
        );
        System.out.println(result4);


    }

    public static List<Domain> filterBadDomain(List<Domain> list, BiPredicate<String, Integer> biPredicate) {

        ArrayList<Domain> domains = new ArrayList<>();
        for (Domain domain: list) {
            if (biPredicate.test(domain.getName(), domain.getScore())) {
                domains.add(domain);
            }
        }
        return domains;

    }
}

class Domain {
    String name;

    Integer score;
    public Domain(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
