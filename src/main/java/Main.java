import student.adventure.GameEngine;
import student.adventure.MapDataReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GameEngine newGame = new GameEngine("src/test/resources/fullValidGame.json");
        newGame.runGame();
    }
}