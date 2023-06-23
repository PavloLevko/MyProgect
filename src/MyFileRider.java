import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MyFileRider extends Main {
    static String set;
    static char[] charsArrayAfterRead = new char[100];

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






