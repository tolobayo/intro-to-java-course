package com.cbfacademy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    boolean check(String filename) throws FilenameException{
        if (filename == null || filename == "") throw new FilenameException("Filename does not exist.");

        return filename.endsWith(".java") ? true : false;
    }

    Map<String, Integer> map(List<String> filenames){

        Map<String, Integer> result = new HashMap<>();

        for (String name : filenames) {
            try {
                if (this.check(name)) {
                    result.put(name, 1);
                } else {
                    result.put(name, 0);
                }

            } catch (FilenameException e) {
                result.put(name, -1);
            }
        }

        return result;

    }
    
}
