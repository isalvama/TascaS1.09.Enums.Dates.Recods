package third_level;

import java.util.Arrays;

public record Person (String nameSurname, int age, AgeLabel ageLabel){
    public Person(String nameSurname, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("The age number cannot be negative");
        }
        if (age > 140) {
            throw new IllegalArgumentException("The age number cannot be greater than 140");
        }
        this(nameSurname, age, determineAgeLabel(age));

    }
    public String getSurname(){
        return Arrays.stream(this.nameSurname().split(" ")).toList().getLast();
    }

    private static AgeLabel determineAgeLabel(int age){
        for (AgeLabel al : AgeLabel.values()) {
            if (al.getAgeLabel(age)) return al;
        }
        return AgeLabel.OTHER;
    }

    public double getFinalPrice(double price){
        return price - (this.ageLabel().discount /100 * price);
    }

}
