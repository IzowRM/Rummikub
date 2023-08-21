package org.example;

import Tile.Board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.piocheMaker();
        board.getPioche();
        board.setUpGame();
        board.getPlayer(1).getMain();
    }


}

