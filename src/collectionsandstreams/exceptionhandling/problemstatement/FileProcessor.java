package collectionsandstreams.exceptionhandling.problemstatement;

import java.io.*;
import java.util.*;

public class FileProcessor {
    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
            }
        }
    }

    public static void main(String[] args) {
        List<String> files = Arrays.asList("file1.txt", "file2.txt");
        new FileProcessor().processFiles(files);
    }
}


