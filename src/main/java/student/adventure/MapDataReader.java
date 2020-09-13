package student.adventure;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

/**
 * Object handling reading in data from any JSON file to a game map.
 *
 * @author  Annabelle Ju
 * @version 9/13/2020
 */
public class MapDataReader
{
    private String fileName;

    public MapDataReader() {
        fileName = null;
    }

    /**
     * Constructor for objects of class JSONDataReader.
     * Given the Object for which to deserialize, initiates this data reader accordingly.
     *
     * @param fileName the Object for which to deserialize a JSON file.
     */
    public MapDataReader(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Given the name of a JSON file, deserializes the file if it's valid.
     *
     * @return the Object containing the deserialized data.
     */
    public GameMap deserializeFile() throws IOException {
        if (fileName == null || fileName.length() == 0) {
            throw new IllegalArgumentException("Invalid file name.");
        }

        BufferedReader dataFile = new BufferedReader(new FileReader(fileName));

        GameMap deserializedMap = new ObjectMapper().readValue(dataFile, GameMap.class);

        //IMPLEMENT ERROR CHECKS

        return deserializedMap;
    }
}
