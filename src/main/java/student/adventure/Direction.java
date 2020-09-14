package student.adventure;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents one of the four cardinal directions the player can move in:
 * North, South, East, or West.
 *
 * @author  Annabelle Ju
 * @version 9/13/2020
 */
public enum Direction
{
    @JsonProperty("North")
    North,
    @JsonProperty("South")
    South,
    @JsonProperty("East")
    East,
    @JsonProperty("West")
    West
}
