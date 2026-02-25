package third_level;

enum AgeLabel {
    YOUNG(30),
    ADULT(0),
    SENIOR(10);

    final double discount;

    AgeLabel(double discount) {
        this.discount = discount;
    }
}
