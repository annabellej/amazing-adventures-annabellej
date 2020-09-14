package student.adventure;

import java.util.*;

/**
 * Represents a room in the game map.
 * A room can either be a normal room or the end room of the game.
 *
 * @author  Annabelle Ju
 * @version 9/13/2020
 */
public class Room
{
    private String roomName;
    private String roomDescription;
    private int roomNumber;
    private boolean endRoom;
    private List<String> itemsVisible;
    private List<Direction> possibleDirections;
    private List<Integer> possibleRooms;

    /**
     * Default constructor for objects of class Room.
     * Initiates Room attributes to default values.
     */
    public Room() {
        roomName = "";
        roomDescription = "";
        roomNumber = 0;
        endRoom = false;
        itemsVisible = new ArrayList<>();
        possibleDirections = new ArrayList<>();
        possibleRooms = new ArrayList<>();
    }

    //Getters:
    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription () {
        return roomDescription;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isEndRoom() {
        return endRoom;
    }

    public List<String> getItemsVisible() {
        return itemsVisible;
    }

    public List<Direction> getPossibleDirections() {
        return possibleDirections;
    }

    public List<Integer> getPossibleRooms() {
        return possibleRooms;
    }

    //Setters:
    public void setRoomName(String roomName)
    {
        this.roomName = roomName;
    }

    public void setRoomDescription(String roomDescription)
    {
        this.roomDescription = roomDescription;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void setEndRoom(boolean endRoom)
    {
        this.endRoom = endRoom;
    }

    public void setItemsVisible(List<String> itemsVisible)
    {
        this.itemsVisible = itemsVisible;
    }

    public void setPossibleDirections(List<Direction> possibleDirections) {
        this.possibleDirections = possibleDirections;
    }

    public void setPossibleRooms(List<Integer> possibleRooms)
    {
        this.possibleRooms = possibleRooms;
    }

    /**
     * Determines if this room has valid properties:
     * Room name and description should not be empty, room number should be positive,
     * this room should have at least one possible direction/room to move to.
     *
     * @return true  if this room has valid properties, else
     *         false if this room has at least one invalid property.
     */
    public boolean isValidRoom() {
        if (roomName.equals("") || roomDescription.equals("")) {
            return false;
        }
        else if (roomNumber <= 0) {
            return false;
        }
        else if (possibleDirections.size() < 1 || possibleRooms.size() < 1) {
            return false;
        }

        return true;
    }
}
