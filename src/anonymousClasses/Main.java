package anonymousClasses;

public class Main {

    public static void main(String[] args) {
        PersonGreeter personGreeter = new PersonGreeter("Tom");
        System.out.println(personGreeter.greet());

        SpecialList specialList = new SpecialList();
        specialList.addNames();
        specialList.printNames();
    }
}
