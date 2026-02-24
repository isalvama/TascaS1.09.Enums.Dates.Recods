package first_level;
/*
Exercicis:
Crea un enum Level amb valors LOW, MEDIUM i HIGH. Crea una classe Task amb una propietat Level i mostra com canvia el comportament en funció del nivell.
Afegeix mètodes dins l’enum i comprova que poden tenir lògica (ex: getColor() per cada nivell de Level).
Converteix un String a enum (amb valueOf) i gestiona errors si el valor no és vàlid.
 */
public enum Day {
    MONDAY (true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWorkingDay;

    Day(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    public String getIsWorkingDay () {
        if (isWorkingDay) return this.name() + " is a working day";
        else return this.name() + " is weekend!";

    }
}


