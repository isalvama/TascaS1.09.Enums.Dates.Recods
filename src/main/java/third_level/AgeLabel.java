package third_level;

enum AgeLabel {
    YOUNG(14, 30, 30),
    ADULT(31, 50, 0),
    SENIOR(51, 90, 10),
    OTHER(0, 0, 0);

    final int minAge;
    final int maxAge;
    final double discount;

    AgeLabel(int minAge, int maxAge, double discount) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.discount = discount;
    }

    public boolean getAgeLabel (int age){
        return age <= this.maxAge && age >= this.minAge;

    }
}
