package oop.paint;

public enum Color {
    RED("красный"),
    ORANGE("оранжевый"),
    YELLOW("жёлтый"),
    GREEN("зелёный"),
    BLUE("синий"),
    PURPLE("фиолетовый");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
