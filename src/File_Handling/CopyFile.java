package File_Handling;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("Sample121.txt");
		Files.createFile(path);
		System.out.println("File Created");
		
		//copy file
		Path copypath=Paths.get("Samplecopy1.txt");
		Files.copy(path, copypath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied");
		
		//Move File
		Path movedPath=Paths.get("movedfile1.txt");
		Files.move(copypath, movedPath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File moved");
		
		//Delete File
		Files.deleteIfExists(movedPath);
		Files.deleteIfExists(path);
		System.out.println("File deleted");
		
	}

}















