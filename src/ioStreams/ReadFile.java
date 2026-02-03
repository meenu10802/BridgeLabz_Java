package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) {
        // The try-with-resources statement ensures the FileInputStream is closed automatically
        try(FileInputStream input = new FileInputStream("sample.txt")){
            FileOutputStream  output = new FileOutputStream("output.txt");
            int byteData;
            while((byteData=input.read())!=-1){
                output.write(byteData);
            }
        }
        catch(IOException e){
            System.out.println("Error occured "+ e);
        }
    }
}
