package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //new Thread(new CodeToRun()).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable 2");
//            }
//        }).start();
        new Thread(() -> System.out.println("Printing from the Runnable 3")).start();
        new Thread(() -> {
            System.out.println("Printing from the Runnable 4");
            System.out.println("This is a multi line lambda expression");
        }).start();

        Person tom = new Person("Tom", 25);
        Person john = new Person("John", 21);
        Person simon = new Person("Simon", 41);
        Person kim = new Person("Kim", 36);

        List<Person> personList = new ArrayList<>();
        personList.add(tom);
        personList.add(john);
        personList.add(simon);
        personList.add(kim);

        System.out.println("List of names: ");
        for (Person person: personList) {
            System.out.println(person.getName());
        }
        // with anonymous class
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person person1, Person person2) {
//                return person1.getName().compareTo(person2.getName());
//            }
//        });

//        Collections.sort(personList, (Person person1, Person person2) ->
//                person1.getName().compareTo(person2.getName()));

        Collections.sort(personList, (person1, person2) ->
                person1.getName().compareTo(person2.getName()));

//        for (Person person: personList) {
//            System.out.println(person.getName());
//        }

        System.out.println("Sorted list of names: ");
        personList.forEach((n) -> System.out.println(n.getName()));
    }
}

//class CodeToRun implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Printing from the Runnable");
//    }
//}
