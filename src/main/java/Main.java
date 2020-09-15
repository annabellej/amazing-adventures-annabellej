import student.adventure.GameEngine;

import java.io.IOException;

public class Main {
    /**
     * Runs the game Kidnapped!
     */
    public static void main(String[] args) throws IOException {
        GameEngine newGame = new GameEngine("src/test/resources/fullValidGame.json");
        newGame.runGame();
    }
}