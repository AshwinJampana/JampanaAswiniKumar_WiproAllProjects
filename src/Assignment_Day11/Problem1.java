package Assignment_Day11;

import java.io.File;
import java.io.FilenameFilter;

public class Problem1 {
    public static void main(String[] args) {
        String directoryPath = "."; 
        try {
            File directory = new File(directoryPath);
            System.out.println("All files in directory:");
            File[] allFiles = directory.listFiles();
            if (allFiles != null) {
                for (File file : allFiles) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            }
            
            
            System.out.println("-------------------------------------");
            System.out.println(".txt files ");
            FilenameFilter txtFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".txt");
                }
            };
            
            File[] txtFiles = directory.listFiles(txtFilter);
            if (txtFiles != null) {
                for (File file : txtFiles) {
                    System.out.println(file.getName());
                }
            }
            
        } catch (Exception e) {
            System.out.println( e);
        }
    }
}