package demo15;

import java.util.*;
import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
