package student.adventure;

import java.util.*;

/**
 * Represents a room in the game map.
 * A room can either be a normal room or the end room of the game.
 *
 * @author  Annabelle Ju
 * @version 9/14/2020
 */
public class Room {
    private String roomName;
    private String roomDescription;
    private int roomNumber;
    private boolean endRoom;
    private List<String> itemsVisible;
    private List<Direction> possibleDirections; //correspond to room w/ same index in possibleRooms
    private List<Integer> possibleRooms;        //correspond to direction w/ same index

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
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setEndRoom(boolean endRoom) {
        this.endRoom = endRoom;
    }

    public void setItemsVisible(List<String> itemsVisible) {
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
     * Adds an item to the visible items in this room.
     *
     * @param itemName name of the item to add to this room.
     */
    public void addItemToRoom(String itemName) {
        itemsVisible.add(itemName);
    }

    /**
     * Removes an item from this room.
     *
     * @param itemName the name of the item to remove.
     */
    public void removeItemFromRoom(String itemName) {
        itemsVisible.remove(itemName);
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

    @Override
    public String toString() {
        String roomDetails = "You are currently in: " + roomName + "\n" + roomDescription + "\n" +
                "From here, you can go: ";

        for (int index = 0; index < possibleDirections.size(); index++) {
            String currentDirection = possibleDirections.get(index).name();

            if (index == possibleDirections.size() - 1) {
                roomDetails += "or " + currentDirection + "\n";
            }
            else {
                roomDetails += currentDirection + ", ";
            }
        }

        roomDetails += "Items visible: ";

        for (int index = 0; index < itemsVisible.size(); index++) {
            roomDetails += itemsVisible.get(index);

            if (index < itemsVisible.size() - 1) {
                roomDetails += ", ";
            }
            else {
                roomDetails += "\n";
            }
        }

        return roomDetails;
    }
}
