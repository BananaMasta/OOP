package OOP.model;

public class Person {
    private String FirstName;
    private String SecondName;
    private static final Person UNKNOWN_PERSON = new Person(" ", " ");

    public Person(String s, String s1) {
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }
}
