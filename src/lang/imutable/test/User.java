package lang.imutable.test;

public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public User withName(String name) {
        return new User(name);
    }
}
