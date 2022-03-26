package anonymousClasses;

public class PersonGreeter {
    private String name;

    public PersonGreeter(String name) {
        this.name = name;
    }

    public String greet() {
        Greeter greet = new Greeter() {
            @Override
            public String sayHello(String name) {
                return "Hello " + name;
            }
        };
        return greet.sayHello(this.name);
    }
}
