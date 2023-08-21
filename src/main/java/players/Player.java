package players;
import Tile.Tile;
import java.util.ArrayList;

public class Player {
    private String name;
    ArrayList<Tile> main = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addTileMain(Tile t) {
        main.add(t);
    }
    public void getMain() {
        for (Tile tile : main) {
            System.out.println("Value: " + tile.getValue() + ", Color: " + tile.getColor());
        }
    }
    public void removeTile(Tile t) {
        main.remove(t);
    }

    public String getName() {
        return name;
    }
}
