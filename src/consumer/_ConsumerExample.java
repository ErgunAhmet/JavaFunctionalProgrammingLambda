package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _ConsumerExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, 3, "John"),
                new Student(2, 4, "Jane"),
                new Student(3, 3,"Jack"));

        Consumer<Student> raiser = e -> e.setGpa(e.getGpa() * 1.1);

        raiseStudents(students, (a) -> System.out.println(a));
        raiseStudents(students, raiser.andThen((a) -> System.out.println(a)));
    }

    private static void raiseStudents(List<Student> employees, Consumer<Student> consumer) {
        for (Student e : employees) {
            consumer.accept(e);
        }
    }

}

class Student {
    private int id;
    private double gpa;
    private String name;

    Student(int id, long g, String name) {
        this.id = id;
        this.gpa = g;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name + " = " + gpa;
    }
}
