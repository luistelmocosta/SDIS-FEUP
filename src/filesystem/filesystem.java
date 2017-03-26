package filesystem;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileSystem {
    private HashMap<String, FileChunk> filesystem;

    public boolean fileExists(String fileID) {
        return filesystem.containsKey(fileID);
    }


}