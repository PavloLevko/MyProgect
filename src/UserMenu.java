import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class UserMenu  extends Main {
    private static final String USER_INPUT_PATH = "1";
    private static final String USER_INPUT_ENCRYPTED_TO_THREE = "2";
    private static final String USER_INPUT_ENCRYPTED_TO_SIX = "3";
    private static final String USER_INPUT_DECRYPTED_TO_THREE = "4";
    private static final String USER_INPUT_DECRYPTED_TO_SIX = "5";
    private static final String USER_INPUT_BRUTE_FORCE = "0";
   private static final String MAIN_MENU = "Hallo. You can to encrypt you text. \n" +
            "Please choose one of the methods. \n" +
            "1 - input path to file. \n" +
            "2 - encrypted shift by 3 characters.\n" +
            "3 - encrypted shift by 6 characters.\n" +
            "4 - decrypted the text 3 characters.\n"+
            "5 - decrypted the text 6 characters.\n" +
           "0 - BruteForce.\n" +
           "Press Enter to exit.";
    public static final String BRUTE_FORCE_INFO = "You select Brute Force.";
    private static final String START_METOD = "Please enter the file path.";
    public static boolean isRaning = true;
    public static String  pathScanner;
        public void mainMenu () throws FileNotFoundException {
            System.out.println(MAIN_MENU);
            Scanner scan = new Scanner(System.in);
            while (isRaning) {
                String inputText = scan.nextLine();
                switch (inputText) {
                    case USER_INPUT_PATH -> {
                        System.out.println(START_METOD);
                        pathScanner = scan.nextLine();
                        PathCheck pathCheck = new PathCheck();
                        pathCheck.checkedPath(pathScanner);
                        break;
                    }
                    case USER_INPUT_ENCRYPTED_TO_THREE -> {
                        EncryptedToThree encryptedToThree = new EncryptedToThree();
                        encryptedToThree.encryptedToThree(MyFileRider.charsArrayAfterRead);
                        break;
                    }
                    case USER_INPUT_ENCRYPTED_TO_SIX -> {
                        EncryptedToSix encryptedToSix = new EncryptedToSix();
                        encryptedToSix.encryptedToSix(MyFileRider.charsArrayAfterRead);
                        break;
                    }
                    case USER_INPUT_DECRYPTED_TO_THREE -> {
                        DecryptThree decryptThree = new DecryptThree();
                        decryptThree.decryptedToThree(EncryptedToThree.arrayAfterEncrypted);
                        break;
                    }
                    case USER_INPUT_DECRYPTED_TO_SIX -> {
                        DecryptSix decryptSix = new DecryptSix();
                        decryptSix.decryptedToSix(EncryptedToSix.arrayAfterEncrypted);
                        break;
                    }
                    case USER_INPUT_BRUTE_FORCE -> {
                        PathCheck pathCheck = new PathCheck();
                        BruteForce bruteForce = new BruteForce();
                        System.out.println(BRUTE_FORCE_INFO);
                        System.out.println(START_METOD);
                        pathScanner = scan.nextLine();
                        pathCheck.checkedPath(pathScanner);
                        bruteForce.bruteForse(MyFileRider.charsArrayAfterRead);
                        bruteForce.selectDecryptMetod(BruteForce.getValueSpaceThree(),BruteForce.getValueSpaceSix());
                    }
                    default -> {
                        System.out.println("Program is finish.");
                        return;
                    }
                }
            }
        }
}