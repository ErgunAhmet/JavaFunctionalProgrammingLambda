package nestedClasses;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Ahmet");
        OuterClass.NestedClass nestedClass = outerClass.new NestedClass("Ergun");

        nestedClass.greet();

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.greet();

        outerClass.callMyAge();
    }
}
