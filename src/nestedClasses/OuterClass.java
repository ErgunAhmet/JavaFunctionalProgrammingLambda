package nestedClasses;

public class OuterClass {

    private String name;


    public OuterClass(String name) {
        this.name = name;
    }


    PrivateNestedClass privateNestedClass = new PrivateNestedClass(21);

    public void callMyAge() {
        privateNestedClass.myAge();
    }

    class NestedClass {
        private String surname;

        public NestedClass(String surname) {
            this.surname = surname;
        }

        public void greet() {
            System.out.println("Hello " + name + " " + this.surname + " from nested class");
        }
    }

    private class PrivateNestedClass {
        private int age;

        public PrivateNestedClass(int age) {
            this.age = age;
        }

        public void myAge() {
            System.out.println("My age is: " + this.age + " from private nested class");
        }
    }

    static class StaticNestedClass {

        public void greet() {
            System.out.println("hello world from static nested class");
        }
    }
}
