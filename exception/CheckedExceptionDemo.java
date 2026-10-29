package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionDemo {

    // 1. Reading an existing file using try-catch
    public static void readExistingFile() {
        File file = new File("hello.txt");

        try {
            // Checked exception: compiler forces us to handle FileNotFoundException
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println("File content: " + scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: File was not found!");
        }
    }

    // 2. Reading a non-existing file to see the catch block in action
    public static void readMissingFile() {
        File file = new File("missing_file.txt");

        try {
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: missing_file.txt does not exist!");
        }
    }

    // 3. Using the 'throws' keyword instead of try-catch
    public static void readFileWithThrows() throws FileNotFoundException {
        File file = new File("another_missing.txt");
        // Passes responsibility to the caller method
        FileReader reader = new FileReader(file);
    }

    public static void main(String[] args) {
        System.out.println("--- Checked Exception Demo ---");

        // 1. Reads 'hello.txt' successfully
        readExistingFile();

        // 2. Handles missing file internally with try-catch
        readMissingFile();

        // 3. Calls method that declares 'throws', caller handles it with try-catch
        try {
            readFileWithThrows();
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception from readFileWithThrows()!");
        }

        System.out.println("Program finished successfully!");
    }
}
