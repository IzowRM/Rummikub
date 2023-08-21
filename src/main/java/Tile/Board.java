package Tile;

import players.Player;

import java.util.*;

public class Board extends Tile {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Tile> pioche = new ArrayList<>();
    ArrayList<Colors> colors = new ArrayList<>(Arrays.asList(Colors.RED, Colors.YELLOW, Colors.BLUE, Colors.BLACK));

    public Board() {
        super();

    }

    public void piocheMaker() {
        for (int i = 0; i < 3; i++) {
            Colors colorX = colors.get(i);
            for (int j = 13; j > 0; j--) {
                Tile tile = new Tile(j, colorX);
                pioche.add(tile);
            }
        }
        Tile tileJoker = new Tile(Colors.JOKER);
        pioche.add(tileJoker);
        pioche.add(tileJoker);
        Collections.shuffle(pioche);
    }

    public Tile getTile() {
        Tile tile = new Tile();
        if (!pioche.isEmpty()) {
            tile = pioche.get(0);
            pioche.remove(0);
        }
        return tile;

    }

    public Integer playersNumber() {
        System.out.println("Entry number of players: ");
        Scanner scanner = new Scanner(System.in);
        Integer playerNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Name players is : " + playerNumber);
        return playerNumber;

    }

    public String playerName() {
        System.out.println("Entry name player: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        return playerName;
    }

    public void playersMaker() {

        int n = playersNumber();

        for (int i = n; i >= 1; i--) {
            String playerName = playerName();
            Player player = new Player(playerName);
            players.add(player);
        }

    }

    public void makeMainPlayer() {
        for (int i = 14; i > 0; i--) {
            Tile tile = getTile();
            players.forEach(entry -> entry.addTileMain(tile));
        }
    }
    public void setUpGame() {
        playersMaker();
        piocheMaker();
        makeMainPlayer();
    }

    public Player getPlayer(int n ){
        return players.get(n);
    }
    public void getPioche() {
        for (Tile tile : pioche) {
            System.out.println("Value: " + tile.getValue() + ", Color: " + tile.getColor());
        }
    }



}
