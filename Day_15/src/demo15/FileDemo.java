package demo15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        FileReader filereader = null;
        try {
            File file = new File("demo.txt");
            filereader = new FileReader(file);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("The file is not there.");
        } finally {
            try {
                if (filereader != null) {
                    filereader.close(); 
                    System.out.println("File closed.");
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }
}
