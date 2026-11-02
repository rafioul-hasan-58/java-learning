package file;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {
        try {
            File file = new File("mitu.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
