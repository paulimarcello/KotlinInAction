// Java ValueObject
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

// Kotlin ValueObject
// public is default
class Person(val name: String)