package first_level;

public enum Level {
    LOW("green", 1),
    MEDIUM("yellow", 2),
    HIGH("red", 4);

    private final String color;
    private final int nOfExpectedDaysToLast;

    Level(String color, int nOfExpectedDaysToLast){
        this.color = color;
        this.nOfExpectedDaysToLast = nOfExpectedDaysToLast;
    }

    public String getColor() {
        return color;
    }

    public int getNOfExpectedDaysToLast() {
        return this.nOfExpectedDaysToLast;
    }

    public static Level getLevelFromString(String levelStr) throws RuntimeException {
        String formattedString = levelStr.toLowerCase();
        if (!formattedString.equals("low") && !formattedString.equals("medium") && !formattedString.equals("high")){
            throw new RuntimeException("Error: Invalid value. The level value must be 'low', 'medium' or 'high'");
        }
        return Level.valueOf(levelStr.toUpperCase());
    }

}
