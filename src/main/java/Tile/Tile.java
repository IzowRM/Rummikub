package Tile;

public class Tile {

    private Integer value;
 private Colors color;

    public Tile(Integer value, Colors color) {
        this.value = value;
        this.color = color;
    }

    public Tile(Colors color) {
        this.color = color;
    }
    public Tile() {

    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "value=" + value +
                ", color='" + color + '\'' +
                '}';
    }
}
