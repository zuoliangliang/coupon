package enumtest;

public enum SeasonVal {
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬");

    private String text;

    SeasonVal(String text) {
        this.text = text;
    }
}
