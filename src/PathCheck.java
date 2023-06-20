import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

public class PathCheck extends MyFileRider {

    private static final String IS_EXISTS = "Correct path to file. Start reading...";
    private static final String WRONG_PATH = "You input wrong path to file";
    public static File file = new File("/Users/macbook/IdeaProjects/MyProject/src/test.txt");


    public static String checkedPath (String path) throws FileNotFoundException {

       if (file.exists()){
           System.out.println(IS_EXISTS);
           MyFileRider.readFile(file);

       }else{
           System.out.println(WRONG_PATH);
       }
return path;
    }
}
