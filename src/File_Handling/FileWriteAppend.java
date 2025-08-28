package File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileWriteAppend {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("DataFile2.txt");
        
       
        Files.createFile(filePath);
        System.out.println("File Created");
        
    
        FileWriter fw = new FileWriter(filePath.toFile());
        fw.write("First line\n");
        fw.write("Second line\n");
        fw.close();
        
        Files.write(filePath, 
                   Arrays.asList("Fourth line (appended)", "Fifth line (appended)"), 
                   StandardOpenOption.APPEND);
        System.out.println("data appended");
        
    }
}