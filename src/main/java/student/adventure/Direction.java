package student.adventure;

/**
 * Represents one of the four cardinal directions the player can move in:
 * North, South, East, or West.
 *
 * @author  Annabelle Ju
 * @version 9/13/2020
 */
public enum Direction
{
    North,
    South,
    East,
    West;

    @Override
    public String toString() {
        return name();
    }
}
