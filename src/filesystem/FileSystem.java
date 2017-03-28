package filesystem;
import file.ChunkFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileSystem {
    private HashMap<String, ChunkFile> filesystem;


    /**
     * Returns a boolean wether the file exists or not
     *
     * @param fileID
     * @return
     */
    public boolean fileExists(String fileID) {
        return filesystem.containsKey(fileID);
    }

    /**
     * Adds a new file to the Hash Map given a fileID and
     * the file Chunk
     * @param fileID
     * @param file
     */
    public void addNewFile(String fileID, ChunkFile file) {
        filesystem.put(fileID, file);
    }




}