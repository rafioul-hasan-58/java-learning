package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("mitu.txt");
            writer.write("Name: Sourav\n");
            writer.write("Department: CST\n");
            writer.write("Semester: 7th");
            writer.write("Result: 3.70");

            writer.close();


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
