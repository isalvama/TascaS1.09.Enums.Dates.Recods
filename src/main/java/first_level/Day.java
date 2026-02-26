package first_level;


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


