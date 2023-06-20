import java.nio.file.Path;

public class PathCheck extends MyFileRider {

    private static final String IS_EXISTS = "Correct path to file.";
    private static final String WRONG_PATH = "You input wrong path to file";


    public static void checkedPath (String path){

       if (MyFileRider.file.exists()){
           System.out.println(IS_EXISTS);
       }else{
           System.out.println(WRONG_PATH);
       }

    }
}
