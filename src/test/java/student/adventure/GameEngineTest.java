package student.adventure;

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

public class GameEngineTest {
    GameEngine testGame;

    @Before
    public void setUp() throws IOException {
        testGame = new GameEngine("src/test/resources/fullValidGame.json");
    }

    //Tests for correct initial game settings
    @Test
    public void testEmptyInitialInventory() {
        assertEquals(0, testGame.getPlayerInventory().size());
    }

    @Test
    public void testGameNotEnded() {
        assertTrue(!testGame.isGameEnded());
    }

    @Test
    public void testInitialRoomNumberIsOne() {
        assertEquals(1, testGame.getCurrentRoom().getRoomNumber());
    }

    //Tests for moving around:

    //Tests for interacting with items:

    //Test examining room:

    //Test quitting game:

    //Test winning game:
}
