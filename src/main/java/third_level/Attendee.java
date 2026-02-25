package third_level;

public class Attendee {
    private String name;
    private int age;

    public Attendee (String name, int age){
        this.name = name;
        this.age = validateAge(age);
    }

    private int validateAge (int age){
        if (age < 0) {
            throw new IllegalArgumentException("Age can not be negative");
        }
        if (age > 140) {
            throw new IllegalArgumentException("Age can not be greater than 140");
        }
        return age;
    }
}
