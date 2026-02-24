package first_level;

/*
TODO: Afegeix mètodes dins l’enum i comprova que poden tenir lògica (ex: getColor() per cada nivell de Level).
TODO: Converteix un String a enum (amb valueOf) i gestiona errors si el valor no és vàlid.
 */
public enum Level {
    LOW("green"),
    MEDIUM("yellow"),
    HIGH("red");

    private final String color;

     Level( String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
