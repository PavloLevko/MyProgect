import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileRider extends Main {


    public static File file = new File("test.txt");
    // Коли тут вводжу PATH одразу зявляється помилка NullPointException


    public MyFileRider() throws FileNotFoundException, NullPointerException {
        try (FileReader reader = new FileReader(UserMenu.PATH)) {
            char[] charBufer = new char[100];
            reader.read(charBufer);
            for (char c : charBufer) {
                System.out.println(c);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}






