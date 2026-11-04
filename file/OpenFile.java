package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile {

    public static void main(String[] args) {

        try {
            File file = new File("hello.txt");

            Scanner reader = new Scanner(file);

            System.out.println("File opened successfully!");

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found!");

        }
    }
}
