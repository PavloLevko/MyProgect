import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyFileRider extends Main {


    public static File file = new File("/Users/macbook/IdeaProjects/MyProject/src/test.txt");


    public static char[] readFile(Scanner pathScanner) throws FileNotFoundException {
        char[] charsArrayAfterRead = new char[100];

        try (FileReader reader = new FileReader(file)) {
            reader.read(charsArrayAfterRead);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return charsArrayAfterRead;
    }
}






