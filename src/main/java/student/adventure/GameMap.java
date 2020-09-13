package student.adventure;

import java.util.*;

/**
 * Represents the map of a game with all of the Rooms.
 *
 * @author  Annabelle Ju
 * @version 9/13/2020
 */
public class GameMap
{
    private List<Room> allRooms;

    /**
     * Default constructor for objects of class GameMap.
     * Initiates a new empty list of all Rooms for the map.
     */
    public GameMap() {
        allRooms = new ArrayList<>();
    }

    /**
     * Constructor for objects of class GameMap.
     * Initiates the list of all rooms with a given list of rooms
     * in this map.
     *
     * @param allRooms the given list of all Rooms to put in this map.
     */
    public GameMap(List<Room> allRooms) {
        this.allRooms = allRooms;
    }

    public List<Room> getGameMap() {
        return allRooms;
    }

    public void setGameMap(List<Room> allRooms) {
        this.allRooms = allRooms;
    }
}
