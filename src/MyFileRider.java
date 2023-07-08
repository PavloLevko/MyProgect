import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class MyFileRider extends Main {
    private static final int buferValue = 100;
    static char[] charsArrayAfterRead = new char[buferValue];
    public static char[] readFile(File pathScanner) throws FileNotFoundException {
        try (FileReader reader = new FileReader(PathCheck.file)) {
            reader.read(charsArrayAfterRead);
            System.out.println(charsArrayAfterRead);
            System.out.println("Read is complyte. ");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return charsArrayAfterRead;
    }
}