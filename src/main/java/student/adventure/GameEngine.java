package student.adventure;

import java.io.IOException;
import java.util.*;

/**
 * GameEngine runs the adventure game Kidnapped! by taking in user input
 * and responding with feedback to progress in the game.
 *
 * @author  Annabelle Ju
 * @version 9/13/2020
 */
public class GameEngine
{
    private GameMap gameMap;
    private List<String> playerInventory;

    /**
     * Default constructor for objects of class GameEngine.
     * Initiates this game map from a given file.
     * Player starts with no items.
     */
    public GameEngine(String fileName) throws IOException {
        playerInventory = new ArrayList<>();

        MapDataReader dataReader = new MapDataReader(fileName);
        gameMap = dataReader.deserializeFile();
    }

    /**
     * Begins and runs an adventure game by prompting player for moves,
     * updating game parameters accordingly, and responding to the player's
     * actions through the console.
     *
     * Game ends when the end room has been found by the player or if
     * the player quits the game.
     */
    public void runGame() {
        //IMPLEMENT
    }
}
