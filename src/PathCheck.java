import java.io.File;
import java.io.FileNotFoundException;
public class PathCheck extends MyFileRider {
    private static final String IS_EXISTS = "Correct path to file. Start reading...";
    private static final String WRONG_PATH = "You input wrong path to file";
    public static UserMenu userMenu = new UserMenu();
  public static File file = new File(userMenu.pathScanner);
    public String checkedPath(String path) throws FileNotFoundException {
        MyFileRider myFileRider = new MyFileRider();
        if (file.exists()) {
            System.out.println(IS_EXISTS);
            myFileRider.readFile(file);
        } else   {
            System.out.println(WRONG_PATH);
        }
        return path;
    }
}