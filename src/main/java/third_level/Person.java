package third_level;

import java.util.Arrays;

// TODO Afegeix mètodes personalitzats dins d’un record.
/*
TODO Compara un record amb una classe tradicional i comenta les diferències en llegibilitat i utilitat.
 */
public record Person (String nameSurname, int age) {
    public Person{
        if (age < 0) {
            throw new IllegalArgumentException("The age cannot be negative");
        }
        if (age > 140) {
            throw new IllegalArgumentException("The age cannot be greater than 140");
        }
    }
    public String getSurname (){
        return Arrays.stream(this.nameSurname().split(" ")).toList().getLast();
    }
}
